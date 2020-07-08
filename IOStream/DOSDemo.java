import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.sun.webkit.dom.CharacterDataImpl;

public class DOSDemo{

    public static final String FILE_NAME="data.txt"; 
    public static void main(String[] args) throws Exception {
       // FileOutputStream fos =new FileOutputStream(FILE_NAME);
       // DataOutputStream dos=new DataOutputStream(fos);
        //dos.writeInt(97);
        //dos.writeFloat(3.14f);
        //dos.writeChar('a');
        //dos.writeBoolean(true);
        //dos.writeUTF("Hari");
        FileInputStream fis=new FileInputStream(FILE_NAME);
        DataInputStream dis=new DataInputStream(fis);

        int i1=dis.readInt();
        float f1=dis.readFloat();
        char ch2=dis.readChar();
        boolean b1=dis.readBoolean();
        String s1=dis.readUTF();

        System.out.println(i1);
        
        System.out.println(ch2);
        System.out.println(s1);
        System.out.println(b1);
        System.out.println(f1);
        


        
        System.out.println("Data Written to File !!!");
    }//end of main

}//end of class