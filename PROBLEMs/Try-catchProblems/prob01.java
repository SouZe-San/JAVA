import java.util.Scanner;

public class prob01 {
    static void getNumber() {
        int arr[] = { 2, 4, 23, 53, 54, 33, 21, 56, 76, 45, 3, 4, 23, 4 };
        System.out.println("The length of the array is: " + arr.length +
                "\n Type Your index Number : ");

        Scanner foo = new Scanner(System.in);
        int index = foo.nextInt();
        foo.close();
        try {
            System.out.println("the element you want to Access that is : " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sorry! your Input in Wrong");
        }

        System.out.println("Thank you for use ME!!");

    }

    public static void main(String[] args) {
        getNumber();
    }
}
