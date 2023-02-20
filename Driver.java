import org.antlr.v4.parse.*;
import org.antlr.v4.parse.ANTLRParser;

import org.antlr.v4. runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Driver {
    public static void main(String[] args) throws Exception {
// create a CharStream that reads from standard input
        CharStream charStream = CharStreams.fromFileName("/Users/sarahbaron/IdeaProjects/LittleLanguageCompiler/src/inputs/loop.micro");
// create a lexer that feeds off of input CharStream
        //Little lexer = new Little(charStream);

// create a buffer of tokens pulled from the lexer
        //CommonTokenStream tokens = new CommonTokenStream(lexer);
      //  Vocabulary vocabulary = lexer.getVocabulary();
       // lexer.reset();

       // CommonTokenStream tokens = new CommonTokenStream(lexer);
        //Little parser = new Little(tokens);

      //  Little lexer = new Little(charStream);
        Little lexer = new Little(charStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LittleParser parser = new LittleParser(tokens);
        ParseTree tree = parser.program();
       // ParseTree tree = parser.r(); // begin parsing at rule 'r'
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree

        //CommonTokenStream tokens = new CommonTokenStream(lexer);
     //   CommonTokenStream tokenStream = new CommonTokenStream (lexer);

       // ArrayInitParser parser = new ArrayInitParser(tokens);
       // ANTLRParser parser = new ANTLRParser((org.antlr.runtime.TokenStream) tokenStream);

       // ParseTree tree = parser.init();
       // System.out.println(tree.toStringTree(parser));

       // for (Token token: lexer.getAllTokens()) {
       //     System.out.println("Token Type: " + vocabulary.getSymbolicName(token.getType()) +"\n" + "Value: " +token.getText());
       // /*
       // while(true) {
        //    Token t = lexer.nextToken();
       //     if(lexer.nextToken() == null){
           //     break;
       //     }
           // System.out.println(" " + t + " ");

      //  }

      //  */
    }
}
// create a parser that feeds off the tokens buffer
// ArrayInitParser parser = new ArrayInitParser (tokens) ;
