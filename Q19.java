//Benjamin Bulbs
//Pepcoding
import java.util.*;
public class Q19 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();

          for(int i = 1; i <= Math.sqrt(n); i++) {
            System.out.println(i * i);
          }
    }
}
