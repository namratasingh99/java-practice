import java.util.*;
public class fibonacci {
    static int a=0 , b=1;
    public static void fibo(int n){
        if(n<1) return ;
        int c= a+b;
        a=b;
        b=c;
        System.out.print(c +" ");
        fibo(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of terms in fibonacci series");
        int n = sc.nextInt();
        if(n==1) System.out.println(0);
        else if(n==2) System.out.println("0 1");
        else {
           System.out.print("0 1 ");
           fibo(n-2);
        }
    }
}
