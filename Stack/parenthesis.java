import java.util.*;
public class parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parenthesis string");
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        if(s.charAt(0)==']'||s.charAt(0)=='}'|| s.charAt(0)==')') {
            System.out.println("Not Balanced");
            return;
        }
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='('|| ch=='{'|| ch =='['){
                stack.push(ch);
            }
            else{
                char ele = stack.peek();
                if(ch==')' && ele=='('){
                    stack.pop();
                }
                else if(ch=='}' && ele=='{'){
                    stack.pop();
                }
                else if(ch==']' && ele=='['){
                    stack.pop();
                }
                else{
                    System.out.println("Not balanced parenthesis");
                    return ;
                }
            }
        }
        System.out.println("Balanced");
    }
}
