package model;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Instruction> instructions;

    public Program() {
        instructions = new ArrayList<>();
    }

    public void addInstruction(Instruction instruction) {
        instructions.add(instruction);
    }
}
