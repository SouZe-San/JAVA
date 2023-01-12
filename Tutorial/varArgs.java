public class varArgs {

    
    /** 
     * @param arr
     * @return int
     */
    static int sum(int ...arr) { //------------> This a sum methode that generally like function in C...
            // int ...arr generaly represent like 'int [] arr' ----> this is array syntex...
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("happy life..... Regressior indtraction manuall");
        System.out.println("Sumation of sum numbers is : " + sum(1,3,4,20));
    }
}
