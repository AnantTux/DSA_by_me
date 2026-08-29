import java.util.Arrays;

public class merge_sort {
    @SuppressWarnings("args")
    public static void main(String[] args){
    int[] arr = {12,12,4,245,2,35,2,3424,5,23,4,34667,54,64,56,54,6,3};
    int left = 0;
    int right = arr.length-1;
    mergeSort(arr,left,right);
    System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int left, int right){
        if (left >= right) return;
        int mid = left + (right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr, mid + 1, right);
        merge(arr,left,mid,right);

    }
    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i< n1; i++){
            L[i] = arr[left+i];
        }
        for (int j = 0; j< n2; j++){
            R[j] = arr[mid+1+j];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
    public static void inplace_mergesort(int[] arr, int start, int end){
        if (end - start == 1) return;
        int mid = start + (end-start)/2;
        inplace_mergesort(arr,start,mid);
        inplace_mergesort(arr,mid,end);
        merge_in_place(arr, start, mid, end);

    }
    public static void merge_in_place(int[] arr, int start, int mid, int end){
        int[] mix = new int[end-start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end){
            if(arr[i] <= arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
        }
        while (i < mid){
            mix[k] = arr[i++];
            k++;

        }
        while (j < end){
            mix[k] = arr[j++];
            k++;
        }
        for(int l = 0;l<mix.length;l++){
            arr[start+l] = mix[l];
        }
    }
}
