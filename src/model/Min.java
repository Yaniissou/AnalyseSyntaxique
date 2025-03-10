package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

public class Min extends SimpleOp {

    public Min() {
        super(ResultType.INTEGER);
    }

    @Override
    public String toString() {
        return "min " + this.getData().toString();
    }

    @Override
    public Object accept(ArrayOperationsVisitor<?> visitor) {
        return visitor.visit(this);
    }
}
