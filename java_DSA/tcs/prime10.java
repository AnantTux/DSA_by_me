import java.util.*;

public class prime10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Use long to prevent integer overflow for large constraints
        if (!sc.hasNextLong()){
            sc.close();
            return;
        }
        long N = sc.nextLong();
        sc.close();

        long sum = 2;
        long currentPrime = 2;
        int count = 0;

        while (true) {
            // Get the next consecutive prime and add it to the running sum
            currentPrime = nextPrime(currentPrime);
            sum += currentPrime;

            // Stop if the running sum exceeds N
            if (sum > N) {
                break;
            }

            // If the cumulative sum itself is prime, increment count
            if (isPrime(sum)) {
                count++;
            }
        }

        System.out.println(count);
    }

    // Classic, straightforward isPrime function
    public static boolean isPrime(long n) {
        if (n < 2)
            return false;

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a divisor, so it's NOT prime
            }
        }

        return true; // No divisors found, so it IS prime
    }

    // Helper to find the next prime number after 'n'
    public static long nextPrime(long n) {
        long next = n + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }
}
