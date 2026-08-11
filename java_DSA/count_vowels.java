import java.util.*;
public class count_vowels {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String srt = sc.nextLine().toLowerCase();
        int v = 0;
        int c = 0;
        for(int i = 0; i < srt.length(); i++){
            char ch = srt.charAt(i);
            if('a' <= ch && ch<= 'z'){
                switch(ch){
                    case 'a':
                        v++;
                        break;
                    case 'e':
                        v++;
                    
                        break;
                    case 'i':
                        v++;
                        break;
                    case 'o':
                        v++;
                        break;
                    case 'u':
                        v++;
                        break;
                    default:
                        c++;
                        break;
                }
            }
        }
        System.out.println(v);
        System.out.println(c);
        sc.close();
   } 
}
