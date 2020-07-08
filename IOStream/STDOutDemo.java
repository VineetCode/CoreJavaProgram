import java.io.FileOutputStream;
import java.io.PrintStream;

public class STDOutDemo{
  public static void main(String[] args) throws Exception{
       System.out.println("Data before setOut() method");
       System.out.println("Data before setErr() method");

       PrintStream ps1=new PrintStream(new FileOutputStream("output.txt"));
       PrintStream ps2=new PrintStream(new FileOutputStream("error.txt"));

       System.setOut(ps1);
       System.setErr(ps2);

       System.out.println("Data after setOut() method");
       System.out.println("Data after setErr() method");

       int x=10/0;
  }
    
}