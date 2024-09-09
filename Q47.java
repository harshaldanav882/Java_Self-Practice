// Any Base Addition
// Pepcoding
// i/p => b = 8; n1 = 236; n2 = 754
import java.util.*;
public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        int rv = 0;

        int c = 0;  // Quotient // carry
        int p = 1;   // Power
        while(n1 > 0 || n2 > 0 || c > 0 ) {
            int d1 = n1 % 10; // remainder 1
            int d2 = n2 % 10; // remainder 2
            n1 = n1 / 10;
            n2 = n2 / 10;

            int d = d1 + d2 + c;  // remainder 1 + 2 + Quotient in terms of 8
            c = d / b;
            d  = d % b;

            rv += d * p;
            p = p * 10;
        }

        return rv;
    }
}
