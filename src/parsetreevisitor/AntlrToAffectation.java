package parsetreevisitor;

import antlr.ArrayOperationsBaseVisitor;
import antlr.ArrayOperationsParser;
import model.Affectation;
import model.SimpleOp;
import model.VariableDeclaration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AntlrToAffectation extends ArrayOperationsBaseVisitor<Affectation<?>> {

    public final Map<String, VariableDeclaration<?>> symbolTable;
    public final List<String> semanticErrors;

    public AntlrToAffectation(final Map<String, VariableDeclaration<?>> symbolTable, List<String> semanticErrors){
        this.symbolTable = symbolTable;
        this.semanticErrors = semanticErrors;
    }

    /**
     * ID '=' simpleop
     * @param ctx the parse tree
     */
    @Override
    public Affectation<?> visitAffectsimpleop(ArrayOperationsParser.AffectsimpleopContext ctx) {
        final AntlrToSimpleOp antlrToSimpleOp = new AntlrToSimpleOp(symbolTable, semanticErrors);

        final String id = ctx.getChild(0).getText();

        //Semantic error handling: Value must be a declared variable
        if (!symbolTable.containsKey(id)) {
            semanticErrors.add("Var " + id + " must be declared");
            return null;
        }

        final SimpleOp simpleop = antlrToSimpleOp.visit(ctx.getChild(2));
        final String valueType = simpleop.getResultType().getTextType();
        String varType = symbolTable.get(id).getType();

        //Semantic error handling: value and variable type must be the same
        if (!varType.equals(valueType)) {
            semanticErrors.add("Trying to set a " + valueType + " to a " + varType + " type variable");
            return null;
        }

         return new Affectation<>(id, simpleop);
    }

    /**
     * ID '=' array ';'
     * @param ctx the parse tree
     */
    @Override
    public Affectation<?> visitAffectarray(ArrayOperationsParser.AffectarrayContext ctx) {
        final AntlrToArray antlrToArray = new AntlrToArray();

        final String id = ctx.getChild(0).getText();

        //Semantic error handling: Value must be a declared variable
        if (!symbolTable.containsKey(id)) {
            semanticErrors.add("Var " + id + " must be declared");
            return null;
        }

        String varType = symbolTable.get(id).getType();
        //Semantic error handling: variable type must be an array
        if (!varType.equals("array")) {
            semanticErrors.add(varType + " must be an array");
            return null;
        }
        final ArrayList<Integer> array = antlrToArray.visit(ctx.getChild(2));

        return new Affectation<>(id, array);
    }

    /**
     * ID '=' INT ';'
     * @param ctx the parse tree
     */
    @Override
    public Affectation<?> visitAffectint(ArrayOperationsParser.AffectintContext ctx) {
        final String id = ctx.getChild(0).getText();

        //Semantic error handling: Value must be a declared variable
        if (!symbolTable.containsKey(id)) {
            semanticErrors.add("Var " + id + " must be declared");
            return null;
        }

        String varType = symbolTable.get(id).getType();
        //Semantic error handling: variable type must be an int
        if (!varType.equals("int")) {
            semanticErrors.add(id + " must be an int");
            return null;
        }
        final int value = Integer.parseInt(ctx.getChild(2).getText());

        return new Affectation<>(id, value);
    }

    /**
     * ID '=' BOOL ';'
     *
     * @param ctx the parse tree
     */
    @Override
    public Affectation<?> visitAffectbool(ArrayOperationsParser.AffectboolContext ctx) {
        final String id = ctx.getChild(0).getText();

        //Semantic error handling: Value must be a declared variable
        if (!symbolTable.containsKey(id)) {
            semanticErrors.add("Var " + id + " must be declared");
            return null;
        }

        final String varType = symbolTable.get(id).getType();
        //Semantic error handling: variable type must be an int
        if (!varType.equals("bool")) {
            semanticErrors.add(varType + " must be a bool");
            return null;
        }

        final String boolType = ctx.getChild(2).getText();
        final boolean value = Boolean.parseBoolean(boolType);
        return new Affectation<>(id, value);
    }


}
