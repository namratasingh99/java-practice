import java.util.*;
public class powerSet {
    public static void helper(String s , String ans , int idx){
        if(idx==s.length()) {
            if(ans.length()!=0) System.out.print(ans+" ");
            return;
        }
        helper(s,ans+s.charAt(idx),idx+1);
        helper(s,ans,idx+1);

    }
    public static void powerSet(String s){
        helper(s,"",0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string");
        String s= sc.nextLine();
        powerSet(s);
    }
}
