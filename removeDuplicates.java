import java.util.*;
public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        for(int num :arr){
            if( set.contains(num)) continue;
            set.add(num);
        }
        System.out.println("After removing duplicates");
        for(int num : set){
            System.out.print(num+" ");
        }
    }
}
