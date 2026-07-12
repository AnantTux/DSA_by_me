import java.util.*;
public class basic_array_operations {
    static Scanner take_input = new Scanner(System.in);
    public static void main(String[] args){

        System.out.print("Enter the size of the array: ");
        int a = take_input.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[] array_name = new int[a];
        for(int i = 0; i <array_name.length; i++){
            array_name[i] = take_input.nextInt();
        }
//        insert_element_at_the_beginning(array_name);
//        insert_element_at_any_position(array_name);
//        insert_element_at_the_end(array_name);


    }
    public static void insert_element_at_the_beginning(int arr[]){
        System.out.println("Enter the element to insert: ");
        int element = take_input.nextInt();
        for(int i = arr.length - 2; i >= 0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = element;
        System.out.println(Arrays.toString(arr));
    }
    public static void insert_element_at_any_position(int arr[]){
        System.out.println("Enter the element to insert: ");
        int element = take_input.nextInt();
        System.out.println("Enter the index of the element to insert: ");
        int position = take_input.nextInt();
        for(int i = arr.length - 2; i >= position; i--){
            arr[i+1] = arr[i];
        }
        arr[position] = element;
        System.out.println(Arrays.toString(arr));
    }
    public static void insert_element_at_the_end(int arr[]){
        System.out.println("Enter the element to insert: ");
        int element = take_input.nextInt();
        for(int i = 1; i < arr.length -1; i++ ){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = element;
        System.out.println(Arrays.toString(arr));
    }
}
