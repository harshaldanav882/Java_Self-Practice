// Digit Frequency
// Pepcoding
import java.util.*;
public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = getDigitdrequency(n,d);
        System.out.println(f);
    }

    public static int getDigitdrequency(int n, int d) {
        int rv = 0;   // Counter
         
        while(n > 0) {
            int dig = n % 10;
            n = n / 10;

            if(dig == d){
                rv++;
            }
        }
        return rv;
    }
    
}
