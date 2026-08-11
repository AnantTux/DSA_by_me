public class basic_recursion {

    public static void main(String[] args) {
//        if(palindrome(123326)) System.out.println("palindrome");
//        else System.out.println("not palindrome");
        System.out.println(count_zeroes(0));
        System.out.println(124/2);
    }

    public static void print1(int n){
        System.out.print(n + " ");
        if(n>1)  print1(n-1);
        return;
    }
    public static void print2(int n){
        if (n == 0) return;
        print2(n-1);
        System.out.print(n + " "); //put this above print2 function, and it will print 1 2 3 4 ...n
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
    public static boolean palindrome(int n){
        if (n < 10) return true;
        else if (reverse_num_2(n) == n) return true;
        else return false;
    }
    public static int count_zeroes(int n){
        return helper_2(n, 0);
    }
    public static int helper_2(int n, int count){
        if (n == 0) return 1;
        int remainder = n%10;
        if (remainder == 0) return helper_2(n/10, count + 1);
        return helper_2(n/10, count);

    }
}
