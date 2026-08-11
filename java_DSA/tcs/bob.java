import java.util.*;

public class bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        int bet = 0;
        int maxHorses = 0;
        while (j < N) {
            bet = bet + arr[j];
            while (bet > K && i <= j) {
                bet = bet - arr[i];
                i++;
            }
            if (bet < K)
                maxHorses = Math.max(maxHorses, j - i + 1);
            j++;
        }
        System.out.println(maxHorses);
        sc.close();

    }
}
