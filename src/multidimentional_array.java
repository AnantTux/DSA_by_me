import java.util.Scanner;
public class multidimentional_array { // this is array of arrays
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    /*
    1 2 3
    2 4 6
    3 5 8
    */
//    int[][] arr = new int[3][]; // Numbers of columns is not necessary to specify
//
//    int[][] arr2 = {
//            {1, 2, 3}, //zeroth index
//            {4, 5, 6}, //first index
//            {5, 4, 2} //second index
//    };
//    int[][] arr3 = {
//            {1, 2, 3},
//            {4, 5, 6, 5, 6},
//    };
//    individual size of the arrays can vary
        int[][] arr = new int[3][4];
    for (int row = 0; row < arr.length; row++){
        for (int col =0; col < arr[row].length; col++){
            arr[row][col] = in.nextInt();
        }
    }
        for (int row = 0; row < arr.length; row++){
            for (int col =0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
