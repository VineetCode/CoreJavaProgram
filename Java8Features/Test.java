import java.util.*;
import java.util.stream.Collectors;
public class Test{
   public static void main(String[] args) {
	   ArrayList<Integer> al=new ArrayList<Integer>();
	   al.add(0);
	   al.add(5);
	   al.add(10);
	   al.add(15);
	   al.add(20);
	   al.add(25);

	   System.out.println(al);

	   List<Integer> l1=al.stream().filter(i->i%2==0).collect(Collectors.toList());
	   System.out.println(l1);
	   
	   ArrayList<Integer> marks=new ArrayList<>();
	   marks.add(0);
	   marks.add(5);
	   marks.add(10);
	   marks.add(15);
	   marks.add(20);
	   marks.add(25);
	   marks.add(30);
       System.out.println(marks);
	   List<Integer> updatedMarks=marks.stream().map(i->i+5).collect(Collectors.toList());
	   System.out.println(updatedMarks);


   }

}
