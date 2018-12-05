import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileModificationDemo{
    public final static String FILE_NAME="vineet.txt";
   public static void main(String[] args) throws FileNotFoundException,IOException {
       
       FileInputStream fis=new FileInputStream(FILE_NAME);
       StringBuilder sb=new StringBuilder();
       int data;

       while((data=fis.read())!=-1){
         sb.append((char)data);
       }//end of while
       fis.close();
       String result=sb.toString().replace("bbc","abc");
       FileOutputStream fos=new FileOutputStream(FILE_NAME);
       fos.write(result.getBytes());
       fos.close();
       System.out.println("File Modification Completed");

   }//end of main() method
}//end of class