// Star patern- Single diagonal 7
// pepcoding
import java.util.*;
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Outerloop
        for(int i=1; i<=n; i++) {
            // Stars
            for(int j=1; j<=n; j++) {
                if(i+j == n+1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    
}
