class A{
  int x;

  A(int x){
      this.x=x;
  }

  public int hashCode(){
      return x;
  }

  public int JVMHC(){
      return super.hashCode();
  }

}

public class IdentityHashCodeTest{
  public static void main(String[] args) {
     A a1=new A(5);
     A a2=new A(5);
     A a3=new A(6);
     
     System.out.println(a1.hashCode());
     System.out.println(a1.hashCode());
     System.out.println(a1.hashCode());

     System.out.println(System.identityHashCode(a1));
     System.out.println(System.identityHashCode(a2));
     System.out.println(System.identityHashCode(a3));

     System.out.println(a1.JVMHC());
     System.out.println(a2.JVMHC());
     System.out.println(a3.JVMHC());
  }
}