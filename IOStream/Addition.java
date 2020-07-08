import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition{

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the First Integer Vale::");
            String first=br.readLine();

            System.out.println("Enter the Second Integer Vale::");
            String second=br.readLine();

            //converting String from to int form

            int i=Integer.parseInt(first);
            int j=Integer.parseInt(second);

            int k =i+j;

            System.out.println("Result ::"+k);

        }catch(NumberFormatException nfe){
            System.out.println("Please pass only integer number");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    
}