import java.util.*;

public class binary_search_2d_array {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,48},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr, 37)));
//        Scanner sc = new Scanner(System.in); // 1. Initialize scanner first
//
//        System.out.println("Enter the number of rows: ");
//        int rows = sc.nextInt();
//
//        System.out.println("Enter the number of columns: ");
//        int cols = sc.nextInt();
//
//        // 2. Declare the matrix AFTER getting rows and cols
//        int[][] matrix = new int[rows][cols];
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.println("Enter the value of [" + i + "][" + j + "]: ");
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("The matrix is: " + Arrays.deepToString(matrix));
//
//        // Optional: Close the scanner when done
//        sc.close();
    }
    static int[] search(int[][] matrix, int target){
    int r = 0;
    int c = matrix.length - 1;
    while (r < matrix.length && c >= 0){
        if (matrix[r][c] == target){
            return new int[]{r,c};
        }
        if (matrix[r][c] < target){
            r++;
        }
        else {
            c--;
        }
    }
    return new int[]{-1,-1};
    }
}