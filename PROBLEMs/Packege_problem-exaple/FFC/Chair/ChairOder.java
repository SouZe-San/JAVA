package FFC.Chair;

public class ChairOder {
    ChairDetails chair = new ChairDetails();

    public void orderChoice() {
        System.out.println(" ------ This Portal for Chair Buyers ----------");
        System.out.println("For Buying Chair .. Pls Follow the some process");
        // Ask For The Height for chair
        chair.setHeight();
        // Ask For the type of chair
        int choice = chair.setType();
        // Ask for the color of the chair
        switch (choice) {
            case 1:
                chair.setNormalChairColor();
                break;
            case 2:
                chair.setOfficeChairColor();
                break;
            case 3:
                chair.setGameChairColor();
                break;
            default:
                break;
        }

        // Ask for Specific Info That given by buyers ---
        chair.setSpecificDetails();
        // Ask for quantity for purchase
        chair.setQuantity();
        // Set the Price According the Order!!
        chair.setPrice(choice);
    }

    public void getDetailsOfOrder() {
        System.out.println(
                "We have Collect the Details That you Given For Order \n Please Ensure that All Info is correct");
        String oderDetails = " The Height : " + chair.height +
                "\n Type : " + chair.type +
                "\n Color : " + chair.chairColor +
                "\n Quantity : " + chair.quantity +
                "\n Specific Details : " + chair.details + "\n The Price :" + chair.price;

        System.out.println(oderDetails);
    }

    public int getPrice() {
        return chair.price;
    }

}
