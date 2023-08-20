import java.util.Scanner;

public class Methodes_regretion {
    /**
     * @param a
     * @return int
     */
    static int facto(int a) {
        if (a == 0 || a == 1) {
            return 1;

        } else {
            return a * facto(a - 1);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner KeybordInPut = new Scanner(System.in);// WANT INPUT FROM DISPLAY OR USER

        System.out.println("Enter the number------>");
        int x = KeybordInPut.nextInt();
        System.out.println("The factorial of " + x + " is : " + facto(x));
        KeybordInPut.close();
    }
}
