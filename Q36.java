// Number's Diamond Pattern
// Pepcoding
//i/p = 5
import java.util.*;
public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = n/2;
        int st = 1;
        int val = 1;
        //outerloop
        for(int i=1; i<=n; i++) {
            //innerloop
            // spaces
            for(int j=1; j<=sp; j++) {
                System.out.print("\t");
            }

            //stars
            int cval = val;  // deleaing with inside no. of a diamond
            for(int j=1; j<=st; j++) {
                System.out.print(cval + "\t");

                if(j <= st / 2) {  // Dealing with left and right side of mid elements of a diagonal
                    cval++;
                } else {
                    cval--;
                }
            }

            if(i <= n/2) {
                sp--;
                st += 2;
                val++;
            } else {
                sp++;
                st -= 2;
                val--;
            }

            System.out.println();
        }
    }
    
}
