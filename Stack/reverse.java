import java.util.*;
public class reverse {
    static Stack<Integer> stack = new Stack<>();

    public static void pushAtBottom(int value){
        if(stack.isEmpty()) {
            stack.push(value);
            return;
        }
        int ele = stack.pop();
        pushAtBottom(value);
        stack.push(ele);
    }

    public static void reverseStack(){
        if(stack.isEmpty()) return;
        int ele =stack.pop();
        reverseStack();
        pushAtBottom(ele);
    }
    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        reverseStack();
        System.out.println(stack);
    }
}
