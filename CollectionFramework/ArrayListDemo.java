import java.util.*;
public class ArrayListDemo{

	public static void main(String[] args) {
      ArrayList al = new ArrayList();
	  al.add("Vineet");
	  al.add("Love");
	  al.add("You");
	
	  System.out.println(al);

	  for(int i=0;i<al.size();i++){
		  Object ob=al.get(i);
		  String s=(String)ob;
		  System.out.println(s.toUpperCase());
	 	//  System.out.println(al);
	  }
	  System.out.println(al);
	}
}
