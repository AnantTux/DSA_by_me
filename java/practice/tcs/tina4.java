import java.util.*;

public class tina4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Number of coordinates
        sc.close();
        if (N == 0) {
            System.out.println(4);
            return;
        }
        if (N == 1) {
            System.out.println(3);
            return;
        }
        int[] x = new int[N];
        int[] y = new int[N];
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            set.add(x[i] + "," + y[i]);
        }
        int minPointstoAdd = 2;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int dx = Math.abs(x[j] - x[i]);
                int dy = Math.abs(y[j] - y[i]);
                String p3_a = (x[i] - dy) + "," + (y[i] + dx);
                String p4_a = (y[j] - dy) + "," + (y[j] + dx);
                if (set.contains(p3_a) && set.contains(p4_a)) {
                    minPointstoAdd = 0;
                    break;
                } else if (set.contains(p3_a) || set.contains(p4_a)) {
                    minPointstoAdd = Math.min(minPointstoAdd, 1);
                }
                String p3_b = (x[i] + dy) + "," + (y[i] - dx);
                String p4_b = (y[j] + dy) + "," + (y[j] - dx);
                if (set.contains(p3_b) && set.contains(p4_b)) {
                    minPointstoAdd = 0;
                    break;
                } else if (set.contains(p3_b) || set.contains(p4_b)) {
                    minPointstoAdd = Math.min(minPointstoAdd, 1);
                }
                if (minPointstoAdd == 0)
                    break;
            }
        }
        System.out.println(minPointstoAdd);
        sc.close();
    }
}
