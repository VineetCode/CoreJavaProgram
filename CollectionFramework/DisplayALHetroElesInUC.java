 import java.util.*;
public class DisplayALHetroElesInUC{

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Vineet");
		al.add(1000);
		al.add("Vikash");
		al.add(2000);
		al.add("Vipul");
		al.add(3000);

		for(int i=0;i<al.size();i++){
	  	   Object obj=al.get(i);
		  if(obj instanceof String){
			String name=(String)obj;
		System.out.print(name.toUpperCase() );
			}//if
		  else{
			System.out.println(" "+obj);
			}//else
		}//for
	}//main
}//class
