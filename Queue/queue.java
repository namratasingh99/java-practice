import java.util.*;
public class queue {
    public static void addAtIndex(Queue<Integer> queue , int idx , int val){
        int n = queue.size();
        if(idx<0 || idx>n){
            System.out.println("Invalid index");
            return;
        }
        if(idx==n){
            queue.add(val);
            return;
        }
        for(int i=0 ; i<idx ; i++){
            queue.add(queue.remove());
        }
        queue.add(val);
        for(int i=0 ; i<n-idx ; i++){
            queue.add(queue.remove());
        }
    }
    public static int remove(Queue<Integer> queue , int idx){
        int n = queue.size();
        if(idx<0 || idx >=n){
            System.out.println("invalid index");
            return -1;
        }
        for(int i=0 ; i<idx ; i++){
            queue.add(queue.remove());
        }
        int ele = queue.remove();
        n=queue.size();
        for(int i=0 ; i<n-idx ; i++){
            queue.add(queue.remove());
        }
        return ele;
    }
    public static int peek(Queue<Integer> queue , int idx){
        int n = queue.size();
        int ele=-1;
        if(idx==0){
            ele = queue.peek();
            return ele;
        }
        for(int i=0 ; i<n ; i++){
            if(i==idx) {
                ele = queue.peek();
            }
            queue.add(queue.remove());
        }
        return ele;
    }
    public static void display(Queue<Integer> queue){
        int n = queue.size();
        for(int i=0 ; i<n ; i++){
            int ele = queue.remove();
            System.out.print(ele +" ");
            queue.add(ele);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        // System.out.println(queue + " "+queue.size());
        // System.out.println(queue.peek());
        // queue.remove();
        // System.out.println(queue + " "+queue.size());
        display(queue);
        int top = peek(queue, 2);
        System.out.println("Element at idx 2 = " + top);
        addAtIndex(queue, 2,30 );
        display(queue);
        remove(queue, 0);
        display(queue);
        top = peek(queue, 0);
       System.out.println("Element at top = " + top);
    }
}
