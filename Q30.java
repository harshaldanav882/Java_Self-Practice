// Number Pattern 
//Pepcoding
import java.util.*;
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int val = 1;
        // Outer Loop
        for(int i=1; i<=n; i++) {
            //Numbers
            for(int j=1; j<=i; j++) {
                System.out.print(val + "\t");
                val++;
            }
            System.out.println();
        }
    }  
}
