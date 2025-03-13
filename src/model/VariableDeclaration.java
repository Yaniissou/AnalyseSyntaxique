package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

public class VariableDeclaration<T> extends Instruction {

    private String id;
    private String type;
    private T value;

    public VariableDeclaration(final String id, final String type){
        this.id = id;
        this.type = type;
        this.value = null;
    }

    public VariableDeclaration(final String id, final String type, final T value){
        this.id = id;
        this.type = type;
        this.value = value;
    }
    @Override
    public Object accept(ArrayOperationsVisitor<?> visitor) {
        return visitor.visit(this);
    }

    public String getId() {
        return id;
    }

    public T getValue() {
        return this.value;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return id + " " + type + " " + value;
    }
}
