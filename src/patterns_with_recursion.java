public class patterns_with_recursion {
    public static void main(String[] args) {
        pattern(4, 0);
    }

    public static void pattern(int rows, int cols) {
        if (rows == 0) return;

        if (cols < rows) {
            System.out.print("*");
            pattern(rows, cols + 1);
        } else {
            System.out.println();
            pattern(rows - 1, 0); // Now properly inside the else block
        }
    }
}