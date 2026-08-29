package day_2;
// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;
public class assignment_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter the time in years: ");
        double t = sc.nextDouble();
        System.out.print("Enter the rate: ");
        double r = sc.nextDouble();
        double simple_interest = p*r*t/100;
        System.out.println("The interest is: " + simple_interest);
        System.out.println("The total amount = " + (p+simple_interest));
    }

}
