package apps;

import antlr.ArrayOperationsLexer;
import antlr.ArrayOperationsParser;
import evaluationWithVisitor.ArrayOperationsDoInterpretVisitor;
import model.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parsetreevisitor.AntlrToProgram;

import java.io.IOException;

public class ComputeOpApp {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Usage: file name\n");
        } else {
            String fileName = args[0];
            // get the parser with the helper method
            ArrayOperationsParser parser = getParser(fileName);
            // build the parse tree (begin parsing at input rule ‘exprs’)
            ParseTree tree = parser.program();
            // build the visitor for the first named rule
            AntlrToProgram inputVisitor = new AntlrToProgram();
        // use this visitor to visit the parse tree
        // this visitor produce a Model object
            Program result = inputVisitor.visit(tree);
            ArrayOperationsDoInterpretVisitor evaluatevisitor = new ArrayOperationsDoInterpretVisitor();
        // compute the model to get the stack,
        // the final result is at the top of the stack
        // the computation is done through an explicit call to the
        // visit method of the commandeLineModel
            evaluatevisitor.visit(result);
        }

        // helper method, the same for every grammar
        /*
         * Here the type of parser and lexer are specific to the
         * grammar name expressionprefixe.g4
         */


    }

    private static ArrayOperationsParser getParser(String fileName) {
        ArrayOperationsParser parser = null;

        try {
            CharStream input = CharStreams.fromFileName(fileName);
            // build the lexer (tokenizer)
            ArrayOperationsLexer lexer = new ArrayOperationsLexer(input);
            // produce the list of tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // initialize parser on the tokens
            parser = new ArrayOperationsParser(tokens);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return parser;
    }
}
