import java.util.*;
public class strong {
    public static int fact(int n){
        int fact=1 ;
        for(int i=2 ; i<=n ; i++){
            fact *=i;
        }
        return fact;
    }
    public static boolean strongNumber(int n){
        int sum =0 ;
        int num = n ; 
        while(num!=0){
            int rem = num %10;
            sum = sum+fact(rem);
            num=num/10;
        }
        if(sum==n) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean ans = strongNumber(n);
        if(ans==true){
            System.out.println(n+" is a Prime Number");
        }
        else{
            System.out.println(n +" is not a Prime Number");
        }
        //for range of strong numbers
        for(int i=1 ; i<=n ; i++){
            ans = strongNumber(i);
            if(ans==true){
                System.out.print(i+" ");
            }
        }
    }
}
