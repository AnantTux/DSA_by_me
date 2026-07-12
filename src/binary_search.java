// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class binary_search {
    public static void main(String[] args) {
        System.out.println("We're doing Binary Search!!");
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;
        int found_element = binary_search_algo(a, target);
        System.out.println("Found " + target + " at " + found_element + "th index");
    }
    static int binary_search_algo(int[] arr, int target){
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        // System.out.println(start + " " + end);
        while (start <= end) {
            int middle = start + (end - start)/2;
            if (target < arr[middle]) end = middle - 1;
            else if (target > arr[middle]) start = middle + 1;
            else return middle;
        }
        return -1;
    }

}