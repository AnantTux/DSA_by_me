package day_5_arrays;
import java.util.*;
// 1832
public class assignment_7 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(sentence));

    }
    public static boolean isPangram(String sentence) {

        boolean[] seen = new  boolean[26];
        int unique_count = 0;
        for(int i = 0; i< sentence.length(); i++){
            int index = sentence.charAt(i) - 'a';
            if(!seen[index]){
                seen[index] = true;
                unique_count++;
            }

        }
        return unique_count == 26;
        }
}
