//^ 1. WAP to find the sum of every even numbers in an array. If all the array values are odd then print “ No even value found .“
class EvenFind {
    void sumOfEven(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        if (sum == 0) {
            System.out.println("No Even Value found :>>");
        } else {
            System.out.println("The sum of even of array is: " + sum);
        }

    }
}

public class SumOfEven {
    public static void main(String[] args) {

        int[] num_arr = { 1, 2, 35, 3, 24, 17, 0, 4, 287, 2576, 2, 7, 8, 4, 32, 5,
                4, 675, 674, 45, 2, 43, 64, 5 };
        EvenFind even = new EvenFind();
        even.sumOfEven(num_arr);
    }
}
