package day_1;// Take two numbers and print the sum of both.
import java.util.*;
public class assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.print("The sum of these two numbers is: " + c);
    }

}
