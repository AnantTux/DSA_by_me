import java.util.*;

public class enhanced_for_loop {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 23, 6, 7, 8 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
