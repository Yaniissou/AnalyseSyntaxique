package apps;

import antlr.ArrayOperationsLexer;
import antlr.ArrayOperationsParser;
import listeners.SyntaxErrorListener;
import model.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parsetreevisitor.AntlrToProgram;

import java.io.IOException;

public class SimpleOpApp {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Usage: file name\n");
        } else {
            String fileName = args[0];
            // get the parser with the helper method
            ArrayOperationsParser parser = getParser(fileName);
            // build the parse tree (begin parsing at input rule ‘exprs’)
            ParseTree tree = parser.program();
            if (SyntaxErrorListener.hasError) {

            } else {
                // build the visitor for the first named rule
                AntlrToProgram inputVisitor = new AntlrToProgram();



                // use this visitor to visit the parse tree
                // this visitor produce a Model object
                Program result = inputVisitor.visit(tree);
                for (String semanticError : inputVisitor.semanticErrors) {
                    System.out.println(semanticError);
                }

                if (!inputVisitor.semanticErrors.isEmpty()) return; //Stop the code if they're semantic errors
                //Print the model
                System.out.println("The model printed using a pretty print of the Model classes:");
                System.out.println(result.instructions);
            }

        }
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
            parser.removeErrorListeners();
            parser.addErrorListener(new SyntaxErrorListener());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return parser;
    }

}