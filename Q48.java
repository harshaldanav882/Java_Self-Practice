//Any Base Subtraction
// pepcoding
// i/p => b=8; n1=256; n2=1212; n2 must be greater
import java.util.*;
public class Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int  d = getDifference(b, n1, n2);
        System.out.println(d);
    }

      public static int  getDifference(int b, int n1, int n2) {
            int rv = 0;

            int c = 0; // borrow
            int p = 1;

            while(n2 > 0) {
                int d1 = n1 % 10;
                n1 = n1 / 10;
                int d2 = n2 % 10;   // n2 will be Greater than n1
                n2 = n2 / 10;

                // imp. subtraction logic
                int d = 0;
                d2 = d2 + c; // if d2 is unable to subtract then onli carry 1 i.e 8 is borrowed from left

                if(d2 >= d1) {  // d2 is able to manage the subtraction
                    c = 0;
                    d = d2 - d1;
                } else { // d2 is unable to manage the subtraction
                    c = -1;  // Here -1 mns 8 is borrowed
                    d = d2 + b - d1;
                }
                // till. here imp. subtraction logic

                rv = rv + d * p;
                p = p * 10;
            }

            return rv;
      }
    
}
