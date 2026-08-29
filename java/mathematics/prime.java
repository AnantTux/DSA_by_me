import java.util.*;
public class prime {

   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   
        int n = sc.nextInt();
        if (n <= 1) System.out.println("It's 0.");
        boolean a = check(n);
        if(a == true) System.out.println("Is Prime.");
        else System.out.println("Is not prime.");
        sc.close();
   }
   
   public static boolean check(int a){
       boolean n = true;
       for(int i =2; i < a;i++ ){
           if (a%i == 0){
              n = false; 
           }
       }
       return n;
   }

}
