package day_5_arrays;
// 1929
import java.util.*;
public class assignment_2 {
    public static void main(String[] args) {
    int[] nums = {1,2,1};
    System.out.println(Arrays.toString(leet_code(nums)));

    }
    public static int[] leet_code(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}
