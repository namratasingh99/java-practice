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
public class DfsIterativeTraversal {
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
        Stack<Node> stack = new Stack<>();
        System.out.println("Pre Order Traversal");
        preOrder(n1,stack);
        System.out.println();
        System.out.println("In Order Traversal");
        inOrder(n1,stack);
        System.out.println();
        System.out.println("Post Order Traversal");
        postOrder(n1,stack);
    }

    public static void postOrder(Node n1,Stack<Node> stack) {
       stack.push(n1);
        ArrayList<Integer> list = new ArrayList<Integer>();
        do{
            Node temp = stack.pop();
            list.add(temp.data);
            if(temp.left!=null) stack.push(temp.left);
            if(temp.right!=null) stack.push(temp.right);
        }while(!stack.isEmpty());
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void inOrder(Node n1,Stack<Node> stack) {
      Node curr = n1;
      ArrayList<Integer> list = new ArrayList<Integer>();
      while(stack.size()>0||curr!=null){
            if(curr !=null){ 
                if(curr.left !=null){
                    stack.push(curr);
                    curr = curr.left;
                }
                else{
                    list.add(curr.data);
                    curr=curr.right;
                }
            }
            else{
                Node top = stack.pop();
                list.add(top.data);
                curr = top.right;
            }
        }
      System.out.println(list);
    }

    public static void preOrder(Node n1 , Stack<Node> stack) {
        stack.push(n1);
        ArrayList<Integer> list = new ArrayList<Integer>();
        do{
            Node temp = stack.pop();
            list.add(temp.data);
            if(temp.right!=null) stack.push(temp.right);
            if(temp.left!=null) stack.push(temp.left);
        }while(!stack.isEmpty());
        System.out.println(list);
    }   
}
