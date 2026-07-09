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
public class balancedBinaryTree {
    public static void main(String[] args) {
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
        // n2.right = n5;
        // n3.left = n6;
        // n3.right = n7;
        n4.left = n6;
        n6.left=n7;
        isBalanced(n1);
    }
    public static void isBalanced(Node root){
        if(balanceLevel(root)==true){
            System.out.println("Balanced");
        }
    }
    public static boolean balanceLevel(Node root){
        if(root==null) return true;
        double diff = Math.abs(levels(root.left)-levels(root.right));
        if((int)diff==1 || (int)diff ==0){
            return (balanceLevel(root.left) && balanceLevel(root.right));
        }
        else{
            System.out.println("Not Balanced"); 
            return false;
        }
    }
    public static int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
}
