package parsetreevisitor;

import antlr.ArrayOperationsBaseVisitor;
import antlr.ArrayOperationsParser;

import java.util.ArrayList;

public class AntlrToArray extends ArrayOperationsBaseVisitor<ArrayList<Integer>> {

    @Override
    public ArrayList<Integer> visitArray(ArrayOperationsParser.ArrayContext ctx) {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 1; i < ctx.children.size() - 1; i+=2){
            array.add(Integer.parseInt(ctx.getChild(i).getText()));
        }

        return array;
    }
}
