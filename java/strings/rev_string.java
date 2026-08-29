import java.util.*;
public class rev_string {
public static void main(String[] args){
   Scanner sc = new Scanner(System.in); 
   String sr = sc.nextLine();
   String rv = "";
   for(int i = sr.length()-1; i >= 0; i --){
        rv += sr.charAt(i);  }
   System.out.println(rv);
   sc.close();
}
}

