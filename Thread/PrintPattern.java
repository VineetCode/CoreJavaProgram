public class PrintPattern{

    public static void main(String[] args){
        int n=3;
        int p;
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=n ;i>0;i--){
           p=n;
           count=0;
           for(int j=n*i ;j>0;j--){
           
           //sb.append(p+" ");
           System.out.print(p+" ");
           count++;
           if(count==i){
               p=p-1;
              count=0;
           }//if
      }//end of inner-for loop
     // sb.append("$");
     System.out.println();
    }//end of outer-for loop
    //System.out.print(sb.toString());

   }//end of printPat() method
    
}