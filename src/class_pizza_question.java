import java.util.*;

public class class_pizza_question {

    static int countDistinct(int[] a, int left, int right) {
        int distinctCount = 0;

        for (int i = left; i <= right; i++) {
            boolean isFirstOccurrence = true;
            for (int j = left; j < i; j++) {
                if (a[i] == a[j]) {
                    isFirstOccurrence = false;
                    break;
                }
            }
            if (isFirstOccurrence) {
                distinctCount++;
            }
        }
        return distinctCount;
    }

    static void longest(int[] a, int n, int k) {
        int maxLen = 0;
        int start = 0, end = 0;

        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                if (countDistinct(a, l, r) <= k) {
                    int currentLen = r - l + 1;
                    if (currentLen > maxLen) {
                        maxLen = currentLen;
                        start = l;
                        end = r;
                    }
                }
            }
        }

        System.out.println("Maximum pizzas Bob can eat: " + maxLen);
        System.out.println("Alice's pizza sequence spans from index " + start + " to " + end);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 1, 2, 3, 4, 1, 2, 1};
        int n = a.length;
        int k = 2;

        System.out.println("Alice's Pizza Line: " + Arrays.toString(a));
        System.out.println("Bob's Diet Limit (Max Flavors): " + k);

        longest(a, n, k);
    }
}