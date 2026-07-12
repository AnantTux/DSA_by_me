import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args){
        int[] arr = {1,5,6,546,34,5,234,5,123,4,45,2,45,2,3452};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j > 0; j --){
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }
}
