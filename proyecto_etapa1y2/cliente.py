import sys
from antlr.CoolLexer import *
from antlr.CoolParser import *
from antlr.CoolListener import *

from java.JavaLexer import *
from java.JavaParser import *
from java.JavaParserListener import *

from antlr4 import *


class Printer(JavaParserListener):
   
    def enterVariableDeclaratorId(self, ctx: JavaParser.VariableDeclaratorIdContext):
        print(ctx.IDENTIFIER())
    

def main():
    parser = JavaParser(CommonTokenStream(JavaLexer(FileStream("test.java"))))
    tree = parser.compilationUnit()
    printer = Printer()

    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    main()
