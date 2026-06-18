import java.util.*;
public class palindrome {
    public static boolean palindromeNumber(int n){
        int num = n ;
        int rev =0 ; 
        while(num!=0){
            int rem = num%10;
            rev = rev*10 + rem;
            num=num/10;
        }
        if(rev==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt(); 
        boolean ans = palindromeNumber(n);
        if(ans==true){
            System.out.println(n + " is a Palindrome Number");
        }
        else{
            System.out.println(n +" is not a Palindrome Number");
        }
        //for printing the range of palindrome numbers
        for(int i=0 ; i<=n ; i++ ){
            ans=palindromeNumber(i);
            if(ans==true){
                System.out.print(i + " ");
            }
        }
    }
}
