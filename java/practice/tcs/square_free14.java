import java.util.*;

public class square_free14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (N % i == 0)
                list.add(i);
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            int d = list.get(i);
            boolean isSqFree = true;
            for (int j = 2; d >= j * j; j++) {
                if (d % (j * j) == 0) {
                    isSqFree = false;
                    break;
                }

            }
            if (isSqFree) {
                count++;
            }
        }
        System.out.println(count);
    }
}
