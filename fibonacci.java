import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of series ");
        int n= sc.nextInt();
        int n1=0 , n2=1 , n3 , temp;
        if(n==1){
            System.out.print(n1);
            return;
        }
        else if(n==2){
            System.out.print(n1 +" "+n2);
            return;
        }
        else{
            System.out.print(n1 +" "+n2);
            for(int i=3 ; i<=n ;i++){
                n3=n1+n2;
                n1=n2;
                n2=n3;
                System.out.print(" "+n3);
            }
        }
    }
}
