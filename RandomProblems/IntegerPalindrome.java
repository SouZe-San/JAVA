import java.util.Scanner;

class palindrome {
    void checkOut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be evaluated");
        int userInput = sc.nextInt();
        sc.close();
        int temp = userInput; // storing a copy of the userInput here.
        int reverse = 0, remainder;

        while (temp > 0) { // am reversing the number here
            remainder = temp % 10;
            reverse = (reverse * 10) + remainder;
            temp = temp / 10;
        }
        if (reverse == userInput) {
            System.out.println("Its a palindrome number");
        } else {
            System.out.println("Its not a palindrome number");
        }

    }
}

public class IntegerPalindrome {
    public static void main(String args[]) {
        palindrome pp = new palindrome();
        pp.checkOut();
    }
}