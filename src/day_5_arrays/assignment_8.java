package day_5_arrays;
import java.util.*;
// 832
public class assignment_8 {
    public static void main(String[] args){

    }
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Grab from the end of the original row (m - 1 - j)
                int originalValue = image[i][m - 1 - j];

                // Invert the value (1 becomes 0, 0 becomes 1)
                result[i][j] = 1 - originalValue;
            }
        }
        return result;
    }
}
