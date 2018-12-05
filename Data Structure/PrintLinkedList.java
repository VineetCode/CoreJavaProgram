import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
      this.data=data;
      next=null;
    }
}//end of Node.java

public class PrintLinkedList{
  
    Node head=null;

    public void addToTheLast(Node node){
       
        if(head==null){
            head=node;
       }else{
           Node temp=head;
           while(temp.next!=null){
               temp=temp.next;
           }//end of while
           temp.next=node;
       } //end of else block
        
    }//end of addToTheLast(-) method

   public static void main(String[] args){
      
       PrintLinkedList list=new PrintLinkedList();
       //Take input from Scanner
       Scanner sc=new Scanner(System.in);
       //number of Test Cases
       System.out.print("Enter the number of Test Cases :: ");
       int t=sc.nextInt();

       while(t-->0){
         System.out.print("Enter the number of N :: ");  
         int n=sc.nextInt(); 

         for(int i=1;i<=n;i++){
               System.out.print("Enter the "+ i +" Data :: ");
               int data=sc.nextInt();
               list.addToTheLast(new Node(data));
            
         }//end of for-loop
         list.printLinkedList(list.head);
       }//end of while
      
      sc.close();
   }//end of main() method

   public void printLinkedList(Node head){
    
    if(head==null){
        System.out.print("Linked List is Empty!!");
    }else{
        Node temp=head;
        while(temp!=null){
           System.out.print(temp.data + " ");
           temp=temp.next;
        }//end of while
    }//end of else block
   }//end of printLinkedList(-) method

}//end of PrintLinkedList class