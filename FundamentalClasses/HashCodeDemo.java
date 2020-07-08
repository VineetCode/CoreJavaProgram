class Example{}
public class HashCodeDemo{
    public static void main(String[] args) {
     Example e1=new Example();
     Example e2=new Example();
     
     System.out.println(e1.hashCode());
     System.out.println(e2.hashCode());

     System.out.println(e1==e2);//false
     System.out.println(e1.equals(e2));//false
     System.out.println(e1.hashCode()==e2.hashCode());//false

     Example e3=e2;
     System.out.println(e2==e3);//true
     System.out.println(e2.equals(e3));//True
     System.out.println(e2.hashCode()==e3.hashCode());//true

     Student s1=new Student(1,"Hari",12);
     Student s2=new Student(1,"Hari",12);

     System.out.println(s1.equals(s2));//true
     System.out.println(s1.hashCode()==s2.hashCode());//false
     
    }//end of main method
}//end of class