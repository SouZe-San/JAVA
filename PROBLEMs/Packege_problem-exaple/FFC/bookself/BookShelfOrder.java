package FFC.bookself;

public class BookShelfOrder {
    BookSelfDetails bookShelf = new BookSelfDetails();

    public void orderChoice() {

        int materialChoice;
        int colorChoice;

        System.out.println(" ------ This Portal for bookShelf Buyers ----------");
        System.out.println("For Buying bookShelf .. Pls Follow the some process");
        // Ask For The Height for bookShelf
        bookShelf.setHeight();

        // Ask For The Weight for the BookShelf
        bookShelf.setWidth();

        // Ask For the type of bookShelf
        materialChoice = bookShelf.setMaterial();

        // Ask for the color of the bookShelf
        switch (materialChoice) {
            case 1:
                colorChoice = bookShelf.setWoodenShelfColor();
                break;
            case 2:
                colorChoice = bookShelf.setSteelShelfColor();
                ;
                break;
            default:
                colorChoice = 0;
                System.out.println("Color selected by default");
                break;
        }

        // Ask for Specific Info That given by buyers ---
        bookShelf.setSpecificDetails();
        // Ask for quantity for purchase
        bookShelf.setQuantity();
        // Set the Price According the Order!!
        bookShelf.setPrice(materialChoice, colorChoice);

    }

    public void getDetailsOfOrder() {
        System.out.println(
                "\nWe have Collect the Details That you Given For Order \n Please Ensure that All Info is correct\n");
        String oderDetails = " The Height : " + bookShelf.height +
                "\n The Width : " + bookShelf.width +
                "\n Material : " + bookShelf.material +
                "\n Color : " + bookShelf.shelfColor +
                "\n Quantity : " + bookShelf.quantity +
                "\n Specific Details : " + bookShelf.details + "\n The Price :" + bookShelf.price;

        System.out.println(oderDetails);
    }

    public int getPrice() {
        return bookShelf.price;
    }
}
