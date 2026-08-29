package day_3;
import java.util.*;
//Input a number and print all the factors of that number (use loops).
public class assignment_3 {
    public static void main(String[] args) {
        int n = 48;
        System.out.println(factors(40));
    }
    public static ArrayList<Integer> factors(int n){
        int i = 2;
        ArrayList<Integer> factors = new ArrayList<>();
        while(n>1){
            if (n%i==0) {
                factors.add(i);
                n=n/i;
            }
            else {
                i++;
            }

        }
        return factors;

    }
}
