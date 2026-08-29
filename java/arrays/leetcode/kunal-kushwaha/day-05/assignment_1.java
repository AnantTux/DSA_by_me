package day_5_arrays;
import java.util.*;
// 1920
public class assignment_1 {
    public static void main(String[] args){
        int[] nums = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(leet_code(nums)));
    }
    public static int[] leet_code(int[] a){
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ans[i] = a[a[i]];
        }
        return ans;
    }
}
