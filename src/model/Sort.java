package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

public class Sort extends SimpleOp {

    public Sort() {
        super(ResultType.ARRAY);
    }

    @Override
    public String toString() {
        return "sort " + this.getData().toString();
    }

    @Override
    public Object accept(ArrayOperationsVisitor<?> visitor) {
        return visitor.visit(this);

    }
}
