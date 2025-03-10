package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

/**
 * In case several types of instruction are developed
 */
public abstract class Instruction {
    public abstract Object accept(ArrayOperationsVisitor<?> visitor);

}
