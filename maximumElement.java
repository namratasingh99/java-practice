import java.util.Scanner;
public class maximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elemnts");
        for(int i=0 ; i<n ; i++)
            arr[i]=sc.nextInt();
        int max=Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Maximum element is "+max);
    }
}
