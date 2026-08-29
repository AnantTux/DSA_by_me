import java.util.*;

public class two_eight_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        sc.close();
        int val = 0;
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != val) {
                arr[i] = arr[j];
                i++;
            }
        }
        while (i < arr.length) {
            arr[i] = 0;
            i++;
        }
    }
}
