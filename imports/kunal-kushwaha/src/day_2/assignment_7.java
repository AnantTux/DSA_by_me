package day_2;
import java.util.*;

// To calculate Fibonacci Series up to n numbers.
public class assignment_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many terms of the Fibonacci series to print: ");
        int terms = input.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            // Compute the next term
            int next = first + second;
            // Shift the numbers forward for the next loop iteration
            first = second;
            second = next;
        }
        System.out.println(); // Just to clear the line at the end
    }
}