import java.util.*;
public class check_even_odd {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0) System.out.println("It's neither even nor odd.");
        else{
            boolean x = check(a);
            if(x == true){
                System.out.println("It's even.");

            }
            else if (x == false){
                System.out.println("It's odd.");
            }
        }
        sc.close();
    }
    public static boolean check(int a){
        if(a%2 == 0){
            return true;
        }
        else return false;
    }
}
