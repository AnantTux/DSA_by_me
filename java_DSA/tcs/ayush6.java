import java.util.*;

public class ayush6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();

        if (a.length() != b.length()) {
            System.out.println("-1");
            return;
        }

        boolean[] track = new boolean[26];
        for (int i = 0; i < a.length(); i++) {
            track[a.charAt(i) - 'a'] = true;
        }

        // Validation checks
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) < b.charAt(i)) {
                System.out.println("-1");
                return;
            }
            if (!track[b.charAt(i) - 'a']) {
                System.out.println("-1");
                return;
            }
        }

        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        int moves = 0;

        for (char ch = 'z'; ch >= 'a'; ch--) {
            boolean need_changes = false;

            // Step 1: Scan array B and modified array A to see if 'ch' is needed
            for (int i = 0; i < A.length; i++) {
                if (B[i] == ch && A[i] != ch) {
                    need_changes = true;
                    break; // Exit scan loop once we know 'ch' is needed
                }
            }

            // Step 2: Outside the scan loop, apply the operation if needed
            if (need_changes) {
                moves++;
                for (int j = 0; j < B.length; j++) {
                    if (B[j] == ch) {
                        A[j] = ch; // Update array A using index 'j'
                    }
                }
            }
        }

        System.out.println(moves);
    }
}