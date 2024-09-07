// 3.Sum of First N Natural numbers 
// Prepinsta
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=num; i++) {
           sum += i;
        }
        System.out.println(sum);
    }
}
