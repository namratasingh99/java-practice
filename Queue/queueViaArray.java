import java.util.*;
class Queue{
    int[] arr;
    int head , rear , size;
    public Queue(int len){
        arr = new int[len];
        head=rear=size=0;
    }
    public void add(int ele){
        if(size==arr.length){
            System.out.println("Queue is full and " +ele +" cannot be inserted");
            return;
        }
        arr[rear%arr.length]=ele;
        rear++;
        size++;
    }
    public void remove(){
        if(head==0 && rear==0){
            System.out.println("Queue is Empty and element cannot be deleted");
            return;
        }
        
        head++;
        if(head==arr.length) head=0;
        size--;
    }
    public void display(){
        for(int i=head ; i!=rear ; i++){
            System.out.print(arr[i%arr.length] +" ");
       }
       System.out.println();
   }
}
public class queueViaArray {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        // q.add(6);
        // q.display();
        q.remove();
        q.add(6);
        q.display();
        
    }
}
