import java.io.PrintStream;

public class WritingAsIts{
   public final static String FILE_NAME="file1.txt";

    public static void main(String[] args) throws Exception{
        PrintStream ps=new PrintStream(FILE_NAME);
        ps.write(97);
        ps.print(97);      
        
        ps.close();
    }
}