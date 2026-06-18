import java.util.*;
public class happy {
    public static boolean happyNumber(int n){
        while(n!=1 && n!=4){
            int sum=0;
            while(n!=0){
                int rem = n%10;
                sum +=rem*rem;
                n=n/10;
            }
            n=sum;
        }
        if(n==1) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean ans = happyNumber(n);
        if(ans==true){
            System.out.println(n + " is a Happy Number");
        }
        else{
            System.out.println(n +" is not a Happy Number");
        }
        //to print the range of happy numbers to n 
        for(int i=1 ; i<=n ; i++ ){
            ans=happyNumber(i);
            if(ans){
                System.out.print(i + " ");
            }
        }
    }
}
