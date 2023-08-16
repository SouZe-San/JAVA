//^ 2.Wap to check if a number input is an Armstrong number or not.
class Armstrong {
    void check(int num) {
        int digit_count = String.valueOf(num).length();
        int number = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digit_count);
            num = num / 10;
        }
        if (sum == number) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}

public class CheckArmstrong {
    public static void main(String[] args) {
        Armstrong armstrong = new Armstrong();
        armstrong.check(153);
    }
}
