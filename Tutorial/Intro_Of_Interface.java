/*
 * Interface is Collection of Abstract methods. we can declare any variable in this interface. but those value cant change by any means..
 * An interface may also contain constants, default methods, and static methods.
 * Interface methods are public by default
 * Generally One class cannot Inherit More than one class.... But Can Inherit More than one Interface
 * >>by interface we can use polymorphism
 */

interface Bicycle {
    int a = 45;

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface HornBicycle {
    int x = 45;

    void blowHornK3g();

    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle {
    // public int x = 5; --> Only Can Change Here As We need Otherwise it will stay
    // as it was
    void blowHorn() {
        System.out.println("Pee Pee Poo Poo");
    }

    /**
     * @param decrement
     */
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    /**
     * @param increment
     */
    public void speedUp(int increment) {
        System.out.println("Applying SpeedUP");
    }

    public void blowHornK3g() {
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }

    public void blowHornmhn() {
        System.out.println("Main hoon naa po po po po");
    }
}

// DEFAULT METHODS

interface MyCamera {
    // Abstract method
    void takeSnap();

    void recordVideo();

    // PRIVATE METHOD >>> Can't Access By Normal Approach
    private void greet() {
        System.out.println("Good Morning");
    }

    // Default method ->>> this Are methods are are implementing In Interface..
    default void record4KVideo() {
        greet(); // ---> By this way can Access
        System.out.println("Recording in 4k...");
    }
}

class smartPhone implements MyCamera {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Taking snap");
    }
    // public void record4KVideo() {
    // System.out.println("Taking snap and recoding in 4k");
    // }

    public void name() {
        System.out.println("hello Iam Soumyajit");
    }
}

// INHERITANCE IN INTERFACE

interface sampleInterface {
    void meth1();

    void meth2();
}

interface childSampleInterface extends sampleInterface {
    void meth3();

    void meth4();
}

class MySampleClass implements childSampleInterface {
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }

    public void meth4() {
        System.out.println("meth4");
    }
}

public class Intro_Of_Interface {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // * */ You can create properties in Interfaces
        // System.out.println(cycleHarry.a);
        // System.out.println(cycleHarry.x);

        // * You cannot modify the properties in Interfaces as they are final */
        // * cycleHarry.a = 454; */
        /*
         * / System.out.println(cycleHarry.a);
         * 
         * cycleHarry.blowHornK3g();
         * cycleHarry.blowHornmhn();
         * 
         * //* default methods
         */
        smartPhone sm = new smartPhone();
        sm.record4KVideo();
        // * */ * sm.greet(); --> Throws an error!

        // * Inheritance in Interface */
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();

        // *Polymorphism Or Dynamic Dispatch
        MyCamera cam1 = new smartPhone(); // This is a smartphone but, use it as a camera || only can Use Methods of
                                          // Camera as Its Reference is camera
        // cam1.name(); --> Not allowed ||| as this method is Belong to smartphone class
        // not in camera..
        cam1.record4KVideo();
    }
}
