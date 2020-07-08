import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FISDemoBook{
    public final static String INPUT_FILE_NAME="input.txt";
    public static void main(String[] args) throws FileNotFoundException,IOException{
        FileInputStream fis=new FileInputStream(INPUT_FILE_NAME);
        int i;
        while((i=fis.read())!=-1){
         System.out.println(i+ "-----"+(char)i);
        }
        fis.close();
    }
}