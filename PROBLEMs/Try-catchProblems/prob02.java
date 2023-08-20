import java.util.Scanner;

public class prob02 {

    static void division(int deviant, int divisor) {
        try {
            double result = deviant / divisor;
            System.out.println("the Result is :" + result);
        } catch (ArithmeticException e) {
            System.out.println("Oops! Wrong input have given\n Please try to Give Correct input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the deviant :");
        int deviant = sc.nextInt();
        System.out.print("Enter the divisor :");
        int divisor = sc.nextInt();
        division(deviant, divisor);
        sc.close();
    }
}
