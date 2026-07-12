import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort (arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct_index = arr[i] - 1;
            if (arr[i] != arr[correct_index]){
            swap(arr, i, correct_index);
            }
            else {
                i++;
            }
        }

    }
    public static void swap(int[] arr, int i, int correct_index){
        int temp = arr[i];
        arr[i] = arr[correct_index];
        arr[correct_index] = temp;
    }
}
