import java.io.File;

import sun.net.www.content.text.plain;

public class ListFiles{
  
    public static void listFiles(String file){
           listFiles(new File(file));
    }
    public static void listFiles(File dir){
    try{
         if(dir!=null){
              File dirList[]=dir.listFiles();
              if(dirList!=null){
                  for(int i=0;i<dirList.length;i++){
                     File file =dirList[i];
                     if(file.isFile()){
                        System.out.println(file+ " is a file");
                     }else{
                        System.out.println(file+" is a directory");
                        listFiles(file);
                     }
                  }
              }else{
                System.out.println("Directory is Null");
              }
         }//if-block
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    public static void main(String[] args) {
        ListFiles.listFiles("E://CoreJavaProgram");
    }
    
}