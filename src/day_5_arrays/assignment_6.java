package day_5_arrays;
// 1365
import java.util.*;
public class assignment_6 {
    public static void main(String[] args){
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(count_smaller(nums)));

    }
    public static int[] count_smaller(int[] nums){
        int[] result = new int[nums.length];
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            for(int j = 0; j< nums.length; j++){
                if (nums[i] > nums[j]) count++;
            }
            result[i] = count;
            count = 0;
        }
    return result;
    }
}
