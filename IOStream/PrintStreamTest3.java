import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest3{
    public static void main(String[] args) throws FileNotFoundException {
      //PrintStream object creation connecting to abc.txt file
      PrintStream ps=new PrintStream("abc.txt");

      //storing data in abc.txt file using explicit PrintStream object
      ps.print("A");
      ps.println("B");
      ps.println("C");

      System.out.println("Data Written to abc.txt file");

      //printing data on console using implicit PrintStream Object
      System.out.println("A");
      System.out.println("B");
      System.out.println("C");
    } 
    
}