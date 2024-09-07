//Pattern Question 5
// Pepcoding
import java.util.*; 
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sp = 1;
        int st = n/2 + 1;

        // Outer loop
        for(int i=1; i<=n; i++) {
            //Stars
            for(int j=1; j<=st; j++) {
                System.out.print("*\t");
            }
            //Spaces
            for(int j=1; j<=sp; j++) {
                System.out.print("\t");
            }
            //Stars
            for(int j=1; j<=st; j++) {
                System.out.print("*\t");
            }

            if(i <= n/2) {
                st--;
                sp += 2;
            } else {
                st++;
                sp -= 2;
            }
            
            System.out.println();
        }
    }
    
}
