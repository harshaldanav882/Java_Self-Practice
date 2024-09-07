// 8. Numbers Prime
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5

        for(int i = 0; i<n; i++) {
             int t = sc.nextInt();  // 12345

            int count = 0;
             for(int j = 1; j<= t; j++) {
                if(t % j == 0) {
                    count++;
                } 
             }
             if(count == 2) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}
