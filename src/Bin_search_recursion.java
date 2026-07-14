public class Bin_search_recursion {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,9,10,11};
        int s = 0;
        int e = arr.length-1;
        int result_index = bin(arr, 10, s, e);
        System.out.println(result_index);
    }
    public static int bin(int[] arr, int target, int s, int e){
        if (s > e) {
            return -1;
        }
        int m = s + (e - s)/2;
        if(arr[m] == target){
            return m;
        }
        if (arr[m] < target){
            return bin(arr, target, s+1, e);
        }
        return bin(arr, target, s, m-1);
    }
}
