//Diamond shape star pattern 4
// Pepcoding
import java.util.*;
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = n/2;
        int st = 1;

        //Outerloop
        for(int i=1; i<=n; i++) {
            //Spaces
            for(int j=1; j<=sp; j++) {
                System.out.print("\t");
            }
            //Stars
            for(int j=1; j<=st; j++) {
                System.out.print("*\t");
            }
              if(i <= n/2) {
                sp--;
                st += 2;   // Here stars are increased by 2
              } else {
                sp++;
                st -= 2;  // Here stars are decreased by 2
              }
              System.out.println();
        }
    }
}