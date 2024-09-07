//Prime Factorization
//Pepcoding
import java.util.*;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        for(int div = 2; div <= Math.sqrt(n); div++) {
               while(n % div == 0 ) {
                    n = n / div;
                    System.out.println(div);
               }
        }
        if(n != 1) {
            System.out.println(n);  // No. will be the factor of itself
        }
    }   
}
