import java.util.function.*;
public class FindLengthOfString{    
	public static void main(String[] args) {
      Function<String,Integer> f=s->s.length();
		System.out.println(f.apply("DurgaSoft"));

		Function<Integer,Integer> f1=i->i*i;
		System.out.println(f1.apply(5));
		System.out.println(f1.apply(5));
	}
}
