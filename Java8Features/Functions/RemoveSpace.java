import java.util.function.Function;
class Student{
	String name;
	int marks;

	Student(String name,int marks){
	 this.name=name;
	 this.marks=marks;
	}
}//Student.class

public class RemoveSpace{
     
  public static void main(String[] args){
    ArrayList<Student> al=new ArrayList<>();
	populate(al);

	Function<Student,String> f=s->{
	  int marks=s.marks;
	  if(marks>=80){
	     return "A[Dictinction]";
	  }else if(marks >=60){
	       return "B[First class]";
	  }else if(marks >=50){
	      return "C[Second class]";
	  }else if(marks >=35){
	      return "D[Third class]";
	  }else{
	       return "F[Fail]";
	  }
	 
	};
     for(Student st:al){
	   System.out.println("Student Name ::"+s.name);
	   System.out.println("Student Marks ::"+s.marks);
	   System.out.println("Student Grade ::"+s.apply(s));
	   System.out.println("=====================");
	 }
  }//end of main() method

  public static void populate(List<Student> al){
	  al.add(new Student("Vineet",50));
	  al.add(new Student("Vipul",80));
	  al.add(new Student("Vikash",40));
  	  al.add(new Student("Kalyan",90));
	  al.add(new Student("Sumit",50));
	  al.add(new Student("Ganu",50));
  }//end of populate() method
}//end of  class
