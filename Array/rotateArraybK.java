import java.util.*;
public class rotateArraybyK {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elemnts");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of r by which you have to rotate the array");
        int r = sc.nextInt();
        int i=0,j=r-1;
       while(i<j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
       i=r;
       j=n-1;
       while(i<j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
        i=0;
        j=n-1;
       while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++;
            j--;
        }
        System.out.println("Array after rotation");
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}
