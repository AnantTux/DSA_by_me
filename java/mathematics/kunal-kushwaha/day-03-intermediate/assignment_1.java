package day_3_intermediate;
// Factorial Program In Java
public class assignment_1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        int factorial = 1;
        if (n == 0 || n == 1) return factorial;
        while(n>0){
            factorial = factorial * n;
            n--;
            }
        return factorial;
        }

    }