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


public class levels {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Node n1 = new Node(100);
        Node n2 = new Node(12);
        Node n3 = new Node(3);
        Node n4 = new Node(9);
        Node n5 = new Node(5);
        Node n6 = new Node(36);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n4.left=n5;
        n3.left = n6;
        n5.right=n7;
        n7.left = n8;
        System.out.println(levelsOfTree(n1));
        
    }   

    public static int levelsOfTree(Node root){
        if(root==null) return 0;
        return 1+Math.max(levelsOfTree(root.left),levelsOfTree(root.right));
    }
}
