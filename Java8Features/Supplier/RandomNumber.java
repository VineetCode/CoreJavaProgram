import java.util.*;
import java.util.function.*;

public class RandomNumber{
  public static void main(String[] args) {
    
      Supplier<String> s=()->{
               String[] s1={"Vineet","Vikash","Vipul","Kalyan"};
               int x=(int)Math.random()*3;
               return s1[x];
      };

      System.out.println(s.get());
      System.out.println(s.get());
      System.out.println(s.get());
  }//end of main() method
}//end of class