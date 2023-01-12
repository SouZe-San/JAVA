public class Methodes {

    /*In JAVA "Methodes" are like 'funtion' in C
        First have to declear its as Static because main  is static.....generally we declare this method as static object....
        as like we declear this methode will be use as Static obj
        if we didn't declear then it will made copy for all type of obj...... FOR FUTHER INFORMATION LOOK REFERENCE... 
        then comes its Return type --> 'void','int','static', 'string' etc.

        then name.....{  }


        Function Eritten in Main Class above the Main Function
    */

    static void hello(){
        System.out.println("Helllo everyOne");
        System.out.print("today going to F***!&* @ B!$%....");
    }

    
    /** 
     * @param n
     */
    static void wantTo(String n){
        System.out.println("I Want to spoil my wifu "+ n + " >_<");
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
