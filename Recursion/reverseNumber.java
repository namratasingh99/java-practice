import java.util.*;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        reverse(n);
    }
    public static void reverse(int n){
        if(n==0) return ;
        System.out.println(n%10);
        reverse(n/10);
    }
}
