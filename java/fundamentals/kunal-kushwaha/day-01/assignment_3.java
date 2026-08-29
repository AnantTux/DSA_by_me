package day_1;// Take a number as input and print the multiplication table for it.
import java.util.*;
public class assignment_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to print the table of: ");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }
}
