import java.util.*;
public class gcd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("GCD of "+n1+" and "+n2 +" is "+helper(n1,n2));
    }
    public static int helper(int n1 , int n2){
        if(n1==0) return n2;
        return helper(n2%n1 , n1);
    }
}
