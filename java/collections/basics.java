import java.util.*;

public class basics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Mango", 40);

        //
        map.put("Apple", 60); // will update the value
        // System.out.println("The Price of apple is: " + map.get("Apple"));
        // System.out.println(map.containsKey("Apple"));
        // System.out.println(map.containsValue(20));
        // System.out.println(map.remove("Mango"));
        // System.out.println(map.size());
        String[] arr = { "apple", "banana", "apple", "orange", "banana", "apple" };
        HashMap<String, Integer> freqMap = new HashMap<>();
        for (String word : arr) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
    }
}
