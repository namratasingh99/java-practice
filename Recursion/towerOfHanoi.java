import java.util.*;
public class towerOfHanoi {
    public static void hanoi(int n , char src , char aux , char dest ){
        if(n==0){
            return;
        }
        hanoi(n-1,src,dest,aux);
        System.out.print(src+"-"+dest+" ");
        hanoi(n-1,aux,src,dest);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of disks");
        int n = sc.nextInt();
        hanoi(n,'A' , 'B' , 'C');
    }
}
 
