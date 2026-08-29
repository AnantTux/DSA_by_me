import java.util.*;

public class twenty_six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arr = a.split(",");
        int[] arr1 = new int[arr.length];
        int c = 0;
        sc.close();
        for (String num : arr) {
            arr1[c] = Integer.parseInt(num.trim());
            c++;
        }
        System.out.println(Arrays.toString(arr1));

        // 0,0,1,1,1,2,2,3,3,4
        int i = 0; // i tracks the last unique element position

        for (int j = 1; j < arr1.length; j++) {
            if (arr1[j] != arr1[i]) {
                i++;
                arr1[i] = arr1[j]; // Move unique element forward
            }
        }

        // i is now accessible here, and i + 1 gives the total count
        System.out.println(i + 1);
    }
}
