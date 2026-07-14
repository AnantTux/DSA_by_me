public class basic_recursion {

    public static void main(String[] args) {
        int rev = reverse_num_2(123456);
        System.out.println(rev);
    }

    public static void print1(int n){
        System.out.print(n + " ");
        if(n>1)  print1(n-1);
        return;
    }
    public static void print2(int n){
        if (n == 0) return;
        print2(n-1);
        System.out.print(n + " "); //put this above print2 function and it will print 1 2 3 4 ...n
    }
    public static int factorial(int n){
        if (n == 0) return 1;
        return factorial(n-1)*n;
    }
    public static int sum(int n){
        if (n == 1) return 1;
        return sum(n-1)+n;
        }
    public static int sum_of_digits(int n){
        if (n < 10) return n;
        int remainder = n%10;
        return sum_of_digits(n/10)+remainder;
    }
    public static int product_of_digits(int n){
        if (n < 10) return n;
        int remainder = n%10;
        return product_of_digits(n/10)*remainder;
    }
    static int sum = 0;
    public static void reverse_num(int n){
        if (n == 0) return;
        int remainder = n%10;
        sum = sum*10+remainder;
        reverse_num(n/10);
    }
    public static int reverse_num_2(int n){
        int digits = (int)Math.log10((n)) + 1;
        return helper(n, digits);
    }
    public static int helper(int n, int digits){
        if (n%10 == n) return n;
        int remainder = n%10;
        return remainder * (int)Math.pow(10, digits -1) + helper(n/10, digits-1);
    }

}
