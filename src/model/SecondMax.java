package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

public class SecondMax extends SimpleOp{

    public SecondMax() {
        super(ResultType.INTEGER);
    }

    @Override
    public Object accept(ArrayOperationsVisitor<?> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Second Max " + this.getData().toString();
    }

}
