public class Recursion {
    public static void main(String[] args){
        print(1);
    }
    public static void print(int n){
        System.out.print(n + " ");
        if (n == 5) return;

        print(n+1);
    }
}
