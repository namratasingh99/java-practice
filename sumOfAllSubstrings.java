import java.util.*;
public class sumOfAllSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers string");
        String s= sc.nextLine();
        int sum=0;
        for(int i=0 ; i<s.length() ; i++){
            for(int j=i+1 ; j<=s.length() ; j++){
                 sum += Integer.parseInt(s.substring(i,j));
            }
        }
        System.out.println("Sum = "+sum);
    }
}
