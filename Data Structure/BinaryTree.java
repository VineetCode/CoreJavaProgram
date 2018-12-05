class Node{
 
   public int data;
   public Node left;
   public Node right;

   Node(int data){
       this.data=data;
       left=null;
       right=null;
   } 
}//end of Node class

public class BinaryTree{

    public Node root;
    public BinaryTree bt;

    public void add(int data){
      root=addRecursive(root,data);
    }//end of add(-) method

    private Node addRecursive(Node current, int data){
       if(current==null){
           return new Node(data);
       }
       if(data<current.data){
           current.left=addRecursive(current.left, data);
       }
       else if(data > current.data){
           current.right=addRecursive(current.right, data);
       }
        return current;
    }//end of addRecursive(-,-) method

 
    public void inOrderTraversal(Node node){
        if(node!=null){
            inOrderTraversal(node.left);
            System.out.print(node.data+" ");
            inOrderTraversal(node.right);
        }
    }//end of inOrderTraversal(-) method

    public void postOrderTraversal(Node node){
        if(node!=null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data+ " ");
        }
    }//end of postOrderTraversal(-) method

    public void preOrderTraversal(Node node){
        if(node!=null){
            System.out.print(node.data+" ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }//end of preOrderTraversal(-) method

    public void traversal(){
        System.out.println("InOrder Traversal ::");
           inOrderTraversal(root);

           System.out.println("\n PreOrder Traversal ::");
           preOrderTraversal(root);

           System.out.println("\n PostOrder Traversal ::");
           postOrderTraversal(root);
           System.out.println();
    }//end of traversal() method
    
    private BinaryTree createBinaryTree(){
         bt=new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }//end of createBinaryTree() 

    public boolean isEmpty(){
        return root==null;
    }//end of isEmpty() method

    public int getSize(){
       return getRecursiveSize(root);
    }//end of getSize() method

    private int getRecursiveSize(Node current){
     return current==null ? 0 : getRecursiveSize(current.left) + 1 + getRecursiveSize(current.right);
    }//end of getRecursiveSize() method
   
    public boolean containNodes(int data){
       return  containNodesRecursive(root,data);
    }//end of conatinsNodes(-) method

    private boolean containNodesRecursive(Node current,int data){
           if(current==null){
              return false;
           }
           if(data==current.data){
                return true;       
           }
           return data < current.data ? containNodesRecursive(current.left, data): containNodesRecursive(current.right, data);
    }//end of containsNodesRecursive(-,-) method

    public int findSmallestValue(Node root){
        return root.left==null ? root.data : findSmallestValue(root.left);  
    }//end of findSmallestValue(-) method

    public int findGreatestValue(Node root){
       return root.right ==null ? root.right : findGreatestValue(root.right);
    }//end of findGreatestValue(-) method
    public static void main(String[] args){
      BinaryTree binaryTree=new BinaryTree();
      BinaryTree b=binaryTree.createBinaryTree();
      b.traversal();
      System.out.println("BST isEmpty :: "+b.isEmpty());
      System.out.println("BST Size :: "+b.getSize());
    }//end of main method

    
}//end of BinaryTree class