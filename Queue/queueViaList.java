import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next=null;
    }
}
class Queue{
    Node head = null;
    Node tail = null;
    public  void add(int val){
        Node temp = new Node(val);
        if(head==null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    public  void delete(){
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head = head.next;
        }
    }
    public  int peek(){
        return head.val;
    }
    public  void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }

}
public class queueViaList {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.peek());
        q.delete();
        q.display();
        System.out.println(q.peek());
        q.delete();
        q.display();
    }
}
