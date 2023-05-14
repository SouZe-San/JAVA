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
    // IF we privet the variables then we can't acess or set input from
    // anywhare...but can set the variable by methose crete in class
    private String name;
    private int id;

    // If we privet the variables then we have to store value by manually means have
    // to do it from first by constactor ...
    // -----> this act like if we dont set anything It ewill act like defulat;;;;
    employee() {
        System.out.println("this is from Constractor made by defult without any  parameter...");
        id = 0;
        name = "Your-Name";
    }

    // --------------> This Constractor OVErload ... here we passes Agruments as we
    // want to set ..... Acesss can be Public or defult
    public employee(String n, int a) {
        System.out.println("this is from Constractor made with some  parameter...");
        name = n;
        id = a;
    }

    /**
     * @return String
     */
    // ---------------> Othrerwise can set by metodes
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

        // This here name and id set by Constractor and works like defulat
        employee noNaeme = new employee();
        noNaeme.details();
        // Here Passses Name and id to Constrator for set name and id
        employee souze = new employee("soumyajit", 8);
        souze.details();
        Employee1 biswa = new Employee1("biswajit", 5000);
        // Usein Methodes to set the value;;
        biswa.setId(4);
        System.out.println("the id is :" + biswa.getId());
    }

}
