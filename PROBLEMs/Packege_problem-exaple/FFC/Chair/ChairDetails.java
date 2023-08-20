package FFC.Chair;

import FFC.commonFurniture.Furniture;
import java.util.HashMap;
import java.util.Scanner;

public class ChairDetails extends Furniture {
    public int price = 0;
    public String chairColor;
    public String type;
    Scanner sc = new Scanner(System.in);

    // ^ Method For Color Option for Gaming Chair::
    public void setGameChairColor() {
        HashMap<Integer, String> colorSet = new HashMap<Integer, String>();
        colorSet.put(1, "Crimson red");
        colorSet.put(2, "Drunk Gray");
        colorSet.put(3, "Ocean Blue");
        colorSet.put(4, "Ass Gray");
        colorSet.put(5, "Woden Brown");
        colorSet.put(6, "Milky White");

        System.out.println("\nThis are Color that are present ::");
        for (Integer key : colorSet.keySet()) {
            System.out.println("Option " + key + ": " + colorSet.get(key));
        }

        System.out.print("What will be Your choice :");
        try {

            this.chairColor = colorSet.get(sc.nextInt());
        } catch (Exception e) {
            System.out.println("You should Type correct input");
        }
    }

    // ^ Method For Color Option for Office Chair::
    public void setOfficeChairColor() {
        HashMap<Integer, String> colorSet = new HashMap<Integer, String>();
        colorSet.put(1, "Depp Sea Blue");
        colorSet.put(2, "Night Black");
        colorSet.put(3, "Dark Brown");

        System.out.println("\nThis are Color that are present ::");
        for (Integer key : colorSet.keySet()) {
            System.out.println("Option " + key + ": " + colorSet.get(key));
        }

        System.out.print("What will be Your choice :");
        try {

            this.chairColor = colorSet.get(sc.nextInt());
        } catch (Exception e) {
            System.out.println("You should Type correct input");
        }
    }

    // ^ Method For Color Option for Office Chair::
    public void setNormalChairColor() {
        HashMap<Integer, String> colorSet = new HashMap<Integer, String>();
        colorSet.put(1, "Red");
        colorSet.put(2, "Gray");
        colorSet.put(3, "Chocolate");

        System.out.println("\nThis are Color that are present ::");
        for (Integer key : colorSet.keySet()) {
            System.out.println("Option " + key + ": " + colorSet.get(key));
        }

        System.out.print("What will be Your choice :");
        try {

            this.chairColor = colorSet.get(sc.nextInt());
        } catch (Exception e) {
            System.out.println("You should Type correct input");
        }
    }

    // ^ Type OF Chair :;

    public int setType() {
        HashMap<Integer, String> typeSet = new HashMap<Integer, String>();
        typeSet.put(1, "Normal");
        typeSet.put(2, "Office");
        typeSet.put(3, "Gaming");

        System.out.println("\nWhich type of chair you want ::");
        for (Integer key : typeSet.keySet()) {
            System.out.println("Option " + key + ": " + typeSet.get(key));
        }

        System.out.print("What will be Your choice :");
        int key = sc.nextInt();
        this.chairColor = typeSet.get(key);
        return key; // This return For Understand which type of chair buyer have choose
        // Because have to give color option corresponding that
    }

    public void setPrice(int choice) {
        if (choice == 1) {
            this.price = 200 * quantity;
        } else if (choice == 2) {
            this.price = 500 * quantity;
        } else {
            this.price = 1500 * quantity;
        }
    }

}
