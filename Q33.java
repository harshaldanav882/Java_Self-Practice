// Triangle with Fibonacci no.  --> Number Pattern
//Pepcoding
import java.util.*;
public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a = 0;
        int b = 1;
        //Outer loop
        for(int i=1; i<=n; i++) {
            //Numbers
            for(int j=1; j<=i; j++) {
                System.out.print(a +"\t");
                int c = a + b;   // Fibonacci logic
                a = b;
                b = c;

            }
            System.out.println();
        }
    }
    
}
