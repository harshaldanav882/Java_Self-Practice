// 1.Positive or Negative number 
// Prepinsta
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num >= 0) {
            if(num > 0) {
               System.out.println(num + " is positive");
            } else {
                System.out.println(num + " is zero");
            }
        } else System.out.println(num + " is negative");
    }
}