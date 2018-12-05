public class FindMissingNumber{

  public static int getMissingNum(int[] arr,int num){
    int sumOfNnumber= (num * (num + 1))/2;
    int sumOfGivenNum=0;
    for(int i=0;i<arr.length;i++){
        sumOfGivenNum +=arr[i];
    }
   return (sumOfNnumber-sumOfGivenNum);
  }//end of method
  public static void main(String[] args){
    int[] input={1,2,4,5,6,7,8};
    int num=8;
    int missingNumber=getMissingNum(input,num);
    System.out.print(missingNumber);

  }//end of class

}