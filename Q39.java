// Hour Pattern == Star patern
// Pepcoding
// i/p = 7 // Odd no.s only
import java.util.*;
public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = 0;
        int st = n;
        // outerloop
        for(int i=1; i<=n; i++) {
            //Innerloop
                // Spaces
                for(int j=1; j<=sp; j++) {
                    System.out.print("\t");
                }

                //stars
                for(int j=1; j<=st; j++) {
                    if(i > 1 && i <= n/2 && j > 1 && j < st) {
                        System.out.print("\t");
                    } else {
                        System.out.print("*\t");
                    }
                    
                }

                if(i <= n/2) {
                    sp++;
                    st -= 2;
                } else {
                    sp--; 
                    st += 2;
                }
                 System.out.println();
        }
    }
    
}
