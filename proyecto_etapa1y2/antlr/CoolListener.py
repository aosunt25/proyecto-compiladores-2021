# Generated from c:\Users\A01339250\Documents\Programacion\proyecto-compiladores-2021\proyecto_etapa1y2\antlr\Cool.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CoolParser import CoolParser
else:
    from CoolParser import CoolParser

# This class defines a complete listener for a parse tree produced by CoolParser.
class CoolListener(ParseTreeListener):

    # Enter a parse tree produced by CoolParser#program.
    def enterProgram(self, ctx:CoolParser.ProgramContext):
        pass

    # Exit a parse tree produced by CoolParser#program.
    def exitProgram(self, ctx:CoolParser.ProgramContext):
        pass


    # Enter a parse tree produced by CoolParser#klass.
    def enterKlass(self, ctx:CoolParser.KlassContext):
        pass

    # Exit a parse tree produced by CoolParser#klass.
    def exitKlass(self, ctx:CoolParser.KlassContext):
        pass


    # Enter a parse tree produced by CoolParser#method.
    def enterMethod(self, ctx:CoolParser.MethodContext):
        pass

    # Exit a parse tree produced by CoolParser#method.
    def exitMethod(self, ctx:CoolParser.MethodContext):
        pass


    # Enter a parse tree produced by CoolParser#attribute.
    def enterAttribute(self, ctx:CoolParser.AttributeContext):
        pass

    # Exit a parse tree produced by CoolParser#attribute.
    def exitAttribute(self, ctx:CoolParser.AttributeContext):
        pass


    # Enter a parse tree produced by CoolParser#formal.
    def enterFormal(self, ctx:CoolParser.FormalContext):
        pass

    # Exit a parse tree produced by CoolParser#formal.
    def exitFormal(self, ctx:CoolParser.FormalContext):
        pass


    # Enter a parse tree produced by CoolParser#objectcall.
    def enterObjectcall(self, ctx:CoolParser.ObjectcallContext):
        pass

    # Exit a parse tree produced by CoolParser#objectcall.
    def exitObjectcall(self, ctx:CoolParser.ObjectcallContext):
        pass


    # Enter a parse tree produced by CoolParser#add.
    def enterAdd(self, ctx:CoolParser.AddContext):
        pass

    # Exit a parse tree produced by CoolParser#add.
    def exitAdd(self, ctx:CoolParser.AddContext):
        pass


    # Enter a parse tree produced by CoolParser#new.
    def enterNew(self, ctx:CoolParser.NewContext):
        pass

    # Exit a parse tree produced by CoolParser#new.
    def exitNew(self, ctx:CoolParser.NewContext):
        pass


    # Enter a parse tree produced by CoolParser#minus.
    def enterMinus(self, ctx:CoolParser.MinusContext):
        pass

    # Exit a parse tree produced by CoolParser#minus.
    def exitMinus(self, ctx:CoolParser.MinusContext):
        pass


    # Enter a parse tree produced by CoolParser#simplecall.
    def enterSimplecall(self, ctx:CoolParser.SimplecallContext):
        pass

    # Exit a parse tree produced by CoolParser#simplecall.
    def exitSimplecall(self, ctx:CoolParser.SimplecallContext):
        pass


    # Enter a parse tree produced by CoolParser#isvoid.
    def enterIsvoid(self, ctx:CoolParser.IsvoidContext):
        pass

    # Exit a parse tree produced by CoolParser#isvoid.
    def exitIsvoid(self, ctx:CoolParser.IsvoidContext):
        pass


    # Enter a parse tree produced by CoolParser#assignment.
    def enterAssignment(self, ctx:CoolParser.AssignmentContext):
        pass

    # Exit a parse tree produced by CoolParser#assignment.
    def exitAssignment(self, ctx:CoolParser.AssignmentContext):
        pass


    # Enter a parse tree produced by CoolParser#while.
    def enterWhile(self, ctx:CoolParser.WhileContext):
        pass

    # Exit a parse tree produced by CoolParser#while.
    def exitWhile(self, ctx:CoolParser.WhileContext):
        pass


    # Enter a parse tree produced by CoolParser#division.
    def enterDivision(self, ctx:CoolParser.DivisionContext):
        pass

    # Exit a parse tree produced by CoolParser#division.
    def exitDivision(self, ctx:CoolParser.DivisionContext):
        pass


    # Enter a parse tree produced by CoolParser#equal.
    def enterEqual(self, ctx:CoolParser.EqualContext):
        pass

    # Exit a parse tree produced by CoolParser#equal.
    def exitEqual(self, ctx:CoolParser.EqualContext):
        pass


    # Enter a parse tree produced by CoolParser#negative.
    def enterNegative(self, ctx:CoolParser.NegativeContext):
        pass

    # Exit a parse tree produced by CoolParser#negative.
    def exitNegative(self, ctx:CoolParser.NegativeContext):
        pass


    # Enter a parse tree produced by CoolParser#boolNot.
    def enterBoolNot(self, ctx:CoolParser.BoolNotContext):
        pass

    # Exit a parse tree produced by CoolParser#boolNot.
    def exitBoolNot(self, ctx:CoolParser.BoolNotContext):
        pass


    # Enter a parse tree produced by CoolParser#at.
    def enterAt(self, ctx:CoolParser.AtContext):
        pass

    # Exit a parse tree produced by CoolParser#at.
    def exitAt(self, ctx:CoolParser.AtContext):
        pass


    # Enter a parse tree produced by CoolParser#lessThan.
    def enterLessThan(self, ctx:CoolParser.LessThanContext):
        pass

    # Exit a parse tree produced by CoolParser#lessThan.
    def exitLessThan(self, ctx:CoolParser.LessThanContext):
        pass


    # Enter a parse tree produced by CoolParser#block.
    def enterBlock(self, ctx:CoolParser.BlockContext):
        pass

    # Exit a parse tree produced by CoolParser#block.
    def exitBlock(self, ctx:CoolParser.BlockContext):
        pass


    # Enter a parse tree produced by CoolParser#let.
    def enterLet(self, ctx:CoolParser.LetContext):
        pass

    # Exit a parse tree produced by CoolParser#let.
    def exitLet(self, ctx:CoolParser.LetContext):
        pass


    # Enter a parse tree produced by CoolParser#lessEqual.
    def enterLessEqual(self, ctx:CoolParser.LessEqualContext):
        pass

    # Exit a parse tree produced by CoolParser#lessEqual.
    def exitLessEqual(self, ctx:CoolParser.LessEqualContext):
        pass


    # Enter a parse tree produced by CoolParser#multiply.
    def enterMultiply(self, ctx:CoolParser.MultiplyContext):
        pass

    # Exit a parse tree produced by CoolParser#multiply.
    def exitMultiply(self, ctx:CoolParser.MultiplyContext):
        pass


    # Enter a parse tree produced by CoolParser#if.
    def enterIf(self, ctx:CoolParser.IfContext):
        pass

    # Exit a parse tree produced by CoolParser#if.
    def exitIf(self, ctx:CoolParser.IfContext):
        pass


    # Enter a parse tree produced by CoolParser#case.
    def enterCase(self, ctx:CoolParser.CaseContext):
        pass

    # Exit a parse tree produced by CoolParser#case.
    def exitCase(self, ctx:CoolParser.CaseContext):
        pass


    # Enter a parse tree produced by CoolParser#case_stat.
    def enterCase_stat(self, ctx:CoolParser.Case_statContext):
        pass

    # Exit a parse tree produced by CoolParser#case_stat.
    def exitCase_stat(self, ctx:CoolParser.Case_statContext):
        pass


    # Enter a parse tree produced by CoolParser#let_decl.
    def enterLet_decl(self, ctx:CoolParser.Let_declContext):
        pass

    # Exit a parse tree produced by CoolParser#let_decl.
    def exitLet_decl(self, ctx:CoolParser.Let_declContext):
        pass


    # Enter a parse tree produced by CoolParser#primary.
    def enterPrimary(self, ctx:CoolParser.PrimaryContext):
        pass

    # Exit a parse tree produced by CoolParser#primary.
    def exitPrimary(self, ctx:CoolParser.PrimaryContext):
        pass



del CoolParser