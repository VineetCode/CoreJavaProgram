public class ExampleClone1 implements Cloneable{
  int x=10;
  int y=20;
  public static void main(String[] args) throws CloneNotSupportedException{
      ExampleClone1 e1=new ExampleClone1();
      e1.x=5;
      e1.y=6;
      ExampleClone1 e2=(ExampleClone1)e1.clone();
      
      System.out.println(e1==e2);
      System.out.println(e1.hashCode()==e2.hashCode());

      System.out.println(e1.x+"----"+e1.y);
      System.out.println(e2.x+"----"+e2.y);

      e2.x=8;
      e2.y=9;
      System.out.println();
      System.out.println(e1.x+"----"+e1.y);
      System.out.println(e2.x+"----"+e2.y);
  }
}