import java.util.*;

public class gold3 {
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
        int sum = 0;
        int maxRooms = 0;
        int bestI = -1;
        int bestJ = -1;
        while (j < N) {
            sum = sum + arr[j];
            while (sum > K && i <= j) {
                sum = sum - arr[i];
                i++;
            }
            if (sum <= K) {
                int currentRooms = j - i + 1;
                if (currentRooms > maxRooms) {
                    maxRooms = currentRooms;
                    bestI = i;
                    bestJ = j;
                }
                j++;
            }
        }
        System.out.println(bestI + " " + bestJ);
        sc.close();
    }
}
