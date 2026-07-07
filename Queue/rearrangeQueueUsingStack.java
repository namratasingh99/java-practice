import java.util.*;
public class rearrangeQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        for(int i=1 ; i<=q.size() ; i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
        int n = q.size();
        for(int i=1 ; i<=n/2 ; i++){
            stack.push(q.remove());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        for(int i=1 ; i<=n/2 ; i++){
            stack.push(q.remove());
        }
        for(int i=1 ; i<=n/2 ; i++){
            q.add(q.remove());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
            q.add(q.remove());
        }
        while(q.size()>0){
            stack.push(q.remove());
        }
        while(stack.size()>0){ 
            q.add(stack.pop());
        }
        for(int i=1 ; i<=q.size() ; i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
    }
}
