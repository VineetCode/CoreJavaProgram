import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;

public class MultipleFilesCopyIntoOneFile{

    public static void copy(ArrayList<FileInputStream> fileList)throws FileNotFoundException,IOException{
     FileOutputStream fos=new FileOutputStream("1234.txt");
     int data;
     for(FileInputStream fis : fileList){
        while((data=fis.read())!=-1){
            fos.write(data);
        }//while
     }//for-each
     fos.close();
    }//end of copy(-) method

    public static void main(String[] args) throws FileNotFoundException,IOException{

     ArrayList<FileInputStream> fileList=new ArrayList<FileInputStream>();
     
     Scanner sc=new Scanner(System.in);
     System.out.println("How many files want to read :");
     int n=sc.nextInt();
     sc.nextLine();

     for(int i=1;i<=n;i++){
       System.out.println("Enter file Name :: "+i+" : ");
       String fileName=sc.nextLine();
       fileList.add(new FileInputStream(fileName));
     }//end of for-loop
         copy(fileList);
         System.out.println("File Copy is done !!!");
         for(FileInputStream fis : fileList){
             fis.close();
         }//for-loop
    }//end of main
}//end of class