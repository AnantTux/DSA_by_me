package day_2;
import java.util.*;

// To find out whether the given String is Palindrome or not.
public class assignment_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string for palindrome check: ");
        String given_string = sc.nextLine();

        int a = given_string.length() - 1;

        // Handle empty or single character strings quickly
        if (given_string.length() <= 1) {
            System.out.println("The given string is a palindrome.");
            return; // Exit early since we already know the answer
        }

        // Assume it is a palindrome until proven otherwise
        boolean isPalindrome = true;

        // We only need to check up to the middle of the string (length / 2)
        for(int i = 0; i <= given_string.length() / 2; i++){
            if (given_string.charAt(i) != given_string.charAt(a - i)) {
                isPalindrome = false; // Found a mismatch!
                break;                // Stop checking immediately; no need to continue
            }
        }

        if (isPalindrome){
            System.out.println("The given string is a palindrome.");
        }
        else {
            System.out.println("The given string is not a palindrome.!");
        }
    }
}