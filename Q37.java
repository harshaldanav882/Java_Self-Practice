//Number pattern
//pepcoding
//i/p = 4
import java.util.*;
public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int st = 1;         // Stars
        int sp = 2 * n - 3;     // Spaces

        //outerloop
        for(int i=1; i<=n; i++) {
            int val = 1;
            // Innerloop
            //stars
            for(int j=1; j<=st; j++) {
                System.out.print(val + "\t");
                val++;
            }
            // Spaces
            for(int j=1; j<=sp; j++) {
                System.out.print("\t");
            } 

          
            if(i == n) {   
                st--;    // This loop is bcoz we will get extra 1 star at the last, to handle that star we will be using this
                val--;    // This is bocz we will get 432 in next half of a last row, but we need 321, soo we are using val--
            }

            //stars
            for(int j=1; j<=st; j++) {
                val--;  // bocz value must start from 3 in next half in third row
                System.out.print(val +"\t");
            }

            st++;
            sp -= 2;

            System.out.println();
        }
    }
    
}
