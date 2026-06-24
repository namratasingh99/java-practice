import java.util.*;
public class uniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<Character>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else{
                if(stack.peek()==ch){
                    continue;
                }
                else{
                    stack.push(ch);
                }
            }
        }
        System.out.println(stack);
    }
}
