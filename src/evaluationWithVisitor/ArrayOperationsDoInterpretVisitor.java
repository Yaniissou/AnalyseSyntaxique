package evaluationWithVisitor;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayOperationsDoInterpretVisitor implements ArrayOperationsVisitor<Object> {

    public final Map<String, Variable<?>> symbolTable;


    public ArrayOperationsDoInterpretVisitor(){
        this.symbolTable = new HashMap<>();
    }

    @Override
    public Void visit(Program program) {
        for (Instruction instruction : program.instructions) {
            Object accept = instruction.accept(this);
            System.out.println(instruction + " is " + accept);
        }
        return null;
    }

    @Override
    public Integer visit(Max max) {
        return Collections.max(max.getData());
    }

    @Override
    public Integer visit(Min min){
        return Collections.min(min.getData());

    }

    @Override
    public Integer visit(Prod prod) {
        return prod.getData().stream()
                .reduce((integer, integer2) -> integer * integer2)
                .orElse(null);
    }

    @Override
    public ArrayList<Integer> visit(Sort sort) {
        Collections.sort(sort.getData());
        return sort.getData();
    }

    @Override
    public Integer visit(Sum sum) {
        return sum.getData().stream()
                .reduce(Integer::sum)
                .orElse(null);
    }

    @Override
    public Object visit(VariableDeclaration<?> variableDeclaration) {
        final Variable<Object> variable = new Variable<>(variableDeclaration.getId(), variableDeclaration.getType());
        variable.setValue(variableDeclaration.getValue());
        symbolTable.put(variable.getID(), variable);

        return variable.getValue();
    }

    @Override
    public Object visit(Affectation<?> affectation) {
;        final Variable<Object> variable = ((Variable<Object>) symbolTable.get(affectation.getId()));
        final Object value;

        if (affectation.getValue() instanceof SimpleOp) {
            value = ((SimpleOp) affectation.getValue()).accept(this);
        }
        else {
            value = affectation.getValue();
        }

        variable.setValue(value);
        return value;
    }

    @Override
    public Object visit(VarOut varOut) {
        return symbolTable.get(varOut.getId()).getValue();
    }

    @Override
    public Object visit(Median median) {
        final ArrayList<Integer> data = median.getData();
        return data.get(data.size()/2);
    }

    @Override
    public Object visit(SecondMin secondMin) {
        // Return the second minimum value, handle the case where the list has less than 2 elements
        //Use a new ArrayList, since we want to sort the list for this case, and we don't want to modify the original list
        final ArrayList<Integer> data = new ArrayList<>(secondMin.getData());
        if (data.size() < 2) {
            return null;
        }
        Collections.sort(data);
        return data.get(1);

    }

    @Override
    public Object visit(SecondMax secondMax) {
        // Return the second maximum value, handle the case where the list has less than 2 elements
        final ArrayList<Integer> data = secondMax.getData();
        if (data.size() < 2) {
            return null;
        }
        return data.get(data.size()-2
        );
    }


}
