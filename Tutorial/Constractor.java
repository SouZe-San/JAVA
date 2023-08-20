// / Constractor ----------> : <-------------> 
// constractore are create AS same name as class and those are some kind of methods which are autometicaly inbook as\
/**
 * @author: SOumyajit
 * @since 2022
 *        --> Constructors are similar to methods,, but they are used to
 *        initialize an object.
 *        --> Constructors do not have any return type(not even void).
 *        --> Every time we create an object by using the new() keyword, a
 *        constructor is called.
 *        --> If we do not create a constructor by ourself, then the default
 *        constructor(created by Java compiler) is called.
 *        --> COnstructor Create by JVM it Helps to initiate the object
 */

class employee {
    // IF we privet the variables then we can't access or set input from
    // any whare...but can set the variable by methods crete in class
    private String name;
    private int id;

    // If we privet the variables then we have to store value by manually means have
    // to do it from first by constructor ...
    // -----> this act like if we don't set anything It weill act like default;;;;
    employee() {
        System.out.println("this is from Constructor made by default without any  parameter...");
        id = 0;
        name = "Your-Name";
    }

    // --------------> This Constructor OVErload ... here we passes Arguments as we
    // want to set ..... Accesss can be Public or default
    public employee(String n, int a) {
        System.out.println("this is from Constructor made with some  parameter...");
        name = n;
        id = a;
    }

    /**
     * @return String
     */
    // ---------------> Otherwise can set by methods
    public String getName() {
        return name;
    }

    /**
     * @return int
     */
    public int getId() {
        return id;
    }

    public void details() {
        System.out.println("the name is: " + name + "<-------> and id is: " + id);
        System.out.println("");
    }
}

class Employee1 {
    // First constructor
    int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    Employee1(String s, int i) {
        System.out.println("The name of the first employee is : " + s);
        System.out.println("The id of the first employee is : " + i);
    }

    // Constructor overloaded
    Employee1(String s, int i, int salary) {
        System.out.println("The name of the second employee is : " + s);
        System.out.println("The id of the second employee is : " + i);
        System.out.println("The salary of second employee is : " + salary);
    }

}

public class Constractor {
    public static void main(String[] args) {
        System.out.println("hello fuckers");

        // This here name and id set by Constructor and works like default
        employee noNaeme = new employee();
        noNaeme.details();
        // Here Passes Name and id to Constructor for set name and id
        employee souze = new employee("soumyajit", 8);
        souze.details();
        Employee1 biswa = new Employee1("biswajit", 5000);
        // Use in Methods to set the value;;
        biswa.setId(4);
        System.out.println("the id is :" + biswa.getId());
    }

}
