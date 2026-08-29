package day_5_arrays;
import java.util.*;
// 1480
public class assignment_3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(leet_code(nums)));

    }
    public static int[] leet_code(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}