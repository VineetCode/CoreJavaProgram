import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

import java.io.BufferedReader;

public class BufferReaderTest{
    public final static String FILE_NAME="vineet.txt";
    public static void main(String[] args) throws FileNotFoundException,IOException {
       BufferedReader br=new BufferedReader(new FileReader(FILE_NAME));
       StringBuilder sb=new StringBuilder();

       String line;
       while((line=br.readLine())!=null){
           sb.append(line);
       }//end of while 
       br.close();

       String result=sb.toString().replace("abc","xyz");
       BufferedWriter bw=new BufferedWriter(new FileWriter(FILE_NAME));
       bw.write(result);

       System.out.println("File modificatio Done!!!");
       bw.close();




   }//end of main method
}//end of class