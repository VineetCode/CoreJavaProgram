import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MultipleFileCopy{
    public static void main(String[] args) throws FileNotFoundException,IOException {
       
        FileInputStream fis1=new FileInputStream("1.txt");
        FileInputStream fis2=new FileInputStream("2.txt");

        FileOutputStream fos=new FileOutputStream("12.txt");
        int data;
        while((data=fis1.read())!=-1){
            fos.write(data);
        }//end of while
        while((data=fis2.read())!=-1){
            fos.write(data);
        }//end of while
        System.out.println("Data is copied !!!");
        fis1.close();
        fis2.close();
        fos.close();
    }//end of main
}//end of class