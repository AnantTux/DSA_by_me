import java.util.*;
public class string_operations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
//        System.out.print("Enter 2nd number: ");
//        int number2 = sc.nextInt();
        String st = String.valueOf(number);
//        String st2 = String.valueOf(number2);
//        System.out.println("String: " + st);
//        System.out.print(st.equals(st2) ? "Yes" : "No");
//        System.out.print(st.substring(0, 2));
          sample(st);
          int n = 6;
          int[] arr = new int[n];
          System.out.print("Enter array elements: ");
          for(int i=0; i<n; i++){
              arr[i] = sc.nextInt();
          }
          System.out.println(Arrays.toString(arr));
    }
    public static void sample(String number2){
        String smp = "1";
        if (number2.equals(smp)) System.out.println("True");
        else System.out.println("False");
    }
}
