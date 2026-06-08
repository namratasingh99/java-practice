import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String result="";
        int i=s.length()-1 ;
        while(i>=0){
            result +=s.charAt(i);
            i--;
        }
        System.out.println("Reverse is " + result);
    }
}
