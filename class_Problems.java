import java.util.Scanner;

// here at first have to declear its "ACCESS MODIFIERS" like 'Public', 'Privet', 'Protected' ----> As In One programme theri can be only one PUBLIC that will be main class...
// Class Are like Structure of Language C they Combine many type of data type and methodes

class Employee12 {
    int id;
    String name;
    int salary;

    /**
     * @return int
     */
    public int printSalary() {
        return salary;
    }

    /**
     * @param nam
     */
    public void setName(String nam) {
        name = nam;
    }

    /**
     * @return String
     */
    public String getName() {
        return name;
    }

    public void details() {
        System.out.println("Name of the Employee is : " + name);
        System.out.println("Id is: " + id);
        System.out.println("Salary is : " + salary);
    }
}

class mobilePhone {
    public void calling() {
        System.out.println("Motherf@^%& Why calling me now");
    }

    public void vibreat() {
        System.out.println("Your mobilePhone is now in silent now");
    }
}

class square {
    int side;

    public int area() {
        return side * side;
    }

    public int permeter() {
        return 4 * side;
    }
}

public class class_Problems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. EMPLOYEE-CLASS 'S SOME WORJK FUNCTION
        Employee12 Souze = new Employee12(); // ------------> Define the class obj
        // Souze.salary = 30000; // ------> set object's data value
        System.out.println("Pls enter your Employee name: ->");
        String Name = input.nextLine();
        System.out.println("What is the Amout Of Salary Of this employee: ->");
        Souze.salary = input.nextInt();
        System.out.println("What is the Amout Of Salary Of this employee: ->");
        Souze.id = input.nextInt();
        Souze.setName(Name);
        System.out.println(Souze.getName());
        System.out.println(Souze.printSalary());
        System.out.println(" --------- next is fulll details print by one methode--------------");
        Souze.details();

        System.out.println(); // FOR FREE BLACK LINE
        // 2. mobilePhone - CALLING AND VIBRATING BY A CLASS'S METHODE
        mobilePhone Redmi = new mobilePhone();
        Redmi.calling();
        Redmi.vibreat();

        // 3. CLACULATING AREA OF AN SQUARE............
        square SQUARE = new square();
        System.out.print("Pls Enter the length of the side: ");
        int squareSide = input.nextInt(); // -------> an integer input wanted
        SQUARE.side = squareSide;
        System.out.println("What you want?");
        System.out.println("press the number which mthode you want to performe");
        System.out.println("1: Take Area of that square");
        System.out.println("2: Measure the premeter of that Square");
        int want = input.nextInt();
        System.out.println();
        switch (want) {
            case 1:
                System.out.println("the Area of the  Square is : " + SQUARE.area());
                break;

            case 2:
                System.out.println("the Premeter of the  Square is : " + SQUARE.permeter());
                break;
        }
        input.close();
    }
}
