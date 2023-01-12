/**
 * <i>This is a simple documentation to show that HTML elements can be included
 * in JavaDoc.</i>
 * 
 * @see <a href=
 *      "https://www.codewithharry.com/videos/java-tutorials-for-beginners-1">Best
 *      Java Course Available For <b>Free</b></a>
 */

public class javaDocs {
    /**
     * This method is used to return the division of two numbers
     * 
     * This class is to demonstrate what javadoc is and how it is used in the java
     * industry
     * This is <i>italic</i> word
     * <p>this is a new paragraph</p>
     * @author Harry (CodeWithHarry)
     * @version 0.1
     * @since 2002
     * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html"
     *      target="_blank">Java Docs</a>
     * @throws ArithmeticException if divided by 0
     * @return Integer
     * @param a First parameter - Integer
     * @param b Second parameter - Integer
    *  @deprecated This method is deprecated please use + Operator
     */
    @Deprecated
     public static int sum(int a, int b) throws ArithmeticException {
        
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println(e);
        }
        return b;
     }
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
