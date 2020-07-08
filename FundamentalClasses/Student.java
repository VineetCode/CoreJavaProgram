public class Student implements Cloneable {

   int sno=1;
   String  sname="StudentOne";
   String  course="Course1";
   double  fee=1000;
   Address add=new Address();

   public static void main(String[] args) throws CloneNotSupportedException {
       Student s1=new Student();
       Student s2=(Student)s1.clone();
       System.out.println(s1.add==s2.add);
   }

}