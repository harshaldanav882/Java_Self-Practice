// Star Pattern 3
// Pepcoding
import java.util.*;
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sp = 0;
        int st = n;

        //Outer loop
        for(int i=1; i<=n; i++) {
            //Space
            for(int j=1; j<=sp; j++) {
                System.out.print("\t");
            }
            //Stars
            for(int j=1; j<=st; j++) {
                System.out.print("*\t");
            }

            sp++;
            st--;
            System.out.println();
        }
    } 
}
