public class Test{
    public static void main(String[] args) throws CloneNotSupportedException{
         Example1 e1=new Example1();
         Example1 e2=e1.clone();
         System.out.println(e1);
         System.out.println(e2);
    }
}