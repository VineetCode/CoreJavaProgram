import java.util.function.Function;
import java.util.function.*;
import java.util.*;

class Student{
	String name;
	int marks;
	Student(String name,int marks){
	   this.name=name;
	   this.marks=marks;
	}
}//Student.class

public class StudentGrade{
     
  public static void main(String[] args){

    List<Student> al=new ArrayList<Student>();
	StudentGrade.populate(al);

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
    
	Predicate<Student> p=s->s.marks>=60;
	 
	 for(Student st:al){
		 if(p.test(st)){
	         System.out.println("Student Name ::"+st.name);
	        System.out.println("Student Marks ::"+st.marks);
	        System.out.println("Student Grade ::"+f.apply(st));
	        System.out.println("=====================");
	      }//end of if
	 }//end of for
  }//end of main() method

  public static void populate(List<Student> l){
	  l.add(new Student("Vineet",50));
	  l.add(new Student("Vipul",80));
	  l.add(new Student("Vikash",40));
  	  l.add(new Student("Kalyan",90));
	  l.add(new Student("Sumit",50));
	  l.add(new Student("Ganu",50));
  }//end of populate() method
}//end of  class
