// Decimal to Any Base mns Decimal to Binary or Ocatal
// Pep coding
// Decimal to Octal => n=634  b=8
// Decimal to Binary => n=10  b=2
import java.util.*;
public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int dn = getValueInBase(n,b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int rv = 0;

        int p = 1;
        while(n > 0) {
            int dig = n % b;
            n = n / b;

            rv += dig * p;
            p = p * 10;
        }

        return rv;
    }
}
