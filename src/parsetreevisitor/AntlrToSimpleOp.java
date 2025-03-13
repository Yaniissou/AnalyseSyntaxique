package parsetreevisitor;

import antlr.ArrayOperationsBaseVisitor;
import antlr.ArrayOperationsParser;
import model.*;

import java.util.ArrayList;

public class AntlrToSimpleOp extends ArrayOperationsBaseVisitor<SimpleOp> {


    @Override
    public SimpleOp visitMax(ArrayOperationsParser.MaxContext ctx) {
        final AntlrToArray antlrToArray = new AntlrToArray();
        final ArrayList<Integer> accept = ctx.getChild(1).accept(antlrToArray);
        final Max max = new Max();
        max.setData(accept);
        return max;

    }

    @Override
    public SimpleOp visitMin(ArrayOperationsParser.MinContext ctx) {
        final AntlrToArray antlrToArray = new AntlrToArray();
        final ArrayList<Integer> accept = ctx.getChild(1).accept(antlrToArray);

        final Min min = new Min();
        min.setData(accept);
        return min;
    }

    @Override
    public SimpleOp visitProd(ArrayOperationsParser.ProdContext ctx) {
        final AntlrToArray antlrToArray = new AntlrToArray();
        final ArrayList<Integer> accept = ctx.getChild(1).accept(antlrToArray);

        final Prod prod = new Prod();
        prod.setData(accept);
        return prod;
    }

    @Override
    public SimpleOp visitSort(ArrayOperationsParser.SortContext ctx) {
        final AntlrToArray antlrToArray = new AntlrToArray();
        final ArrayList<Integer> accept = ctx.getChild(1).accept(antlrToArray);

        final Sort sort = new Sort();
        sort.setData(accept);
        return sort;
    }

    @Override
    public SimpleOp visitSum(ArrayOperationsParser.SumContext ctx) {
        final AntlrToArray antlrToArray = new AntlrToArray();
        final ArrayList<Integer> accept = ctx.getChild(1).accept(antlrToArray);

        final Sum sum = new Sum();
        sum.setData(accept);
        return sum;
    }

    @Override
    public SimpleOp visitMed(ArrayOperationsParser.MedContext ctx) {
        final AntlrToArray antlrToArray = new AntlrToArray();
        final ArrayList<Integer> accept = ctx.getChild(1).accept(antlrToArray);

        final Median median = new Median();
        median.setData(accept);
        return median;
    }

    @Override
    public SimpleOp visitSecmax(ArrayOperationsParser.SecmaxContext ctx) {
        final AntlrToArray antlrToArray = new AntlrToArray();
        final ArrayList<Integer> accept = ctx.getChild(1).accept(antlrToArray);

        final SecondMax secondMax = new SecondMax();
        secondMax.setData(accept);
        return secondMax;
    }

    @Override
    public SimpleOp visitSecmin(ArrayOperationsParser.SecminContext ctx) {
        final AntlrToArray antlrToArray = new AntlrToArray();
        final ArrayList<Integer> accept = ctx.getChild(1).accept(antlrToArray);

        final SecondMin secondMin = new SecondMin();
        secondMin.setData(accept);
        return secondMin;
    }
}
