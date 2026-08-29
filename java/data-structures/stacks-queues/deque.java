import java.util.*;

public class deque {
    public static void main(String[] args) {
        // basically allows us to add and remove from both ends
        Deque<Integer> d = new ArrayDeque<>();
        // used in bfs and dfs printing left to right and right to left
        d.add(89);
        d.addLast(23);
        d.removeFirst();
        d.removeLast();
    }
}
