import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,2435,564,576,34,5,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int last = arr.length -i -1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++){
            if (arr[i] > arr[max]){
                max = i;
            }

        }
        return max;

    }
    public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }
}
