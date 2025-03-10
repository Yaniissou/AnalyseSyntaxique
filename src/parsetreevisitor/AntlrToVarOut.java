package parsetreevisitor;

import antlr.ArrayOperationsBaseVisitor;
import antlr.ArrayOperationsParser;
import model.VarOut;
import model.VariableDeclaration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AntlrToVarOut extends ArrayOperationsBaseVisitor<VarOut> {

    public final Map<String, VariableDeclaration<?>> symbolTable;
    public final List<String> semanticErrors;

    public AntlrToVarOut(final Map<String, VariableDeclaration<?>> symbolTable, final List<String> semanticErrors) {
        this.symbolTable = symbolTable;
        this.semanticErrors = semanticErrors;
    }

    /**
     * ID    ';'
     *
     * @param ctx the parse tree
     */
    @Override
    public VarOut visitVarout(ArrayOperationsParser.VaroutContext ctx) {
        final String id = ctx.getChild(0).getText();

        if (!symbolTable.containsKey(id)) {
            semanticErrors.add("Id " + id + "doesn't exists");
            return null;
        }
        return new VarOut(id);

    }
}
