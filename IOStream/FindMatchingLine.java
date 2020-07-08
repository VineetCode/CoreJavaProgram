import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

import java.io.BufferedReader;

public class FindMatchingLine{

    public final static String INPUT_FILE_NAME="input.txt";
    public final static String OUTPUT_FILE_NAME="output.txt";
    public static void main(String[] args) throws FileNotFoundException,IOException {
       BufferedReader br=new BufferedReader(new FileReader(INPUT_FILE_NAME));
       FileWriter fw=new FileWriter(OUTPUT_FILE_NAME);

       String line;
       int noOfLines=0;

       while((line=br.readLine())!=null){
          if(line.startsWith("abc")){
              fw.write(line + '\n');
              noOfLines++;
          }//end of if-block
       }//end of while-loop 
       br.close();
       fw.close();
      
       System.out.println("Matching Line transfer Done!!!");
    
   }//end of main method
}//end of class