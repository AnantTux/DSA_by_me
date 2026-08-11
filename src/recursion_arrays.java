import java.util.ArrayList;

public class recursion_arrays {
    public static void main(String[] args) {
    int[] arr = {1,2,3,3,3,6,1,2,3,3};
    System.out.println("Index List: " + findAllIndex(arr, 3, 0));
    }
    public static boolean sorted_array_or_not(int[] arr, int index) {
        if (index == arr.length-1) return true;
        return arr[index] <= arr[index+1] && sorted_array_or_not(arr, index+1);
    }
    public static int find_index(int[] arr, int value, int index){
        if (index == arr.length) return -1;
        if (arr[index] == value) return index;
        return find_index(arr, value, index+1);

    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) return list;
        if (arr[index] == target) list.add(index);
        ArrayList<Integer> andFromBelowCalls = findAllIndex(arr, target, index+1);
        list.addAll(andFromBelowCalls);
        return list;
    }
}
