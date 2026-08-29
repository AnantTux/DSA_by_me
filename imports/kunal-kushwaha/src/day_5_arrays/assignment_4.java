package day_5_arrays;
// 1470
import java.util.*;
public class assignment_4 {
    public static void main(String[] args) {
    int[] nums = {2,5,1,3,4,7};
    int n = 3;
    System.out.println(Arrays.toString(leet_code(nums,n)));
    }
    public static int[] leet_code(int[] nums, int n){
        int[] result = new int[n*2];

        for(int i = 0; i< n; i++){
            result[2*i] = nums[i];
            result[2*i+1] = nums[i+n];
        }
        return result;
    }
}
