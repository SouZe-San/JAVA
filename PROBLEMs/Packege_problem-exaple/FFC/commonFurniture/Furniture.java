package FFC.commonFurniture;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Furniture {
    // Variables --
    public int height;
    public int width;
    public int quantity;
    public String details;

    Scanner sc = new Scanner(System.in);

    // ^ Methods for get height --
    public void setHeight() {
        System.out.println("\nHow much height(ft) will be of your product and Give the input in number :");
        boolean flag = true;
        while (flag) {
            System.out.print(":--> ");
            try {
                this.height = sc.nextInt();
            } catch (InputMismatchException e) {
                flag = false;
                System.out.println("Please give an proper input !Have a Nice DAY");
            }

            // Check The height is Justify or not
            if (height <= 0) {
                System.out.println("Sorry! you have to give an proper instruction");
            } else if (height > 8) {
                System.out.println("We Don't Produce that long Items");
            } else {
                flag = false;
            }
        }
    }

    // ^Method for get Width --
    public void setWidth() {
        System.out.println("\nHow much Width(ft) will be of your product and Give the input in number :");
        boolean flag = true;
        while (flag) {
            System.out.print(":--> ");
            try {
                this.width = sc.nextInt();
            } catch (InputMismatchException e) {
                flag = false;
                System.out.println("Please give an proper input !Have a Nice DAY");
            }

            // Check The width is Justify or not
            if (this.width <= 0) {
                System.out.println("Sorry! you have to give an proper instruction");
            } else if (this.width > 5) {
                System.out.println("We Don't Produce that long Items");
            } else {
                flag = false;
            }
        }
        // return this.height;
    }

    // Method for get specific Details on The Product From Buyers :::
    public void setSpecificDetails() {
        System.out.println("\nDo You want to Add Any Specific Request that We Should Consider About your Product");
        System.out.println("If have pls Write Down ,(Not then Leave it)");
        this.details = sc.nextLine();
        if (details == " " || details == "") {
            this.details = "Nah";
        }
    }

    // Methods For Select the Quantity
    public void setQuantity() {
        System.out.println("\nHow much you want This product and Give the input in number :");
        System.out.print("--> ");
        this.quantity = sc.nextInt();
    }

}
