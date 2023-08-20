/**
 * @ Abstract_CLass
 * 
 * >>This is a class Which Contain Methods which Work Haven't define.... There
 * Work Function define in there inheritance Class if we need that methods...
 * Basically we Override that method.
 * 
 * >> If a class includes abstract methods, then the class itself must be
 * declared abstract, as in: 
 * >> Abstract class are used when we want to achieve security &
 * abstraction(hide certain details & show only necessary details to the user)
 * 
 * >> A method that is declared without implementation is known as the abstract
 * method.
 * when use the abstract method, in time of Override That Must be " Public "
 * 
 * >> WE CAN'T CRATE THE OBJECT OF AN ABSTRACT CLASS! BUT CAN CREATE A NEW
 * OBJECT OF A CLASS WHICH INHERIT THE ABSTRACT CLASS.
 * 
 */

abstract class Parent2 {
    public Parent2() {
        System.out.println("Mai base2 ka constructor hoo");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();

    abstract public void greet2();
}

class Child2 extends Parent2 {
    @Override
    public void greet() {
        System.out.println("Good morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2 {
    public void th() {
        System.out.println("I am good");
    }
}

public class Abstract_CLass {
    public static void main(String[] args) {
        // Parent2 p = new Parent2(); -{error} can't create object/instantiate of
        // abstract class
        Child2 child = new Child2(); // -- Correct
        child.greet();
        child.sayHello();
        // Child3 c3 = new Child3(); -- error

    }
}
