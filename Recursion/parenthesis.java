import java.util.*;
public class parenthesis {
    public static void helper(int n ,String ans , int left , int right) {
        if(right==n){
            System.out.print(ans +" ");
        }     
        if(left<n) helper(n,ans+"(" , left+1 , right);
        if(right<left) helper(n , ans+")" , left , right+1);
    }
    public static void generateParenthesis(int n){ 
     helper(n ,"",0 , 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of parenthesis");
        int n = sc.nextInt();
        generateParenthesis(n);
    }
}
