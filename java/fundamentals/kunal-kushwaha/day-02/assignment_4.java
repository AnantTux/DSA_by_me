package day_2;
import java.util.*;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class assignment_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter the operation that you want to perform (+, *, /, %, -): ");
        // Using sc.next() avoids the leftover newline bug
        String s = sc.next();

        if (s.equals("+")) {
            System.out.println(a + b);
        }
        else if (s.equals("*")) {
            System.out.println(a * b);
        }
        else if (s.equals("/")) {
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Error: Division by zero.");
            }
        }
        else if (s.equals("%")) {
            System.out.println(a % b);
        }
        else if (s.equals("-")) {
            System.out.println(a - b); // Fixed order: a - b
        }
        else {
            System.out.println("Can't find the operation.");
        }

        sc.close();
    }
}