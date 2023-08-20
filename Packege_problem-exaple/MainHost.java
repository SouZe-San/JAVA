
import java.util.Scanner;

import FFC.Chair.ChairOder;
import FFC.bookself.BookShelfOrder;

public class MainHost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\t ********* THIS IS Furniture and Fittings Company *********");
        System.out.println("Option 1: Chair Sells Portal || \nOption 2: BookShelf Sells Portal ||");
        System.out.print("Enter Your Choice : ");
        try {
            int key = input.nextInt();
            switch (key) {
                case 1:
                    ChairOder chair = new ChairOder();
                    chair.orderChoice();
                    chair.getDetailsOfOrder();
                    if (chair.getPrice() <= 0) {
                        System.out.println("Due to Luck Of info And Your Miss info \n The ORDER IS CANCELED ");
                        System.exit(0);
                    }
                    System.out.println("If All Ok Then Type 'yes' \nIf cancel the Order the type 'no'");
                    switch (input.next()) {
                        case "yes":
                            System.out.println("\n\tORDER SUCCESSFULLY ^-^ ");
                            break;
                        case "no":
                            System.out.println("\n\tORDER CANCELED  >_< ");
                            break;

                        default:
                            System.out.println("Due to Luck Info Order cancel and have to pay $100");
                            System.exit(0);
                    }
                    break;
                case 2:
                    BookShelfOrder bookShelf = new BookShelfOrder();

                    bookShelf.orderChoice();
                    bookShelf.getDetailsOfOrder();
                    if (bookShelf.getPrice() <= 0) {
                        System.out.println("Due to Luck Of info And Your Miss info \n The ORDER IS CANCELED ");
                        System.exit(0);
                    }
                    System.out.println("If All Ok Then Type 'yes' \nIf cancel the Order the type 'no'");
                    switch (input.next()) {
                        case "yes":
                            System.out.println("\n\t-- ORDER SUCCESSFULLY ^-^ --\n");
                            break;
                        case "no":
                            System.out.println("\n\t-- ORDER CANCELED  >_< --\n");
                            break;
                        default:
                            System.out.println("Due to Luck Info Order cancel and have to pay $100");
                            System.exit(0);
                    }
                    break;
                default:
                    break;
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        input.close();

    }

}