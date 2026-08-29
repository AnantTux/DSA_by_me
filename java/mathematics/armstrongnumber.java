import java.util.*;
public class armstrongnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_n = sc.nextInt();
        int arm_sum = armstrong(test_n);
        if (arm_sum == test_n) System.out.println("Yes, it's armstrong.");
        else System.out.println("No it's not.");
        sc.close();


    }
   public static int digits(int n){
       int count = 0;
       while(n != 0){
           count++;
           n = n/10;
       }
       return count;
   } 
   public static int pow(int n, int pow){
        int nw = 1;
        for(int i =0 ; i < pow; i ++){

            nw *= n;
        }
        return nw;
   }
   public static int armstrong(int n){
       int digits = digits(n);
       int sum = 0;
       while(n != 0){

           sum += pow(n%10, digits);
           n = n/10;
       }
       return sum;
   }
}
