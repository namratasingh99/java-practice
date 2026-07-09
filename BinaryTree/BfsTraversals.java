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
class pair{
    Node temp;
    int level;
    pair(Node temp , int level){
        this.temp=temp;
        this.level=level;
    }
}
public class BfsTraversals {
    public static void main(String[] args) {
        Queue<Node> queue = new LinkedList<>();
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
        queue.add(n1);
        // bfs(n1 , queue);
        bfsEachLevelAfterSpace(n1);
    }
    public static void bfs(Node root , Queue<Node> queue){
        while(!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.print(temp.data+" ");
            
           if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
        }
    }
    public static void bfsEachLevelAfterSpace(Node root){
        Queue<pair> q = new LinkedList<>();
        int currentLevel = 1;
        q.add(new pair(root,1));
        while(!q.isEmpty()){
            pair ptr = q.remove();
            if(currentLevel!=ptr.level){
                currentLevel++;
                System.out.println();
            }
            System.out.print(ptr.temp.data +" ");
            if(ptr.temp.left!=null) q.add(new pair(ptr.temp.left , ptr.level+1));
            if(ptr.temp.right!=null) q.add(new pair(ptr.temp.right ,ptr.level+1));
        }
    }
}
