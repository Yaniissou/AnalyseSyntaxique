package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

public class Prod extends SimpleOp {

    public Prod() {
        super();
    }

    @Override
    public String toString() {
        return "prod " + this.getData().toString();
    }

    @Override
    public Object accept(ArrayOperationsVisitor<?> visitor) {
        return visitor.visit(this);
    }
}
