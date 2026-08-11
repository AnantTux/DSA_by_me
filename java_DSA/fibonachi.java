
import java.util.*;

public class fibonachi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = 6; 
        
        fibo(a, b, n); // Passed as: a, b, n
        sc.close();
    }

    // Fixed parameter order to match the main method
    public static void fibo(int a, int b, int n) {
        int fibo = 0;
        
        // Loop runs n times to find the nth number
        for (int i = 1; i <= n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
        }
        System.out.println(fibo);        
    }
}



