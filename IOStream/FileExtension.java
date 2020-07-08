import java.io.File;
import java.io.FilenameFilter;
import java.net.FileNameMap;

class FileExtension implements FilenameFilter{

    String extFile;

    FileExtension(String extFile){
     this.extFile=extFile;
    }

    public boolean accept(File dir, String name){
         return name.endsWith(extFile);
    }

}
public class FilterListFiles{
    public static void main(String[] args) {
         String strDir="../IOStream";
         File f=new File(strDir);
         FilenameFilter onlyFile=new FileExtension("java");
         String strFile[]=f.list(onlyFile);

         System.out.println("\n The Java Files in the current directory are :\n");
         for(int i=0;i<strFile.length;i++){
            System.out.println(strFile[i]);
         }
    }
}