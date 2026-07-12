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
public class LeftViewBinaryTree {
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
        ArrayList<Integer> ans = leftView(n1);
        System.out.println(ans);
    }
    public static ArrayList<Integer> leftView(Node root) {
	    ArrayList<Integer> list = new ArrayList<>();
        levels(root , 0 , list);
        return list;
	}
    public static void levels(Node root , int level , ArrayList<Integer>list){
        if(root==null) return ;
        if(level>=list.size()) list.add(root.data);
        levels(root.left,level+1,list);
        levels(root.right,level+1,list);
    }
}
