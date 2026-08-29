package day_3;
import java.util.*;
//1281. Subtract the Product and Sum of Digits of an Integer
public class assignment_2 {
    public static void main(String[] args){
        int n = 4421;
        int ans = sum_product(n);
        System.out.println(ans);
    }
    public static int sum_product(int n){
        int product = 1;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            product = product*digit;
            sum = sum+digit;
            n = n/10;
        }
        return product-sum;
    }
}
