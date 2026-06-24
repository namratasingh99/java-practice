import java.util.*;
public class pushAtBottom { 
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        pushAtBottom(5);
        System.out.println(stack);
    }
}
