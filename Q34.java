// Number Pattern pNc type 
//pepcoding
// i/p = 5
import java.util.*;
public class Q34 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    //outer loop
    for(int i=0; i<=n; i++) {
        int icj = 1;   // mns 5c0 = 1
        // inner loop
        for(int j=0; j<=i; j++) {
           System.out.print(icj + "\t");
           int icjp1 = icj * (i - j) / (j + 1); // i C j plus 1 (icjp1)
           icj = icjp1;
        }
        System.out.println();
    }
}
}
