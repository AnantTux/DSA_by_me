public class linear_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 66, 7, 6};
        int target = 7;
        int result = linear_search(arr, target);
        System.out.println("Element found at index: " + result);
    }

    static int linear_search(int[] arr, int target) {
        // Edge case: check this first before looping
        if (arr.length == 0) return -1;

        // A single loop is all you need for linear search
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i; // Found it
            }
        }

        return -1; // Corrected: Return -1 if the loop finishes without finding the target
    }

    static boolean string_linear_search(String str, char target) {
        if (str.length() == 0) return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) return true;
        }
        return false;
    }
}