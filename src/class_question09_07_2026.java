import java.util.*;
class class_question09_07_2026 {
    public static void main(String[] args) {
        System.out.println("We're doing the Binary Search.");
        int[] arr = {1, 5, 2, 100};
        String str = "aaabbaccccdd";
        char[] charArray = str.toCharArray();
        int result = milk(10,6,15,10);
        System.out.println(result);
        // System.out.println(arr.length);
        // int target = arr[0];
        // int result = max_element(arr);
        // System.out.println("Max is: " + result);
        // System.out.println(max_element(arr));

    }
    public static int milk(int total_money, int cost_plastic,int cost_glass, int sell_glass) {
        int milk_in_lit = 0;
        int net_glass_cost = cost_glass - sell_glass;

        while (total_money >= cost_glass || total_money >= cost_plastic) {


            if (net_glass_cost < cost_plastic && total_money >= cost_glass) {
                milk_in_lit++;
                total_money = total_money - cost_glass;
                total_money = total_money + sell_glass;
            }

            else if (total_money >= cost_plastic) {
                milk_in_lit++;
                total_money = total_money - cost_plastic;
            }
            else {
                break;
            }
        }
        return milk_in_lit;
    }
    // static int[] searchRange(int[] nums, int target){
    //     int[] ans = {1,-1};
    //     int start = bin_search(nums, target, true);
    //     int end = bin_search(nums, target, false);
    //     ans[0] = start;
    //     ans[1] = end;
    //     return ans;

    // }
    // public static int bin_search(int[] nums, int target) {
    //     int start = 1;
    //     int end = nums.length - 2;
    //     while (start <= end){
    //         int mid = start + (end - start)/2;
    //         if (target > nums[mid]){
    //             start = mid + 1;
    //         }
    //         else if (target < nums[mid]){
    //             end = mid-1;
    //         }
    //         else {
    //             return mid;
    //         };
    //     }

    //     return -1;
    // }
    // public static int max_element(int[] nums){
    //  int max = nums[0];
    //  for (int i =0; i<nums.length; i++){
    //     if (max < nums[i]){
    //         max = nums[i];
    //     }

    //  }
    //  return max;
    // }
    public static int string_operation(char[] a){
        if (a.length == 0) return 0;

        int sum = 0;
        int count = 0;


        for (int i = 1; i < a.length; i++){
            if (a[i] == a[i-1]) {
                count++;
            }
            else{
                if (count % 2 == 0) sum = sum+count;
                count = 1;
            }
/*Ques 1 -
initialize the sum = 0;
initialize count = 0;
traverse the string from index 1 to n-1;
if the current char = prev_character, increment the count
if the count % 2 = sum = sum+count;

Ques 2 -
Given n rupee;
A liter plastic bottle costs R1;
A liter glass bottle costs R2;
But an empty glass bottle can be exchanged with R3;
Find the max lit of milk that can be bought with N rupee;*/
        }
        return sum;

    }

}
