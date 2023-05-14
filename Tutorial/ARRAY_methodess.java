import java.util.ArrayList;
import java.util.Arrays;

public class ARRAY_methodess {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // int arr1[] = {2,3,4,45,43}; // -------> one way declaring variable
        String arr1[] = { "lyrics", "song", "music", "box" };
        // int[] arr2; // ------> Another way declaring variable
        // arr2 = new int[10]; // ------> way declaring memory to variable
        // arr1 = new int[20]; // After declaring the variable then allocate the memory
        // for this variable

        // int arr3 [] = new int[5]; //----> combine way to declaring and allocate the
        // memory for a variable >>type var-name = new type[size]<<
        ArrayList<Integer> arr4 = new ArrayList<Integer>(10);
        // ArrayList<String> arr4 = new ArrayList<String>();
        arr4.add(2);
        // arr4.add(1);
        // arr4.add(3);

        // for (String i : arr1) {
        // System.out.println(i.equals("song"));
        // }
        System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.binarySearch(arr1,4)); // return the index of the
        // element
        System.out.println(Arrays.asList(arr1).contains("music"));

        // ************************** For finding MAX Element in array
        // **********************
        /*
         * 
         * >>>>>METHOD 1:
         * int arr[] = {10, 324, 45, 90, 9808};
         *         int max = Arrays.stream(arr).max().getAsInt();
         *         System.out.println("Largest in given array is " +max);
         * 
         * >>>>>METHOD 2:
         * Arrays.sort(arr);
         *         return arr[n - 1];
         * 
         * >>>>>METHOD 3:
         * int arr[] = {10, 324, 45, 90, 9808};
         *         List<Integer> list=new ArrayList<>();
         *         for(int i=0;i<arr.length;i++)
         *         {
         *             list.add(arr[i]);
         *         }
         *         System.out.println("Largest in given array is "
         * +Collections.max(list));
         *     }
         */

    }
}
