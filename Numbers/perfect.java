import java.util.*;
public class perfect {
    public static boolean perfectNumber(int n){
        int sum=0;
        for(int i=1 ; i<n ; i++){
            if(n%i==0){
                sum +=i;
            }
        }
        if(sum==n) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean ans = perfectNumber(n);
        if(ans==true){
            System.out.println(n+" is a Perfect Number");
        }
        else{
            System.out.println(n +" is not a Perfect Number");
        }
        //for range of perfect numbers
        for(int i=1 ; i<=n ; i++){
            ans = perfectNumber(i);
            if(ans==true){
                System.out.print(i+" ");
            }
        }
    }
}
