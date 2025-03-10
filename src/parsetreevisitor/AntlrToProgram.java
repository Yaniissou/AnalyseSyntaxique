package parsetreevisitor;

import antlr.ArrayOperationsBaseVisitor;
import antlr.ArrayOperationsParser;
import model.Program;
import model.VariableDeclaration;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AntlrToProgram extends ArrayOperationsBaseVisitor<Program> {

    public final Map<String, VariableDeclaration<?>> symbolTable;
    public final List<String> semanticErrors;

    public AntlrToProgram(){
        this.symbolTable = new HashMap<>();
        this.semanticErrors = new ArrayList<>();
    }

    @Override
    public Program visitProgram(ArrayOperationsParser.ProgramContext ctx) {
        // program : (simpleop)+ EOF;

        Program program = new Program();
        AntlrToSimpleOp visitor = new AntlrToSimpleOp();

        for (int i = 0; i < ctx.children.size()-1; i++) {
            ParseTree currentParseTree = ctx.children.get(i);
            program.addInstruction(currentParseTree.accept(visitor));
        }
        return program;
    }
}
