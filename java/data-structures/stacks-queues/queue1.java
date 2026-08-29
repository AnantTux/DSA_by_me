import java.util.*;

public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(23);
        q.add(234);
        q.add(1);
        q.add(10);
        q.add(12);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
