public class StackUsingArray{

    int top;
    static final int MAX=100;
    int[] stack=new int[MAX];

    public StackUsingArray(){
        top=-1;
    }
    
    public boolean isEmpty(){
        return (top<0);
    }

    public boolean isFull(){
        System.out.print("Full");
        return (top>=MAX-1);
    }

    public boolean push(int data){
       if(top>=MAX-1){
          System.out.println("Stack Overflow");
          return false;
        }else{
          stack[++top]=data;
          return true;
        }
    }

    public int peek(){
        return stack[top];
    }
    
    public int pop(){
        int n=stack[top--];
        return n;
    }

    public void print(){
        for(int i=0;i<stack.length;i++){
            System.out.print(stack[i]+" ");
        }
    }

    public static void main(String[] args){
        StackUsingArray stack=new StackUsingArray();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
    }//end of main() method
    
}//end of StackUsingArray() class