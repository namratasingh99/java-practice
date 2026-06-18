import java.util.*;
public class automorphic {
    public static boolean automorphicNumber(int n){
        int square = n*n ;
        if(n<9){
            if(square%10 == n) return true;
            else return false;
        }
        while(n!=0){
            int a = square %10;
            int b = n %10;
            if(a!=b) return false;
            n = n/10;
            square = square/10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        boolean ans = automorphicNumber(n);
        if(ans==true){
            System.out.println(n + " is a Automorphic Number");
        }
        else{
            System.out.println(n +" is not a Automorphic Number");
        }
        //to print the range of automorphic numbers to n 
        for(int i=1 ; i<=n ; i++ ){
            ans=automorphicNumber(i);
            if(ans){
                System.out.print(i + " ");
            }
        }
    }
}
