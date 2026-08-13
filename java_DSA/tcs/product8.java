import java.util.*;

public class product8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();
        long product = 1;
        while (N > 0) {
            long temp = N % 10;
            product = product * temp;
            N = N / 10;
        }
        System.out.println(product);
    }
}
