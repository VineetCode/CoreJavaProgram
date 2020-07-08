class B{
    int x;

    B(int x){
        this.x=x;
    }
    public String toString(){
        return ""+x;
    }

}//end of A.java

public class ToStringTest{
    public static void main(String[] args) {
        B b1=new B(5);
        B b2=new B(6);

        System.out.println(b1);
        System.out.println(b2);
    }

}