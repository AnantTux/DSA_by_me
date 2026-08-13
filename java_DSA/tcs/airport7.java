import java.util.*;

public class airport7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 0)
                c0++;
            else if (arr[i] == 1)
                c1++;
            else
                c2++;
        }
        int idx = 0;
        while (c0 > 0) {
            arr[idx] = 0;
            idx++;
            c0--;
        }
        while (c1 > 0) {
            arr[idx] = 1;
            idx++;
            c1--;
        }
        while (c2 > 0) {
            arr[idx] = 2;
            idx++;
            c2--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
