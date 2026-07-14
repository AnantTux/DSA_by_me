import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of terms : ");
        int n = input.nextInt();
        System.out.print(fib(n));
    }
    public static int fib(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
}
