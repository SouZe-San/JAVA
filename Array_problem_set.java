// ---------------------------- IF WANT TO RUN THE CODE THEN COMMMENT OUT OTHER AND THEN RUN ONE BY ONE -----------------------
import java.util.Scanner;

public class Array_problem_set {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/* 
 //--------> 1. Create an array of 5 floats and calculate their sum.
        /*
          float[] arr = { 43.3f, 53.5f, 53.53f, 67.00f, 62.f };
          float sum = 0;
          for (float i : arr) {
          sum += i;
          }
          System.out.println("The total of tht array: " + sum);
          */ 
//---------->  2. Write a program to find out whether a given integer is present in an array or not.
         /*
          float[] marks = { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f };
          System.out.print("Enter the number whicjh u want find: ");
          float num = input.nextFloat();
          boolean find = false;
          for (float element : marks) {
          if (num == element) {
          find = true;
          break;
          }
          }
          if (find) {
          System.out.println("Foound!!!!");
          } else {
          System.out.println("not found BCD@@@");
          }
           */
          // 3.Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
           /* 
          sum = 0;
          for (float number : marks) {
          sum += number;
          }
          float average = sum / marks.length;
          System.out.println("the Average of the marrks array is: " + average);
         */
 // -------> 4. Create a Java program to add two matrices of size 2x3.
        // 2D array is Array of 2 array.....
 /* 
        int[][] arr1 = { { 2, 4, 5, 3 },
                { 4, 3, 2, 5 } };
        int[][] arr2 = { { 2, 6, 13, 3 },
                { 3, 7, 1, 5 } };
        int[][] result = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };

        for (int i = 0; i < arr1.length; i++) { // repeat 2 times or repet number of rows...
            for (int j = 0; j < arr1[i].length; j++) { // number of colums...
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("The Final Matrix after Addtion -----> ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
*/
//------>5.Write a Java program to reverse an array.
 /* 
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int length = arr.length;
        int Mid = Math.floorDiv(length, 2); // ------> length/2  and result will be taken floor value if it float value

        System.out.println("Normal Array print::: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("");
        
        // Reverse the whole array   ------------>

        for (int i = 0; i < Mid; i++) {
            int swap = arr[i];
            arr[i] = arr[length - i -1];
            arr[length-i-1] = swap;
        }
        System.out.println("Arter reverse the Array::: -->");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Without Change the Orginal Arrray ------->
        System.out.println("Arter reverse the Array::: -->");
        for (int i = length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        */

//-------->6.Write a Java program to find the maximum element in an array.  
 /*
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        // for finding the max Element pick a min element and wich are greter than that will add there...
        int assum_MIN = Integer.MIN_VALUE;
        for (int i : arr) {
            if (assum_MIN<i) {
                assum_MIN = i;
            }
        }
        int max = assum_MIN;
        System.out.println("The MAX element in the Array is: " + max);
 */
//----------> 7.Write a Java program to find the maximum element in a Java array.
       /*
        int assum_MAX = Integer.MAX_VALUE;
        for (int i : arr) {
            if (assum_MAX> i) {
                assum_MAX = i;
            }
        }
        int min = assum_MAX;
        System.out.println(" the MIN Element in Array is: "+ min);
 */

//------------>8. Write a Java program to find whether an array is sorted or not.
          /*
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        boolean isSorted= true;
        // Cheke is it in increasing order or not
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {  // previous one is greater than the next one then its nit a sorted array...
                isSorted = false;
                break;
            }
        }          
        
        if (isSorted) {
            System.out.println("Yes! It is a sorted array ");
        } else {
            System.out.println("NO! It is not a sorted array ");
        }
*/
        input.close();
    }
}
