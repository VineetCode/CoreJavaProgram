class Example{
    int x=10;
    int y=20;

    public String toString(){
        return "X :"+x+ "\nY :"+y;
    }
}
public class Test{
    public static void main(String[] args){
        Example e=new Example();
        System.out.println(e);

        String s="abc";
        System.out.println(s);
    }
}