import java.util.*;

public class P01_freq_count {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "programming";
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
    }
}
