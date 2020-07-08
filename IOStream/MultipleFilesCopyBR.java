import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MultipleFilesCopyBR{

    public final static String FILE_NAME="FileName.txt";
    public final static String OUtPUT_FILE_NAME="OutputFileName.txt";

    public static void copyFiles(ArrayList<FileInputStream> fisList) throws FileNotFoundException,IOException{
     
        FileOutputStream fos=new FileOutputStream(OUtPUT_FILE_NAME);
        int data;
        for(FileInputStream fis : fisList){
           while((data=fis.read())!=-1){
               fos.write(data);

           }//end of while-loop
        }//end of for loop
        fos.close();
    }//end of method
    public static void main(String[] args) throws FileNotFoundException,IOException {
        
        ArrayList<FileInputStream>  fileList=new ArrayList<FileInputStream>();
        BufferedReader br=new BufferedReader(new FileReader(FILE_NAME));

        String fname;
        while((fname=br.readLine())!=null){
            fileList.add(new FileInputStream(fname));
        }//while
       copyFiles(fileList); 
       System.out.println("\n Files Copy DOne !!!");

       for(FileInputStream fis1 :fileList){
           fis1.close();
       }
    }//end of main
    
}//end of class