from antlr.CoolListener import CoolListener
from antlr.CoolParser import CoolParser

class Typecheck(CoolListener):
    typeTable = {}
    varTable = {}

    def enterAtribute(self, ctx: CoolParser.AtributeContext):
        self.varTable[ctx.ID().getText()] = ctx.TYPE().getText()    

    def exitInteger(self, ctx: CoolParser.IntegerContext):
        ctx.type = "Int"
        self.typeTable[ctx] = "Int"
    
    def exitString(self, ctx: CoolParser.StringContext):
        ctx.type = "String"
        self.typeTable[ctx] = "String"
    
    def exitBool(self, ctx:CoolParser.BoolContext):
        ctx.type = "Bool"
        self.typeTable[ctx] = "Bool"

    def exitBase(self, ctx: CoolParser.BaseContext):
        ctx.type = ctx.getChild(0).type
        self.typeTable[ctx] = self.typeTable[ctx.getChild(0)]

    def exitObject(self, ctx: CoolParser.ObjectContext):
        ctx.type = self.varTable[ctx.ID().getText()]
        self.typeTable[ctx] = self.varTable[ctx.ID().getText()]

    def exitAdd(self, ctx: CoolParser.AddContext):
        if self.typeTable[ctx.expr(0)] == "Int" and self.typeTable[ctx.expr(1)] == "Int":
            self.typeTable[ctx] = "Int"
        else:
            raise Exception("Type error")

    def exitMult(self, ctx: CoolParser.MultContext):
        if self.typeTable[ctx.expr(0)] == "Int" and self.typeTable[ctx.expr(1)] == "Int":
            self.typeTable[ctx] = "Int"
        else:
            raise Exception("Type error")
    
    def exitDiv(self, ctx: CoolParser.DivContext):    
        if self.typeTable[ctx.expr(0)] == "Int" and self.typeTable[ctx.expr(1)] == "Int":
            self.typeTable[ctx] = "Int"
        else:
            raise Exception("Type error")
    
    def exitSub(self, ctx: CoolParser.SubContext):     
        if self.typeTable[ctx.expr(0)] == "Int" and self.typeTable[ctx.expr(1)] == "Int":
            self.typeTable[ctx] = "Int"
        else:
            raise Exception("Type error")

    def exitLt(self, ctx: CoolParser.LtContext):
        if self.typeTable[ctx.expr(0)] == "Int" and self.typeTable[ctx.expr(1)] == "Int":
            self.typeTable[ctx] = "Int"
        else:
            raise Exception("Type error")
    
    def exitLe(self, ctx: CoolParser.LeContext):
        if self.typeTable[ctx.expr(0)] == "Int" and self.typeTable[ctx.expr(1)] == "Int":
            self.typeTable[ctx] = "Int"
        else:
            raise Exception("Type error")
    
    def exitEq(self, ctx: CoolParser.EqContext):
        if self.typeTable[ctx.expr(0)] == "Int" and self.typeTable[ctx.expr(1)] == "Int":
            self.typeTable[ctx] = "Int"
        else:
            raise Exception("Type error")
    
    def exitNot(self, ctx: CoolParser.NotContext):
        if self.typeTable[ctx.expr()] == "Bool":
            self.typeTable[ctx] = "Bool"
        else:
            raise Exception("Type error")
    
    def exitIf(self, ctx: CoolParser.IfContext):
        print("hola")
    
    

        