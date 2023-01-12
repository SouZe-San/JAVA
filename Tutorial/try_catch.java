import java.util.Scanner;


public class try_catch {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);

        // ------------- This shown Multiple Exception Predict and take step for it -----------
        System.out.println("Enter the array index");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind]/number);
        }
        catch (ArithmeticException e){
            // if u want to divided by 0 then it will throw th error with ArithmeticException
            System.out.println("ArithmeticException occurred!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            // In case of Index if want to access or given an index which not in array like array is for 3 block and uu want t access index no. 5 then it will throw ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);
        }
        catch (Exception e){
            // In case of Other exception Which cant predict those will handel by this ..............
            System.out.println("Some other exception occurred!");
            System.out.println(e);
        }
 
        // ------------------- Nested Try Catch Block ------------- It will Continuous Ask for input until correct Input...
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the value of index");
             int index = sc.nextInt();
            try {
               
                System.out.println("Welcome to video no 82");
                try {
                    System.out.println(marks[index]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");

        sc.close();
    }
}