import java.util.Arrays;

public class SockMerchant{

    public static int sockMerchant(int[] arr, int n){
      int i=0,j=0,count=0,pair=0;
      Arrays.sort(arr);
    
      for(i=0;i<n;i++){
        count=0;
        System.out.println("I :"+ i +" J :"+j);
        for(j=i;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
            }else if(arr[i]!=arr[j]){
                i=j-1;
                break;
              }
            }//inner for
           System.out.println("Count :"+count);
           pair= pair + count/2;
           System.out.println("Pair ::"+pair);
           if(n==j){
            break;
        }
      }//outer for
      return pair;
    }//end of method
    public static void main(String[] args){
        int[] input={10,20,20,10,10,30,50,10,20};
        // int[] input={1,1,3,1,2,1,3,3,3,3};
         int n=input.length;
         System.out.println("Length :"+n);
         int pair=sockMerchant(input, n);
         System.out.println("Result ::"+pair);
        }

}