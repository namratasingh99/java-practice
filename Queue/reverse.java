import java.util.*;
public class reverse {
    public static void reverseQueue (Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        int n = queue.size();
        for(int i=0 ; i<n ; i++){
            stack.push(queue.remove());
        }
        for(int i=0 ; i<n ; i++){
            queue.add(stack.pop());
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
        reverseQueue(queue);
        System.out.println("After Reverse :");
        System.out.println(queue);

    }
}
