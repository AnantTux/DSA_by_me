import java.util.*;
public class lcmOftwo {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int temp1 = a;


       int b = sc.nextInt();
       int temp2 = b;
       while(b != 0){
           int temp = a%b;
           a = b;
           b = temp;
       }
       int gcd = a;
       int lcm = temp1*temp2/gcd;
       System.out.println(lcm);
       sc.close();
   }

}
