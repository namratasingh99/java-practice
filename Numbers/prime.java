import java.util.*;
public class prime {
    public static boolean primeNumber(int n){
        int count=0;
        for(int i=1 ; i<=n ; i++){
            if(n%i==0) count++;
        }
        if(count==2) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean ans = primeNumber(n);
        if(ans==true){
            System.out.println(n+" is a Prime Number");
        }
        else{
            System.out.println(n +" is not a Prime Number");
        }
        //for range of prime numbers
        for(int i=0 ; i<=n ; i++){
            ans = primeNumber(i);
            if(ans==true){
                System.out.print(i+" ");
            }
        }
    }
}
