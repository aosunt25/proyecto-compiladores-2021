import sys
import unittest

from antlr4 import *
from antlr.CoolLexer import CoolLexer
from antlr.CoolParser import CoolParser
from antlr.CoolListener import CoolListener
from myexceptions import *


class Listener(CoolListener):
    # No Main
    tiene_main = False

    def enterKlass(self, ctx: CoolParser.KlassContext):
        if ctx.TYPE(0).getText() == "Main":
            self.tiene_main = True

        if ctx.TYPE(1) != None and (
            ctx.TYPE(1).getText() == "Bool"
            or ctx.TYPE(1).getText() == "String"
            or ctx.TYPE(1).getText() == "SELF_TYPE"
        ):
            raise InvalidInheritsException

        if ctx.TYPE(0).getText() == "Object":
            raise RedefineBasicClassException

        if ctx.TYPE(0).getText() == "Int":
            raise RedefineBasicClassException

        if ctx.TYPE(0).getText() == "SELF_TYPE":
            raise RedefineBasicClassException

    def enterFormal(self, ctx: CoolParser.FormalContext):
        if ctx.ID().getText() == "self":
            raise SelfVariableException

        if ctx.TYPE().getText() == "SELF_TYPE":
            raise SelftypeInvalidUseException

    def enterAtribute(self, ctx: CoolParser.AtributeContext):
        if ctx.ID().getText() == "self":
            raise SelfVariableException

    def enterLet(self, ctx: CoolParser.LetContext):
        if ctx.ID(0).getText() == "self":
            raise SelfVariableException

    def enterAssign(self, ctx: CoolParser.AssignContext):
        if ctx.ID().getText() == "self":
            raise SelfAssignmentException

    def exitProgram(self, ctx: CoolParser.ProgramContext):
        if not self.tiene_main:
            raise NoMainException


def parseCase(caseName):
    parser = CoolParser(
        CommonTokenStream(
            CoolLexer(FileStream("./resources/semantic/input/%s.cool" % caseName))
        )
    )
    return parser.program()


class CoolTests(unittest.TestCase):
    def setUp(self):
        self.walker = ParseTreeWalker()

    def test1(self):
        tree = parseCase("nomain")
        with self.assertRaises(NoMainException):
            print(self.walker.walk(Listener(), tree))

    def test2(self):
        tree = parseCase("badredefineint")
        with self.assertRaises(RedefineBasicClassException):
            self.walker.walk(Listener(), tree)

    def test3(self):
        tree = parseCase("anattributenamedself")
        with self.assertRaises(SelfVariableException):
            self.walker.walk(Listener(), tree)

    def test4(self):
        tree = parseCase("letself")
        with self.assertRaises(SelfVariableException):
            self.walker.walk(Listener(), tree)

    def test5(self):
        tree = parseCase("inheritsbool")
        with self.assertRaises(InvalidInheritsException):
            self.walker.walk(Listener(), tree)

    def test6(self):
        tree = parseCase("inheritsselftype")
        with self.assertRaises(InvalidInheritsException):
            self.walker.walk(Listener(), tree)

    def test7(self):
        tree = parseCase("inheritsstring")
        with self.assertRaises(InvalidInheritsException):
            self.walker.walk(Listener(), tree)

    def test8(self):
        tree = parseCase("redefinedobject")
        with self.assertRaises(RedefineBasicClassException):
            self.walker.walk(Listener(), tree)

    def test9(self):
        tree = parseCase("self-assignment")
        with self.assertRaises(SelfAssignmentException):
            self.walker.walk(Listener(), tree)

    def test10(self):
        tree = parseCase("selfinformalparameter")
        with self.assertRaises(SelfVariableException):
            self.walker.walk(Listener(), tree)

    def test11(self):
        tree = parseCase("selftyperedeclared")
        with self.assertRaises(RedefineBasicClassException):
            self.walker.walk(Listener(), tree)

    def test12(self):
        tree = parseCase("selftypeparameterposition")
        with self.assertRaises(SelftypeInvalidUseException):
            self.walker.walk(Listener(), tree)


if __name__ == "__main__":
    unittest.main()
