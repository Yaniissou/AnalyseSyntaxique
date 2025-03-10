package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

public class VarOut extends Instruction {

    private String id;

    public VarOut(final String id){
        this.id = id;
    }
    @Override
    public Object accept(ArrayOperationsVisitor<?> visitor) {
        return visitor.visit(this);
    }

    public String getId() {
        return id;
    }
}
