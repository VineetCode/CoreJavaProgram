import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.*;
import java.io.IOException;

public class IOStreamProject{
    
    public static final String FILE_NAME="abc.txt";

    public  void changeData() throws IOException{
    
        BufferedReader br=new BufferedReader(new FileReader(FILE_NAME));
        
        //StringBuilder object creation to store file data
        StringBuilder fileDataBuffer=new StringBuilder();

        //reading complete file data and storing it in StingBuilder object
        while(br.ready()){//ready() method to checks is stream has data to read or not
            fileDataBuffer.append(br.readLine()+"\n"); 
        }//end of while
        
        //changing StringBuilder to String to call replace() method
        String fileData=fileDataBuffer.toString();

        //replacing "xyz" with "abc"
        fileData=fileData.replace("xyz","abc");

        //writting changed content to file
        FileWriter fw=new FileWriter(FILE_NAME);
        fw.write(fileData);

        fw.flush();

        System.out.println("Data changed successfully");
        br.close();
        fw.close();
    }//end of method

    public static void main(String[] args) throws IOException {
        IOStreamProject p=new IOStreamProject();
        p.changeData();
    }
}//end of class