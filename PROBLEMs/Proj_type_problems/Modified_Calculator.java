
import java.util.Scanner;

/*     Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
*/

class wrongInputException extends Exception {
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Not More than 100 Digit";
    }

}

public class Modified_Calculator {
    public static void Input(int a) throws wrongInputException {
        if (a > 100) {
            throw new wrongInputException();
        }
    }

    static int Addition(int in1, int in2) {
        return in1 + in2;
    }

    public static int Subtraction(int in1, int in2) {
        return in1 - in2;
    }

    public static int Multiplication(int in1, int in2) {
        return in1 * in2;
    }

    public static int Division(int in1, int in2) throws ArithmeticException {
        return in1 / in2;
    }

    public static void main(String[] args) {
        System.out.println("We Take Only Two Input");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int input1;
        int input2;
        while (flag) {
            try {
                System.out.println("Enter the values");
                input1 = sc.nextInt();
                input2 = sc.nextInt();

                try {
                    Input(input1);
                    Input(input2);
                    flag = false;
                } catch (Exception e) {
                    System.out.println("Pls Re_Enter Input, You have put wrong inputs");
                    System.out.println(e.toString());
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("Now Chose Which Operation you want to performs");
        System.out.format(" 1. + -> Addition \n2. - -> Subtraction \n3. * -> Multiplication \n4. / -> Division\n");
        System.out.print("Enter Choice: ");
        int op = sc.nextInt();
        sc.close();
        input1 = op;
        switch (op) {
            case 1:
                System.out.println("The result of the Operation: " + Addition(6, 7));
                break;
            case 2:
                System.out.println("The result of the Operation: " + Subtraction(input1, 5));
                break;
            case 3:
                System.out.println("The result of the Operation: " + Multiplication(input1, 5));
                break;
            case 4:
                try {
                    System.out.println("The result of the Operation: " + Division(input1, 5));
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;

            default:
                System.out.println("Wrong Choice");
                break;
        }
    }
}
