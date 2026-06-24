import java.util.*;
public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        int i=0 ; 
        while(i<s.length()){
            int j=i;
            char ch = s.charAt(i);
            while(j<s.length()&&ch==s.charAt(j)){
                j++;
            }
            if(i==j-1){
                stack.push(s.charAt(i));
            }
            i=j;
        }
        System.out.println(stack);
    }
}
