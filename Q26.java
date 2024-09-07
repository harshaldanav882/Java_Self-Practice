// Star patern- Single diagonal 6
// pepcoding
import java.util.*;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        //Outer loop
        for(int i=1; i<=n; i++) {
           //stars
           for(int j=1; j<=n; j++) {
            if(i == j) {
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
           }
           System.out.println();
        }
    }
    }
