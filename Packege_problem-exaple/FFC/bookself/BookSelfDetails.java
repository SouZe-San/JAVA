package FFC.bookself;

import java.util.HashMap;
import java.util.Scanner;

import FFC.commonFurniture.Furniture;

public class BookSelfDetails extends Furniture {
    public int price = 0;
    public String shelfColor = "No color";
    public String material;
    Scanner scanner = new Scanner(System.in);

    // Method for identify the material that used for shelf
    public int setMaterial() {

        HashMap<Integer, String> materialSet = new HashMap<Integer, String>();
        materialSet.put(1, "Wood");
        materialSet.put(2, "Steel");

        System.out.println("\nwhat will be Your Shelf made of");
        for (Integer keyInteger : materialSet.keySet()) {
            System.out.print("Option " + keyInteger + ": " + materialSet.get(keyInteger));

            System.out.print(" || ");
        }

        System.out.print("\nType Option (In Number) : ");
        int choice = scanner.nextInt();
        this.material = materialSet.get(choice);

        return choice; // this a hints that allow to know to user's choice
    }

    // COLOR CHOICE FOR WOODEN BOOK SHELF
    public int setWoodenShelfColor() {
        HashMap<Integer, String> woodenColorSet = new HashMap<Integer, String>();
        int colorChoice;

        woodenColorSet.put(1, "Brown");
        woodenColorSet.put(2, "White");
        woodenColorSet.put(3, "blue");
        woodenColorSet.put(4, "No Color");

        System.out.println("\n(for Wooden Shelf colored price add additional 300 rupees)\n Which Color You Prefer ");

        for (Integer keyInteger : woodenColorSet.keySet()) {
            System.out.println("Option " + keyInteger + ": " + woodenColorSet.get(keyInteger));
        }
        System.out.print("Type Option (In Number) : ");
        try {
            colorChoice = scanner.nextInt();
            this.shelfColor = woodenColorSet.get(colorChoice);
            return colorChoice;
        } catch (Exception e) {
            System.out.println("Sorry ! this type of option not present");
        }
        return 4; // if have Some Error by default set no color
    }

    // COLOR CHOICE FOR STEEL BOOK SHELF
    public int setSteelShelfColor() {
        HashMap<Integer, String> steelColorSet = new HashMap<Integer, String>();

        steelColorSet.put(1, "Blue");
        steelColorSet.put(2, "Hot Pink");
        steelColorSet.put(3, "Shinny Silver");
        steelColorSet.put(4, "Choco Brown");

        System.out.println("\nWhich Color You Prefer ");

        for (Integer keyInteger : steelColorSet.keySet()) {
            System.out.println("Option " + keyInteger + ": " + steelColorSet.get(keyInteger));
        }
        System.out.print("Type Option (In Number) : ");
        try {
            this.shelfColor = steelColorSet.get(scanner.nextInt());
        } catch (Exception e) {
            System.out.println("Sorry ! this type of option not present");
        }
        return 0;
    }

    public void setPrice(int mChoice, int cChoice) {

        if (mChoice == 1) {
            if (cChoice == 4) {
                this.price = ((height * width) * 120) * quantity;
            } else {
                this.price = (((height * width) * 120) + 300) * quantity;
            }

        } else {
            this.price = ((height * width) * 100) * quantity;
        }

    }

}
