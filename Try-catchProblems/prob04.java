import java.util.Scanner;

// !Demonstrating the nested exception handling

public class prob04 {
    static void inputCollector() {
        // Ask for input until correct Input...
        boolean flag = true;
        int[] marks = { 32, 43, 54, 64, 65, 76 };
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.println("Enter the value of index");
            int index = sc.nextInt();
            try {
                System.out.println("Welcome to our Vision World");
                try {
                    System.out.println(marks[index]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");
        sc.close();
    }

    static void divisorInput() {
        Scanner foo = new Scanner(System.in);
        int[] marks = { 32, 43, 54, 64, 65, 76 };
        System.out.println("Enter the value of index");
        int index = foo.nextInt();
        System.out.println("Enter the Divisor");
        int divisor = foo.nextInt();
        foo.close();
        try {
            int deviant = marks[index];
            System.out.println("The Element is " + deviant);
            try {
                System.out.println("after the Division The Result is : " + (deviant / divisor));
            } catch (Exception e1) {
                System.out.println(e1);
                System.out.println("Sorry ! Can't Divisible");
            }
        } catch (Exception e2) {
            System.out.println(e2);
            System.out.println("()pps! The Index Input is Wrong <>>");
        }

    }

    public static void main(String[] args) {
        inputCollector();
    }
}
