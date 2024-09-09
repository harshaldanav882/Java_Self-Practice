// Arrow star pattern
//pepcoding
//i/p will -ve no.s only
import java.util.*;
public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = n/2;
        int st = 1;
        //outerloop
        for(int i=1; i<=n; i++) {
            //Innerloop
            //spaces
            for(int j=1; j<=sp; j++) {
                if(i == n/2 + 1) {     // Special case to print * in spaces section
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }  
            }

            //stars
            for(int j=1; j<=st; j++) {
                System.out.print("*\t");
            }

            if(i <= n/2) {
                st++;
            } else {
                st--;
            }

            System.out.println();
        }
    }
}

