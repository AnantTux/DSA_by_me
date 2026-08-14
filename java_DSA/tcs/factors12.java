import java.util.*;

public class factors12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nth = sc.nextInt();
        sc.close();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                list.add(i);
            }
        }
        Collections.sort(list);
        if (nth > list.size()) {
            System.out.println('1');
            return;
        }
        System.out.println(list.get(nth));
    }
}
