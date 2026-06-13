import java.util.*;
public class ArraysofArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());
        arr.get(0).add(2);
        arr.get(0).add(5);
        arr.add(new ArrayList<>());
        arr.get(1).add(7);
        arr.get(1).add(8);
        arr.get(1).add(9);
        System.out.println(arr);   
        for(int i=0 ; i<arr.size() ; i++){
            for(int j=0 ; j<arr.get(i).size() ; j++){
                System.out.print(arr.get(i).get(j) +" ");
            }
            System.out.println();
        }
    }
}
