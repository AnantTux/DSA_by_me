import java.util.*;

public class candies13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();

        while (test_cases > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                list.add(a);
            }
            int total_time = 0;
            for (int i = 0; i < N - 1; i++) {
                Collections.sort(list);
                int sum = list.get(0) + list.get(1);
                total_time += sum;
                list.remove(0);
                list.remove(0);
                list.add(sum);
            }
            System.out.println(total_time);
            test_cases--;
        }
        sc.close();
    }
}
