import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args){
        int[] arr = {5, 2, 8, 1, 9};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int start, int end){
        if (start >= end) return;
        int i = start;
        int j = end;
        int pivot = arr[start + (end - start) / 2];
        while(i<=j){
            while (arr[i] < pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if(i<=j){
                swap(arr,i,j);
                i++;
                j--;
            }

        }
        quickSort(arr,start,j);
        quickSort(arr,i,end);
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
