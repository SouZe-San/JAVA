public class Methodes {

    /*
     * In JAVA "Methods" are like 'function' in C
     * First have to declare its as Static because main is static.....generally we
     * declare this method as static object....
     * as like we declare this method will be use as Static obj
     * if we didn't declare then it will made copy for all type of obj...... FOR
     * FURTHER INFORMATION LOOK REFERENCE...
     * then comes its Return type --> 'void','int','static', 'string' etc.
     * 
     * then name.....{ }
     * 
     * 
     * Function written in Main Class above the Main Function
     */

    static void hello() {
        System.out.println("Helllo everyOne");
        System.out.print("today going to F***!&* @ B!$%....");
    }

    /**
     * @param n
     */
    static void wantTo(String n) {
        System.out.println("I Want to spoil my wifu " + n + " >_<");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        hello();
        String name = "Rocsaana";
        wantTo(name);
    }
}
