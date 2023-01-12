import java.util.Scanner;

public class problems {

    
    /** 
     * @param a
     * @return int
     */
    static int fibonachi(int a) {
        if (a <= 1) {
            return a;
        } else {
            return fibonachi(a - 2) + fibonachi(a - 1); // fibonachi series generaly create by sum of previous two value
        }

    }

    
    /** 
     * @param b
     */
    static void patt(int b) {
        if (b > 0) { // -----> this id the limit of repeating this methode itself
            patt(b - 1);
            for (int i = 0; i < b; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // SIMPLE PARTTEN PRINT -------
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // NTH TERMS FIBONACHHI SERIES -----------
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println(" the terms index start from 0 please remind this before input ur datas");
        System.out.println("Pls Enter which terms want form Fibonachhi series");
        int x = input.nextInt();
        System.out.println("the " + x + " th of terms from Fibonachhi Series is: " + fibonachi(x));

        // SAMPLE PARTTEN CREATE USING RECURTION......
        System.out.println();
        System.out.println("Printing Partten using recurtion.......");
        patt(10);
        input.close();
    }

}
