import java.util.*;
public class reversePartArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index");
        int i=sc.nextInt();
        int j=sc.nextInt();
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
         for(int num : arr){
            System.out.print(num +" ");
        }
    }  
}
