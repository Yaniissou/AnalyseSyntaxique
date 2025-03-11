package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

public class Median extends SimpleOp {
    public Median() {
        super(ResultType.INTEGER);
    }

    @Override
    public Object accept(ArrayOperationsVisitor<?> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Median " + this.getData().toString();
    }
}
