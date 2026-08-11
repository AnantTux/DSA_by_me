import java.util.*;
public class four_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(threeSum(arr, target));


    }
    public static List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        if (nums[0] > 0) return list;
        for(int a = 0; a < nums.length-3; a++ ) {
            if (a > 0 && nums[a] == nums[a - 1]) continue;
            for (int i = a+1; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                int j = i + 1;
                int k = nums.length - 1;
                while (k > j) {
                    int sum = nums[a] + nums[i] + nums[j] + nums[k];
                    if (target == sum) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++;
                        k--;
                        while (k > j && nums[j] == nums[j - 1]) j++;
                        while (k > j && nums[k] == nums[k + 1]) k--;
                    } else if (sum < target) j++;
                    else k--;
                }
            }
        }
        return list;
    }
}
