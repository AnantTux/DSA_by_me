import java.util.*;
public class factorial {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int fact = factorial(a);
System.out.println("Factorial: " + fact);
sc.close();
}
    public static int factorial(int a){
        int l = 1;
        for(int i = 1; i <= a; i++){
            l = l*i;
        }
        return l;
    }    
}
