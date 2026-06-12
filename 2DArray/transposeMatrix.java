import java.util.*;
public class transposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows for square matrix");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int [][] arr = new int[row][column];
        int [][] transpose = new int[column][row];
        System.out.println("Enter the elements");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Before transpose");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        for(int i=0 ; i<row ; i++){
            for(int j=0; j<column ; j++){
                transpose[j][i]=arr[i][j];
            }
        }
        System.out.println("After transpose");
        for(int i=0 ; i<column ; i++){
            for(int j=0 ; j<row ; j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
