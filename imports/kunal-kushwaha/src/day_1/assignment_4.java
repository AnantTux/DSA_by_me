package day_1;

import java.util.*;

public class assignment_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        long a = sc.nextLong();
        System.out.print("Enter the second number: ");
        long b = sc.nextLong();

        System.out.print("The HCF of the numbers is: " + hcf(a, b) + " and the LCM of the numbers is: " + lcm(a, b));
    }

    public static long hcf(long a, long b){
        while (b != 0){
            long remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static long lcm(long a, long b){
        long hcf = hcf(a, b);
        long lcm = (a / hcf) * b;
        return lcm;
    }
}