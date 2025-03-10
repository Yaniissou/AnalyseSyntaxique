package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

public class Max extends SimpleOp {

    public Max() {
        super(ResultType.INTEGER);
    }

    @Override
    public String toString() {
        return "max " + this.getData().toString();
    }

    @Override
    public Object accept(ArrayOperationsVisitor<?> visitor) {
        return visitor.visit(this);

    }
}
