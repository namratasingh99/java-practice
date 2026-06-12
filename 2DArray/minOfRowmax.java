import java.util.*;
public class minOfRowmax{
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
        int maxRow=0;
        for(int i=0 ; i<column ; i++){
            if(arr[0][i]>maxRow){
                maxRow=arr[0][i];
            }
        }
        int min = maxRow;
        for(int i=1 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                if(arr[i][j]>maxRow){
                    maxRow=arr[i][j];
                }
            }
            if(maxRow<min){
                min=maxRow;
            }
        }   
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Minimum element from Maximum elements from each row = "+min);     
    }
}
