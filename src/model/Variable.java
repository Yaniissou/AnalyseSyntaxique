package model;

public class Variable<V> {
    /**
     * This class is for the symbolTable used
     * we could have used the VariableDeclaration
     * we defined this one for the purpose of readability
     * and because the toString methods are not the same
     */
// a variable has an ID, a type and a value
    private final String ID;
    private final String type;
    private V value;


    // construct a variable with no initial value (null)
    public Variable(String ID, String type) {
        this(ID, type, null);
    }


    // construct a variable with initial value
    public Variable(String ID, String type, V value) {
        this.ID = ID;
        this.type = type;
        this.value = value;
    }

    public String getID() {
        return ID;
    }

    public String getType() {
        return type;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    // for the purpose of the evaluation of the program while printing the symbols table
    @Override
    public String toString() {
        return String.format("Variable{ID=%s, type=%s, value=%s}\n", ID, type, value);
    }
}