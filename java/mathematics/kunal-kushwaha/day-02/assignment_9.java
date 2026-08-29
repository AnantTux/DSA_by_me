package day_2;
// To find Armstrong Number between two given number.
import java.util.*;

public class assignment_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start range for checking: ");
        int start = sc.nextInt();
        System.out.print("Enter the end range for checking: ");
        int end = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        while (start <= end) {
            if (arm_strong_checker(start)) {
                list.add(start);
            }
            start++;
        }
        System.out.println(list);
    }

    public static boolean arm_strong_checker(int n) {
        // FIX: Handle 0 and negative numbers explicitly
        if (n == 0) return true;
        if (n < 0) return false;

        int digits = (int) Math.log10(n) + 1;
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10;
        }

        return sum == n;
    }
}