import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int val){
        this.data = val;
        left=right=null;
    }
}
public class DfsTraversals {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        System.out.println("Pre Order Traversal");
        preOrder(n1);
        System.out.println();
        System.out.println("In Order Traversal");
        inOrder(n1);
        System.out.println();
        System.out.println("Post Order Traversal");
        postOrder(n1);
    }   
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data +" ");          
        preOrder(root.left); 
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);                               
        System.out.print(root.data +" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);                              
        postOrder(root.right);
        System.out.print(root.data +" ");
    }
}
