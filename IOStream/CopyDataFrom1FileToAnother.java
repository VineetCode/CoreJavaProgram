import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataFrom1FileToAnother{
    public static void main(String[] args) throws FileNotFoundException,IOException {
        //Reading data from abc.txt
        FileInputStream fis=new FileInputStream("abc.txt");
        FileOutputStream fos=new FileOutputStream("cba.txt");
        int data;
        while((data=fis.read())!=-1){
            fos.write(data);
        }//end of while
        System.out.println("Data Written into Another File Completed!!!");
        fis.close();
        fos.close();
    }//end of main
}//end of class