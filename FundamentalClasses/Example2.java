class A{

}
public class Example2 implements Cloneable{
    A a=new A();
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Example2 e1=new Example2();
        Example2 e2=(Example2)e1.clone();

        System.out.println(e1.a==e2.a);

    }
    

}