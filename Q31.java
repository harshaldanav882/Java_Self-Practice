// Number Pattern 
//Self Consideration
import java.util.*;
public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int val = 1;
        // Outer Loop
        for(int i=1; i<=n; i++) {
            //Numbers
            for(int j=1; j<=i; j++) {
                System.out.print(i + "\t");
                
            }
            System.out.println();
        }
    }  
}
