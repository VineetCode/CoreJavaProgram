import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;


public class RMAWFileUsingSIS{
    public static void main(String[] args) throws FileNotFoundException,IOException{

        ArrayList<FileInputStream> fileList=new ArrayList<FileInputStream>();
        FileOutputStream fos=new FileOutputStream("12345.txt");
        
        FileInputStream fis1=new FileInputStream("1.txt");
        FileInputStream fis2=new FileInputStream("2.txt");
        FileInputStream fis3=new FileInputStream("3.txt");
        FileInputStream fis4=new FileInputStream("4.txt");
        FileInputStream fis5=new FileInputStream("5.txt");

        fileList.add(fis1);
        fileList.add(fis2);
        fileList.add(fis3);
        fileList.add(fis4);
        fileList.add(fis5);

        Enumeration e=Collections.enumeration(fileList);

        SequenceInputStream sis=new SequenceInputStream(e);
        int data;
        while((data=sis.read())!=-1){
            fos.write(data);
        }//end of while loop
    }//end of main
}//end of class