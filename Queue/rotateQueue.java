import java.util.*;
public class rotateQueue {
    public static void rotateElement(Queue<Integer> queue , int idx){
        int n = queue.size();
        idx=idx%n;
        for(int i=0 ; i<=idx ; i++){
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
        int k = 2;                                     //rotate queue by k idx
        rotateElement(queue , k);
        System.out.println("Rotate queue by  " + k +"elements =");
        System.out.println(queue);
    }
}
