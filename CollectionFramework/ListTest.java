import java.util.*;
public class ListTest {
	public static void main(String[] args) {
     //int[] input={3,1,5,2,6,7,9};
	 Integer[] input=new Integer[]{3,1,5,2,6,7,9};
	 int sum=12;
	 findSumPair(sum,input);

	}
	 public static void  findSumPair(int sum,Integer[] input){
	    List<Integer> list=Arrays.asList(input);
		HashSet<Integer> set=new HashSet<Integer>();
        for(Integer i: list){
		int j=sum-i;
		if(list.contains(j) && i!=j && (!set.contains(j))){
		         System.out.println("i : " +i+ " j: "+j);	 
				 set.add(i);
		   }//outer
		}//for

     }
}