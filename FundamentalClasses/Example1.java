public class Example1 implements Cloneable{

    int x=10;
    int y=20;

    public Example1 clone() throws CloneNotSupportedException{
       return (Example1)super.clone();
    }
}