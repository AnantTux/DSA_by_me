package day_2;
import java.util.*;
// Take 2 numbers as input and print the largest number.
public class assignment_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }
        else if (a == b) {
            System.out.println(a + " is equal to " + b);
        }
        else {
            System.out.println(a + " is less than " + b);
        }
    }
}
