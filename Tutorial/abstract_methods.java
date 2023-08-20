/*
 * 
 * Those methods which are declared but not defined are called abstract methods.
 */

abstract class Parent {
    abstract public void greet(); // -->> abstract method

    abstract public void greet2();
}

// For Use those methods we have to extends the class and define the methods
class child extends Parent {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

public class abstract_methods {
    public static void main(String[] args) {
        child c1 = new child();
        c1.greet();
        c1.greet2();
    }
}
