// Star Patterns
// Pepcoding
import java.util.*;
public class Q22 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int sp = n-1; // Space
        int st = 1; //Star
    
        //Outer loop mns Row
        for(int i=1; i<=n; i++) {
              // Spaces
             for(int j=1; j<=sp; j++) {
                System.out.print("\t");
             }

             // Stars
             for(int j=1; j<=st; j++) {
                System.out.print("*\t");
            }

            sp--;
            st++;
            System.out.println();

    }
}
}
