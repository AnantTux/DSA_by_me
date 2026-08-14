import java.util.*;

public class logic15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Math.pow(arr[i], 2) % 100;
        }
        System.out.println(sum);
    }
}
