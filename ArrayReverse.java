import java.util.Scanner;

// 6. WAP to accept integer inputs into 3 rows and 5 columns.
// Display the contents of each row in reverse.
class ArrayDisplay {
    int[][] twoD_arr = new int[3][5];

    void inputInArray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.format("Enter %dth Rows input: ", i + 1);
            for (int j = 0; j < 5; j++) {
                twoD_arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    void Display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 4; j >= 0; j--) {
                System.out.print(" " + twoD_arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

public class ArrayReverse {
    public static void main(String[] args) {
        ArrayDisplay array = new ArrayDisplay();
        array.inputInArray();
        array.Display();
    }
}
