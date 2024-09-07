// 7.Prime number
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;

        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                System.out.println(num + " is not prime");
                break;
            }  else {
                System.out.println(num + " is prime");
                break;
            }
             
        }
    }
}
