import java.util.*;
public class reverseKElements {
     public static void reverseKelement(Queue<Integer> queue , int ele){
        int n = queue.size();
        Stack<Integer> stack = new Stack<>();
        for(int i=0 ; i<ele ; i++){
            stack.push(queue.remove());
        }
        for(int i=0 ; i<ele ; i++){
            queue.add(stack.pop());
        }
        for(int i=ele ; i<n ; i++){
            queue.add(queue.remove());
        }
     }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(queue);
        int k = 2;                                     //reverse k elements
        reverseKelement(queue , k);
        System.out.println("Reverse " + k +"elements from queue =");
        System.out.println(queue);
    }
}
