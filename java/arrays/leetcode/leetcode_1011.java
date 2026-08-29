import java.util.Arrays;

public class leetcode_1011 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int capacity = shipWithinDays(arr, 5);
        System.out.println(capacity);
    }
    public static int shipWithinDays(int[] weights, int days) {
        int max = sum(weights);
        int min = max(weights);
        int return_val = max;
        while(min <= max){
        int middle = min + (max - min)/2;
        if(canShip(weights, days, middle)){
            return_val = middle;
            max = middle -1;
        }
        else {min = middle + 1;}
        }
        return return_val;
    }
    private static boolean canShip(int[] weights, int days, int capacity) {
        int daysNeeded = 1;
        int currentLoad = 0;
        for (int i = 0; i < weights.length; i++) {
            if (currentLoad + weights[i] > capacity) {
                daysNeeded++;
                currentLoad = 0;
            }
            currentLoad = currentLoad + weights[i];
        }

        return daysNeeded <= days;

    }
    public static int sum(int[] weights) {
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum = sum + weights[i];
        }
        return sum;
    }
    public static int max(int[] weights) {
        int max = weights[0];
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > max) {
                max = weights[i];
            }
        }
        return max;
    }

}
