public class Student1 implements Cloneable{

    int sno=1;
    String sname="StudentOne";
    String course="Course1";
    double fee=1000;
    Address1 add=new Address1();

    public Student1 clone() throws CloneNotSupportedException{
      Student1 s=(Student1)super.clone();
      s.add=this.add.clone();
      return s;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Student1 s1=new Student1();
        Student1 s2=s1.clone();
        System.out.println(s1.add==s2.add);

    }
}