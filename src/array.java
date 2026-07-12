import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 19;
//        System.out.println(a);
        String name = "Anant Kaurav";
//        Syntax
//        datatype[] variable_name = new datatype[size];
        int[] roll1 = new int[5];
        int[] roll2 = {4, 5, 23, 34};
        int[] roll3; //declaration
        roll3 = new int[6]; //initialization
//        without declaring by default array stores 0 on every index
        String[] arr = new String[5];
//        by default string array stores null
        roll1[0] = 1;
        roll1[1] = 43;
        roll1[2] = 23;
        roll1[3] = 34;
        System.out.println(roll1[0]);
//        in case the array is very long we can use the for loop
        for(int i = 0; i <roll1.length; i++) {
//            System.out.println("Enter the roll number "+i +" ");
            roll1[i] = in.nextInt();
        }
    /*Another way for printing the array*/
        System.out.println(Arrays.toString(roll1));
    }
}
