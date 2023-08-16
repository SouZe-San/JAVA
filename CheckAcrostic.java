import java.util.Scanner;

//^ 7. WAP to verify if a 2D matrix is an Acrostic or not.
class Acrostic {
    void acrosticCheck(char arr[][], int col, int row) {
        boolean flag = true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] != arr[j][i]) {
                    flag = false;
                }
            }
        }

        if (flag) {
            System.out.println("this is ACROSTIC");
        } else {
            System.out.println("This is not acrostic");
        }
    }
}

public class CheckAcrostic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, col;
        System.out.println("Enter column number: ");
        col = sc.nextInt();
        System.out.println("enter the row number: ");
        row = sc.nextInt();

        System.out.println("Enter the string input in array : ");
        char[][] arr = new char[row][col];
        for (int i = 0; i < row; i++) {
            arr[i] = sc.next().toCharArray();
        }
        Acrostic matrix = new Acrostic();
        matrix.acrosticCheck(arr, col, row);
        sc.close();
    }
}
