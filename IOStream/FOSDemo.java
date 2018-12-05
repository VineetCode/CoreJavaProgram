import java.io.*;

public class FOSDemo{
    public static void main(String[] args) throws FileNotFoundException,IOException{
        FileOutputStream fos =new FileOutputStream("abc.txt",true);
        fos.write(97);
        fos.write(98);
        System.out.println("Data is saved!!!");
        
    }
}