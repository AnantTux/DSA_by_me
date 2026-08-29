package day_2;
import java.util.*;
// Take name as input and print a greeting message for that particular name.
public class assignment_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s = sc.nextLine();
        System.out.println("Good morning " + s + ".");
    }
}
