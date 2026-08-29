package day_5_arrays;

import java.util.Arrays;

// kids with candies
public class assignment_5 {
    public static void main(String[] args){
    int[] nums = {1,2,3,1,1,3};
    System.out.println(good_pair(nums));
    }
    public static int good_pair(int[] nums){
        int add = 0;
        for(int i = 0; i< nums.length; i++){
            for(int j = 0; j< nums.length; j++){
                if (nums[i] == nums[j] && i<j){
                    add++;
                }
            }
        }
        return add;
    }

}
