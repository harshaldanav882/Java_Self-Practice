// Inverse of a number
// Pepcoding
import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int inv = 0;
        int op = 1; // original place
        while((n != 0)) {
            int od = n % 10; // Original digit // here we will get the lasg digit
            int id = op;  // original place will be inverted digit 
            int ip = od; //  original digit will be inverted place

            // Make changes to inv using ip and id
             inv = inv + id * (int)Math.pow(10, ip - 1);
             
            n = n / 10;  // getting last digit
            op++;
        }
        System.out.println(inv);
    }
}
