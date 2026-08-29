import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class four_sum {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(fourSum(arr, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int a = 0; a < nums.length - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) continue;

            for (int i = a + 1; i < nums.length - 2; i++) {
                if (i > a + 1 && nums[i] == nums[i - 1]) continue;

                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    int sum = nums[a] + nums[i] + nums[j] + nums[k];
                    if (target == sum) {
                        list.add(Arrays.asList(nums[a], nums[i], nums[j], nums[k]));
                        j++;
                        k--;
                        while (j < k && nums[j] == nums[j - 1]) j++;
                        while (j < k && nums[k] == nums[k + 1]) k--;
                    } else if (sum < target) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }

        return list;
    }
}
