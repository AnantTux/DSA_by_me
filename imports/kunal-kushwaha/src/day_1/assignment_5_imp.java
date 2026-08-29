package day_1;

import java.util.*;

// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class assignment_5_imp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalSum = 0;

        while (true) {
            System.out.print("Enter the number(or 'x' to calculate the sum) : ");
            String userInput = sc.nextLine();

            if (userInput.equalsIgnoreCase("x")) {
                break;
            }

            try {
                totalSum += Double.parseDouble(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }

        System.out.println("The sum of all the entered numbers is: " + totalSum);
        sc.close(); // Good practice to close the scanner
    }
}