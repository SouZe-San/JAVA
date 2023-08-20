import java.util.Scanner;

public class prob03 {

    static void exceptionTestGround() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array index");
        int index = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with");

        int[] marks = { 32, 43, 54, 64, 65, 76 };
        try {
            int divisor = sc.nextInt();
            System.out.println("The value at array index entered is: " + marks[index]);
            System.out.println("The value of array-value/number is: " + marks[index] / divisor);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred!");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println("Give the Correct Input");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some other exception occurred \n input Should Be Integer");
            System.out.println(e);
        }
        sc.close();
    }

    public static void main(String[] args) {
        // Method Call
        exceptionTestGround();

        // ^ If we Change the Order of the Catch block then it will cause an error,
        // Cause
        // is we placed an general exception class Upper then, The Specific class which
        // placed under those are become unreachable...

    }
}
