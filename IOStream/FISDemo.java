import java.io.*;

public class FISDemo{
    
    public static void main(String[] args) throws FileNotFoundException,IOException{
        FileInputStream fis =new FileInputStream("abc.txt");
        int data;
        while((data=fis.read())!=-1){
            System.out.println("Data is :"+data);
        }
        fis.close(); 
    }//main
}//class