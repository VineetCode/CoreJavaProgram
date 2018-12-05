import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BackupFileCreation{
    public static void main(String[] args) throws FileNotFoundException,IOException {
        //Reading data from abc.txt
        FileInputStream fis=new FileInputStream(args[0]);
        FileOutputStream fos=new FileOutputStream(args[0] +".bak");
        int data;
        while((data=fis.read())!=-1){
            fos.write(data);
        }//end of while
        System.out.println("Backup File Creation Completed.!!!");
        fis.close();
        fos.close();
    }//end of main
}//end of class