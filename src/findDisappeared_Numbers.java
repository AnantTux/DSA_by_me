import java.util.*;
class findDisappeared_Numbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        sort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i+1) {
                ans.add(i+1);
            }
        }
        return ans;
    }
    public static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct_index = arr[i] - 1;
            if (arr[i] != arr[correct_index]){
                swap(arr, i, correct_index);
            } else{
                i++;
            }
        }
    }
    public static void swap(int[] arr, int i, int correct_index) {
        int temp = arr[i];
        arr[i] = arr[correct_index];
        arr[correct_index] = temp;
    }
}