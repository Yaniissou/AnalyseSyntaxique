package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

public class SecondMin extends SimpleOp {
    public SecondMin() {
        super(ResultType.INTEGER);
    }

    @Override
    public Object accept(ArrayOperationsVisitor<?> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Second Min " + this.getData().toString();
    }
}
