
/*
 * WHAT IS INHERITANCE ? -> As word meaning....
 * father called sub class and child called super class 
 *  By this we can copy or use the parent class's method or constructor..
 */

/*
 * Parent
 */
class Parent {
    public int x;

    Parent() {
        System.out.println("I am A basic Constructor who run for both Parent and child class when Both only intitling");
    }

    /**
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    public void getNumber() {
        System.out.format("the number of Parent class is %d\n", x);
    }

    Parent(int a) {

        System.out.println("This is Post from Parent constructor And number is " + a);
    }
}

class child extends Parent {
    public int y;

    public void setY(int y) {
        this.y = y;
    }

    @Override // -----> This called methods Override .. by this we use methods of parent class
              // with some changes... the changes shown when method are use by child class
    public void getNumber() {
        System.out.format("this is an Overriding method \n\tthe number of Child class is %d\n", y);
    }

    child(int b) {

        // Super keyword -->
        // A reference variable used to refer immediate parent class object.
        // It can be used to refer immediate parent class instance variable.
        // It can be used to invoke the parent class method.
        // __> the value only use in contractor and also use in constructor......

        super(b); // ------> Use for send any data too parent class which use in constructor
        System.out.println(
                "If Number was given by child constructor then upper print called by Child class and  number print given by child");
    }

}

class animal12 {
    animal12() {
        System.out.println("1. Have 4 legs,2 eyes ,One noes ,2 ears");
    }
}

class dog extends animal12 {
    void sound() {
        System.out.println("Bark! Wow WOw !!");
    }
}

public class inheritance {
    public static void main(String[] args) {
        System.out.println("of");
        Parent p = new Parent();
        p.setX(4);
        p.getNumber();
        child C = new child(6);
        C.setX(8); // -------> this method run As Child class's Method which set Parents class
                   // variable
        C.getNumber();
    }
}