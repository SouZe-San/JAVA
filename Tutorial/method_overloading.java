
/*
@ Method Overloading -->> Same method name but different parameters
        In Java, Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.

Condition for Method Overloading:
1. Number of parameters
2. Data type of parameters
3. Sequence of parameters
 */

class MethodCollection {
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    int sum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    String sum(String a, String b) {
        System.out.println("Two string Connect: " + a + b);
        return a + b;
    }
}

public class method_overloading {
    public static void main(String[] args) {

        MethodCollection obj = new MethodCollection();
        obj.sum(10, 20);
        obj.sum(10, 20, 30);
        obj.sum(10, 20, 30, 40);
    }
}
