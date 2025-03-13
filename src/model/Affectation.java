package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

public class Affectation<T> extends Instruction {

    private String id;
    private T value;

    public Affectation(final String id, final T value){
        this.id = id;
        this.value = value;
    }
    public T getValue() {
        return value;
    }

    public String getId() {
        return id;
    }

    @Override
    public Object accept(ArrayOperationsVisitor<?> visitor) {
        return visitor.visit(this);
    }
}
