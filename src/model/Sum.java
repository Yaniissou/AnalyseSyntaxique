package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

public class Sum extends SimpleOp {
    public Sum() {
        super();
    }

    @Override
    public String toString() {
        return "sum " + this.getData().toString();
    }

    @Override
    public Object accept(ArrayOperationsVisitor<?> visitor) {
        return visitor.visit(this);
    }
}
