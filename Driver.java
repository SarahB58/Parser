import org.antlr.v4. runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.io.File;

public class Driver {
    public static void main(String[] args) throws Exception {

	ANTLRInputStream input = new ANTLRInputStream(System.in);

        LittleLexer lexer = new LittleLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LittleParser parser = new LittleParser(tokens);
        parser.removeErrorListeners();
      
        int numErrors  = parser.getNumberOfSyntaxErrors();
                if(numErrors == 0){
          //  System.out.println("Accepted");
        }else{
          //  System.out.println("Not accepted");
        }
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        SimpleTableBuilder stb = new SimpleTableBuilder();

        walker.walk(stb, tree);
    }
}


