import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

public class KeyboardReader{
      public static void main(String[] args) throws FileNotFoundException,IOException{

          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the Data :::");
          String line=br.readLine();
          System.out.println("You Entered ::"+line);

      }
}