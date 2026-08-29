package day_2;
import java.util.*;

// Input currency in rupees and output in USD.
public class assignment_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in Rupee: ");
        double rupee = sc.nextDouble();
        double dollar = rupee / 96.25;

        // Use printf instead of println, using %f placeholders for the doubles
        System.out.printf("%.2f Rupee in Dollars are: $%.2f%n", rupee, dollar);
    }
}