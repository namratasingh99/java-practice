import java.util.*;
public class zeroesToend {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr = new int[n];
         for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]==0){
                continue;
            }
            else{
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j ; i<n ; i++){
            arr[i]=0;
        }
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}
    
