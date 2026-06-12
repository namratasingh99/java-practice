import java.util.*;
public class snakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int [][] arr = new int[row][column];
        System.out.println("Enter the elements");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Array");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Array traversal in snake pattern");
        for(int i=0 ; i<row ; i++){
            if(i%2 ==0){
               for(int j=0 ; j<column ; j++){
                System.out.print(arr[i][j] +" ");
               }
            }
            else{
               for(int j=column-1 ; j>=0 ; j--){
                System.out.print(arr[i][j]+" ");
               }
            }        
        }
    }
}
