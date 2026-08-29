import java.util.*;

public class bank9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        // double T = sc.nextDouble(); just for the input purpose
        double N1 = sc.nextDouble();
        double A = 0;

        for (double i = 0; i < N1; i++) {
            double[] arr = new double[2];
            arr[0] = sc.nextDouble();
            arr[1] = sc.nextDouble();
            A += emi(P, arr[1], arr[0]) * (arr[0] * 12);
        }
        double N2 = sc.nextDouble();
        double B = 0;
        for (double i = 0; i < N2; i++) {

            double[] arr1 = new double[2];

            arr1[0] = sc.nextDouble();
            arr1[1] = sc.nextDouble();
            B += emi(P, arr1[1], arr1[0]) * (arr1[0] * 12);
        }

        sc.close();
        if (B > A) {
            System.out.println("Bank A");
            return;
        } else if (A > B) {
            System.out.println("Bank B");
            return;
        }
    }

    public static double emi(double P, double mir, double T) {
        mir = mir / (12 * 100);
        return P * mir / (1 - 1 / Math.pow((1 + mir), T * 12));
    }
}
