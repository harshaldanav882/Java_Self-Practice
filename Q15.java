//15. Rotate a number
 // Pepcoding
import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        //count
        int temp = n;
        int nod = 0;
        while(temp > 0) {
            temp = temp / 10;
            nod++;
        }

        // For Negative key
        k = k % nod;  // if the key or k entered by tghe user is greater than count or nod then we will consider remainder of that num. as  a key
        if(k < 0) {
            k = k + nod;  // Here we are using the concept of positive key,  - ve value of key is added with + ve value of key,  then the + ve concept is applied here
        }

        // For positive Key
        int div = 1;
        int mul = 1;
        for(int i = 1; i<=nod; i++) {
            if(i <= k) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
    }
    int q = n / div;
    int r = n % div;

    int rot = r * mul + q;
    System.out.println(rot);

}    
}
