import java.util.*;
public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column for first matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] arr1 = new int[r1][c1];
        System.out.println("Enter the elements of first matrix");
        for(int i=0 ; i<r1 ; i++){
            for(int j=0 ; j<c1 ; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the row and column for second matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][] arr2 = new int[r2][c2];
        System.out.println("Enter the elements of Second matrix");
        for(int i=0 ; i<r2 ; i++){
            for(int j=0 ; j<c2 ; j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int[][] res = new int[r1][c2];
        if(c1!=r2){
            System.out.println("Not Possible");
            return;
        }
        else{
             for(int i=0 ; i<r1 ; i++){
                for(int j=0 ; j<c2 ; j++){
                    for(int k=0 ; k<r2 ; k++){
                        res[i][j] += arr1[i][k]*arr2[k][j]; 
                    }
                }
            }
        }
        System.out.println("After Multiplication");
        for(int i=0 ; i<r1 ; i++){
            for(int j=0 ; j<c2 ; j++){
                System.out.print(res[i][j] +" ");
            }
            System.out.println();
        }
    }
}
