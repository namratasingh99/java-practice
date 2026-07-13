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
public class TreeBoundaryTraversal {
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
       ArrayList<Integer> ans = boundaryTraversal(n1);
       System.out.println(ans);
        
    }
    public static ArrayList<Integer> boundaryTraversal(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.data);
        if(root.left==null && root.right==null) return list;
        boundaryLeft(root.left,list);
        leafNode(root,list);
        boundaryRight(root.right , list);
        return list;
    }
    public static void boundaryLeft(Node root , ArrayList<Integer> list){
        if(root==null)return;
        if(root.left==null && root.right==null) return;
        list.add(root.data);
        if(root.left!=null) boundaryLeft(root.left, list);
        else boundaryLeft(root.right , list);
    }
    public static void leafNode(Node root , ArrayList<Integer> list){
        if(root==null) return;
        if(root.left==null && root.right==null) list.add(root.data);
        leafNode(root.left , list);
        leafNode(root.right , list);
    }
    public static void boundaryRight(Node root , ArrayList<Integer> list){
        if(root==null) return;
        if(root.left==null &&root.right==null) return;
        if(root.right!=null){
            boundaryRight(root.right,list);
        }
        else boundaryRight(root.left , list);
        list.add(root.data);
    }
}
