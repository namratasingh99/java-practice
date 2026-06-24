import java.util.*;
public class compressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String ans="";
        Stack<Character> stack = new Stack<>();
         int i=0 ; 
        while(i<s.length()){
            int count=0;
            char ch = s.charAt(i);
            ans +=ch;
            if(stack.isEmpty()){
                stack.push(ch);
            }
            while(i<s.length()&&stack.peek()==s.charAt(i)){
                count++;
                i++;
            }
            stack.pop();
            ans +=count;
        }
        System.out.println(ans);
    }
}
