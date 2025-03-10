package model;

import java.util.ArrayList;

/**
 * Root class for simple operations
 */
public abstract class SimpleOp extends Instruction {

    // operator not needed because instruction name tells the name of the operator
    // array the operation is performed on
    private ArrayList<Integer> data;

    public SimpleOp() {
        data = new ArrayList<>();
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }

    public ArrayList<Integer> getData() {
        return data;
    }
}
