// Swastik star pattern
// Pepcoding
// i/p = 5 // odd no.s
import java.util.*;
public class Q40 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        // Outerloop
        for(int i=1; i<=n; i++) {
            // Innerloops
            for(int j=1; j<=n; j++) {
                if(i == 1) {
                    if(j == n || j <= n/2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if(i <= n/2) {
                    if(j == n || j == n/2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if(i == n/2 + 1) {
                    System.out.print("*\t");
                } else if(i < n) {
                    if(j == 1 || j == n/2 + 1 ) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    if(j == 1 || j >= n/2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
    
}
