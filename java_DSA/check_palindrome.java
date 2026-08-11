import java.util.*;
public class check_palindrome {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int temp = n;
       int rev = 0;
       while(n != 0){
           rev = rev*10 + n%10;
           n = n / 10;
       }
       if(temp == rev){
           System.out.print("Yes the number is palindome");

       }
       else {
           System.out.println("No the number is not palindome.");
       }
       sc.close();
   } 
}
