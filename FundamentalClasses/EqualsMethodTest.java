public class EqualsMethodTest{

    public static void main(String[] args) {

        Student s1=new Student(1,"Hari",12);
        Student s2=new Student(2,"Krishna",12);
        Student s3=new Student(1,"Hari",12);
        Student s4=s2;

        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//false
        System.out.println();

        System.out.println(s1==s3);//false
        System.out.println(s1.equals(s3));//true

        System.out.println(s2==s4);//true
        System.out.println(s2.equals(s4));//true

        Address add=new Address();

        //System.out.println(s1==add);
        System.out.println(s1.equals(add));//false
        System.out.println(add.equals(s1));//false

        System.out.println(null==null);//true
        //System.out.println(null.equals(null));//CE:<nulltype> cannot be dereferenced.

        Address a1=null;
        Address a2=null;

        System.out.println(a1==a2);//true
       // System.out.println(a1.equals(a2));//NPE

        Address a3=new Address();
        
        System.out.println(a3==null);//false
        System.out.println(a3.equals(a2));//false

        System.out.println(s2.equals(a2));//false

      
    }//end of main() method
}//end of class