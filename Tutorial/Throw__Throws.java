
class NegativeRadiusException extends Exception {
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    
    /** 
     * @return String
     */
    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

// If U want to  See Work of Throw The go To Custom_Exception Program To See

public class Throw__Throws {
    public static double area(int r) throws NegativeRadiusException {  // Throw ues For Declare That, by Using This Method may be occur this Exception
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        // Made By Harry
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {

        try {
            // int c = divide(6, 0);
            // System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
