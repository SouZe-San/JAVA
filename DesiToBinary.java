import java.util.Scanner;

// 3. WAP to Convert a decimal number to its binary form. Accept decimal number
// at run-time.
class DecimalBinary {
    void convertBinary(int num) {
        int[] binary_count = new int[32]; // It Only Convert til 32 bits
        int count = 0;
        while (num > 0) {
            binary_count[count] = num % 2;
            num = num / 2;
            count++;
        }
        for (int j = count - 1; j >= 0; j--) {
            System.out.print(binary_count[j]);
        }
    }
}

public class DesiToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalBinary dTOb = new DecimalBinary();
        System.out.println("Enter The Decimal Number : ");
        dTOb.convertBinary(sc.nextInt());
        sc.close();
    }
}
