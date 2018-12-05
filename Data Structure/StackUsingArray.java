public class StackUsingArray{

    int top;
    static final int MAX=10;
    int[] stack=new int[MAX];

    public StackUsingArray(){
        top=-1;
    }
    
    public boolean isEmpty(){
        return (top<0);
    }

    public boolean isFull(){
        return (top>MAX);
    }

    public void push(int data){
       if(isFull()){
          System.out.println("Stack Overflow");
        }else{
        stack[++top]=data;
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
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.push(110);


    }//end of main() method
    
}//end of StackUsingArray() class