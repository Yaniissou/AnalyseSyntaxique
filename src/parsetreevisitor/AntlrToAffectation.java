package parsetreevisitor;

import antlr.ArrayOperationsBaseVisitor;
import antlr.ArrayOperationsParser;
import model.Affectation;
import model.SimpleOp;
import model.VariableDeclaration;

import java.util.ArrayList;
import java.util.HashMap;
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
        final AntlrToSimpleOp antlrToSimpleOp = new AntlrToSimpleOp();

        final String id = ctx.getChild(0).getText();
        final SimpleOp simpleop = antlrToSimpleOp.visit(ctx.getChild(2));
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
        final int value = Integer.parseInt(ctx.getChild(2).getText());

        return new Affectation<>(id, value);
    }
}
