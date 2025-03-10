package parsetreevisitor;

import antlr.ArrayOperationsBaseVisitor;
import antlr.ArrayOperationsParser;
import model.VariableDeclaration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AntlrToVarDecl extends ArrayOperationsBaseVisitor<VariableDeclaration<Object>> {

    public final Map<String, VariableDeclaration<?>> symbolTable;
    public final List<String> semanticErrors;

    public AntlrToVarDecl(final Map<String, VariableDeclaration<?>> symbolTable, final List<String> semanticErrors){
        this.semanticErrors = semanticErrors;
        this.symbolTable = symbolTable;
    }

    /**
     * | ARRAY_TYPE ID '=' array ';' #initvararray
     * @param ctx the parse tree
     */
    @Override
    public VariableDeclaration<Object> visitInitvararray(ArrayOperationsParser.InitvararrayContext ctx) {
        final AntlrToArray antlrToArray = new AntlrToArray();

        final String arrayType = ctx.getChild(0).getText();
        final String id = ctx.getChild(1).getText();

        final ArrayList<Integer> array = antlrToArray.visit(ctx.getChild(3));

        final VariableDeclaration<Object> arrayListVariableDeclaration = new VariableDeclaration<>(id, arrayType, array);
        this.symbolTable.put(id, arrayListVariableDeclaration);
        return arrayListVariableDeclaration;
    }

    /**
     * ARRAY_TYPE ID ';'     #vararray
     * @param ctx the parse tree
     */
    @Override
    public VariableDeclaration<Object> visitVararray(ArrayOperationsParser.VararrayContext ctx) {
        final String arrayType = ctx.getChild(0).getText();
        final String id = ctx.getChild(1).getText();
        VariableDeclaration<Object> declaration = new VariableDeclaration<>(id, arrayType);
        this.symbolTable.put(id, declaration);
        return declaration;
    }

    /**
     * INT_TYPE ID ';'
     * @param ctx the parse tree
     */
    @Override
    public VariableDeclaration<Object> visitVarint(ArrayOperationsParser.VarintContext ctx) {
        final String intType = ctx.getChild(0).getText();
        final String id = ctx.getChild(1).getText();

        VariableDeclaration<Object> declaration = new VariableDeclaration<>(id, intType);
        this.symbolTable.put(id, declaration);
        return declaration;
    }

    /**
     * INT_TYPE ID '=' INT ';'
     * @param ctx the parse tree
     */
    @Override
    public VariableDeclaration<Object> visitInitvarint(ArrayOperationsParser.InitvarintContext ctx) {
        final String intType = ctx.getChild(0).getText();
        final String id = ctx.getChild(1).getText();
        final int value = Integer.parseInt(ctx.getChild(3).getText());

        final VariableDeclaration<Object> declaration = new VariableDeclaration<>(id, intType, value);
        this.symbolTable.put(id, declaration);
        return declaration;
    }
}
