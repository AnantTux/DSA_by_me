import java.util.*;
public class maximum_item {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[7];
        System.out.println("Enter array elements: ");
        for(int i = 0; i <arr1.length; i++){
            arr1[i] = in.nextInt();
        }
        max(arr1);
//        System.out.println(Arrays.toString(arr1));

    }
    static void max(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
    System.out.println(maxVal);
    }
}
