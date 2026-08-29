import java.util.*;

public class juan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        while (R > 0) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= min && arr[i] <= max) {
                    count++;
                }
            }
            System.out.print(count + " ");
            R--;
        }
        sc.close();
    }
}
