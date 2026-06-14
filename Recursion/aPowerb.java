import java.util.*;
public class aPowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a raise to  b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result is = " + power(a,b));
    }
    public static int power(int a , int b){
        if(b==1) return a;
      //  return a *power(a,b-1);
        if(b%2==0){
            return (power(a,b/2)*power(a,b/2));
        }
        else{
             return (power(a,b/2)*power(a,b/2))*a;
        }
    }
}
