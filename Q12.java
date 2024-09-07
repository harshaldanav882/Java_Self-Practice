// Digits of a number
//pepcoding
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int temp = n;
        while(temp != 0) {
            temp = temp / 10;
            count++;
        }

        int div = (int)Math.pow(10, count - 1);
        while ((div != 0)) {
            int q = n / div; 
            System.out.println(q);

            n = n % div;   // get the remainder of the no.
            div = div / 10; // Remove the last digit of the div
        }

    }
    
}
