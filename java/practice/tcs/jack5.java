import java.util.*;

public class jack5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        if (!sc.hasNextInt())
            return;

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        long beats = 1;
        for (int i = 0; i < N; i++) {
            int cycleLength = 0;
            int curr = i;

            do {
                curr = arr[curr] - 1;
                cycleLength++;
            } while (curr != i);

            beats = lcm(cycleLength, beats);
        }

        System.out.println(beats);
        sc.close();
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long num1, long num2) {
        if (num1 == 0 || num2 == 0)
            return 0;
        return (num1 / gcd(num1, num2)) * num2;
    }
}
