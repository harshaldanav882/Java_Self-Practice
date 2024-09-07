// Star pattern hollow diamond
//pepcoding
//Input will be odd no. only
import java.util.*;
public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int os = n/2;
        int is = -1;

        //outerloop
        for(int i=1; i<=n; i++) {
             //Outer Spaces
             for(int j=1; j<=os; j++) {
                System.out.print("\t");
             }

             //Stars
             System.out.print("*\t");

             //Inner Spaces
             for(int j=1; j<=is; j++) {
                System.out.print("\t");
             }

             //For Initial and Final Star mns i is not a First and last row then print single *
               if(i>1 && i<n) {
                System.out.print("*\t");
               }

             // For Outer and Inner Spaces
             if(i <= n/2) {
                os--;
                is += 2;
             } else {
                os++;
                is -= 2;
             }

             
        System.out.println();
        }
    }
}
