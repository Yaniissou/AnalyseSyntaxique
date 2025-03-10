package parsetreevisitor;

import antlr.ArrayOperationsBaseVisitor;
import antlr.ArrayOperationsParser;
import model.Instruction;
import model.SimpleOp;
import model.VariableDeclaration;

import java.util.List;
import java.util.Map;

public class AntlrToInstruction extends ArrayOperationsBaseVisitor<Instruction> {

    public final Map<String, VariableDeclaration<?>> symbolTable;
    public final List<String> semanticErrors;

    public AntlrToInstruction(final Map<String, VariableDeclaration<?>> symbolTable, final List<String> semanticErrors){
        this.symbolTable = symbolTable;
        this.semanticErrors = semanticErrors;
    }

    @Override
    public SimpleOp visitSimpleopinstruction(ArrayOperationsParser.SimpleopinstructionContext ctx) {
        final AntlrToSimpleOp antlrToSimpleOp = new AntlrToSimpleOp();
        return antlrToSimpleOp.visit(ctx);
    }

    @Override
    public Instruction visitVardeclinstruction(ArrayOperationsParser.VardeclinstructionContext ctx) {
        final AntlrToVarDecl antlrToVarDecl = new AntlrToVarDecl(this.symbolTable, this.semanticErrors);
        return antlrToVarDecl.visit(ctx);
    }

    @Override
    public Instruction visitAffectationinstruction(ArrayOperationsParser.AffectationinstructionContext ctx) {
        final AntlrToAffectation antlrToAffectation = new AntlrToAffectation(this.symbolTable, this.semanticErrors);

        return antlrToAffectation.visit(ctx);
    }

    @Override
    public Instruction visitVaroutinstruction(ArrayOperationsParser.VaroutinstructionContext ctx) {
        final AntlrToVarOut antlrToVarOut = new AntlrToVarOut(this.symbolTable, this.semanticErrors);
        return antlrToVarOut.visit(ctx);
    }
}
