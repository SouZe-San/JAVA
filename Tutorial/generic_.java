import java.util.ArrayList;

class MyGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2= t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
/**
 * here don't have to specify what type will be the generic of the class We Just Tell that this class can Have how many Generic 
 * like Upper One have 2 generic and Under One have 1 generic....
 * and their type will be define At the Constructing time..
 * 
 * In this way we  can ignore the run time error
 */

class result<n>{
    private n number;
    String name;
    result(String name, n number){
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public n getNumber() {
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(n number) {
        this.number = number;
    }
}

/**
 * generic_
 */
public class generic_ {
   
    public static void main(String[] args) {

        /* 
        ArrayList arr = new ArrayList<>();  // -----> If we declare A this like that then it can store any type like int string char...
        arr.add(45);
        arr.add("hello");
        arr.add(true);
        int x = (int) arr.get(0);
        ========= All of the element are store as Object type--- 
                    we can't store them any variable with out TypeCast.... that's why we need to specify It type or said Generic <> ...
*/
        ArrayList<Integer> arrayList = new ArrayList<>();
        //ArrayList<int> arrayList = new ArrayList(); -- this will produce an error
                arrayList.add(54);
                arrayList.add(643);
                int a = (int) arrayList.get(0);
                System.out.println(a);
        // Here only can add Integer type element
        //System.out.println(a);

        // ================= In that way we can Made custom generic in Our Custom Class ---------------------
        
                MyGeneric<String, Integer> g1 = new MyGeneric<>(23, "MyString is my string ", 45);
                g1.setVal(34);
                String str = g1.getT1();
                Integer int1 = g1.getT2();
                System.out.println(str + int1);

                result<Integer> n1 = new result<>("soumyajit", 67);
                System.out.println(n1.getName());
                
                
    }
}