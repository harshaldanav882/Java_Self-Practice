// Count digits in a number
//Pepcoding
import java.util.*;
import java.util.*;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        while(num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
    
}
