import java.util.*;
public class armstrong {
    public static boolean armstrongNumber(int n){
        int num = n ;
        int count=0;
        int sum =0 ;
        while(num!=0){
            count++;
            num = num/10;
        }
        num=n;
        while(num!=0){
            int rem = num%10;
            sum+=Math.pow(rem,count);
            num=num/10;
        }
        if(sum==n){
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
        boolean ans = armstrongNumber(n);
        if(ans==true){
            System.out.println(n + " is a Armstrong Number");
        }
        else{
            System.out.println(n +" is not a Armstrong Number");
        }
        //to print the range of Armstrong numbers to n 
        for(int i=0 ; i<=n ; i++ ){
            ans=armstrongNumber(i);
            if(ans==true){
                System.out.print(i + " ");
            }
        }
    }
}
