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

public class MaximumValueInBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Node n1 = new Node(100);
        Node n2 = new Node(12);
        Node n3 = new Node(3);
        Node n4 = new Node(9);
        Node n5 = new Node(5);
        Node n6 = new Node(36);
        Node n7 = new Node(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        System.out.println(maximum(n1,Integer.MIN_VALUE));
        
    }   
    public static int maximum(Node root , int max){
        if(root==null) return max;
        if(root.data>max) max=root.data;
        return Math.max(maximum(root.left,max),maximum(root.right,max));
    }
}
