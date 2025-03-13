package parsetreevisitor;

import antlr.ArrayOperationsBaseVisitor;
import antlr.ArrayOperationsParser;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AntlrToSimpleOp extends ArrayOperationsBaseVisitor<SimpleOp> {

    final Map<String, VariableDeclaration<?>> symbolTable;
    final List<String> semanticErrors;

    public AntlrToSimpleOp(Map<String, VariableDeclaration<?>> symbolTable, List<String> semanticErrors) {
        this.symbolTable = symbolTable;
        this.semanticErrors = semanticErrors;
    }

    @Override
    public SimpleOp visitMax(ArrayOperationsParser.MaxContext ctx) {
        return createSimpleOp(new Max(), ctx);
    }

    @Override
    public SimpleOp visitMin(ArrayOperationsParser.MinContext ctx) {
        return createSimpleOp(new Min(), ctx);
    }

    @Override
    public SimpleOp visitProd(ArrayOperationsParser.ProdContext ctx) {
        return createSimpleOp(new Prod(), ctx);
    }

    @Override
    public SimpleOp visitSort(ArrayOperationsParser.SortContext ctx) {
        return createSimpleOp(new Sort(), ctx);
    }

    @Override
    public SimpleOp visitSum(ArrayOperationsParser.SumContext ctx) {
        return createSimpleOp(new Sum(), ctx);
    }

    @Override
    public SimpleOp visitMed(ArrayOperationsParser.MedContext ctx) {
        return createSimpleOp(new Median(), ctx);
    }

    @Override
    public SimpleOp visitSecmax(ArrayOperationsParser.SecmaxContext ctx) {
        return createSimpleOp(new SecondMax(), ctx);
    }

    @Override
    public SimpleOp visitSecmin(ArrayOperationsParser.SecminContext ctx) {
        return createSimpleOp(new SecondMin(), ctx);
    }

    /**
     * Generic function for every visit function
     */
    private SimpleOp createSimpleOp(SimpleOp operation, ArrayOperationsParser.SimpleopContext ctx) {
        if (ctx.getChild(1).getChildCount() > 0) {
            // Explicit array case
            final AntlrToArray antlrToArray = new AntlrToArray();
            final ArrayList<Integer> data = ctx.getChild(1).accept(antlrToArray);
            operation.setData(data);
        } else {
            // ID case (var)
            String variableName = ctx.getChild(1).getText();
            VariableDeclaration<?> variableDeclaration = this.symbolTable.get(variableName);

            //Semantic error handling: Variable must be declared
            if (variableDeclaration == null) {
                this.semanticErrors.add("Variable " + variableName + " not declared");
                return null;
            }

            //Semantic error handling: Variable must be an array
            if (!variableDeclaration.getType().equals("array")) {
                this.semanticErrors.add("Variable " + variableName + " is not an array");
                return null;
            }

            final ArrayList<Integer> value = (ArrayList<Integer>) variableDeclaration.getValue();
            operation.setData(value);
        }
        return operation;

    }
}
