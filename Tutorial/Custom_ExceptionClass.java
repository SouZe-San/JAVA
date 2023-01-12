/*
 * Custom_ExceptionClass

    We can Create Our own Exception CLass which can Throw as we want We can Modify it like Which Massage will Print if exception Occur.
    We can write our custom Exceptions using /extends the Exception class in java.

    The Exception class has the following important methods:

    1) Strings toString() executed when Print ->(e){System.Out.Print(e)} is ran
    2) Void printStackTrace() - prints Stack trace {Print The Problem Statement With Its Source}
    3) String getMessage() - prints the exception message 
 */
import java.util.Scanner;

 class OwnException extends Exception{
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        // return super.toString();  ----> It Use super for connect or get respond from constructor Of Extends Class.......... Where this Method predefine We OVERRIDE this method
        return "You Fucking Bastards You cant Put Correct Input ";
    }
    
    /** 
     * @return String
     */
    @Override
    public String getMessage() {
        // return super.getMessage(); --> Same as Upper case
        return "I am from getMessage() to Purify You Nutless Person";
    }
 }

 class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}
public class Custom_ExceptionClass {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
         sc.close();
        if (a<9){
            try{
                throw new OwnException();
                // throw new ArithmeticException("Cant even Put correct Input what can u even do");  // send Custom Massage In predefine Class
            }
            catch (Exception e){
                System.out.println(e.getMessage());  // It will Shown My Custom Massage ..If throw OwnException Class If Not then It Will Shown by Default
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }

       
    }
}