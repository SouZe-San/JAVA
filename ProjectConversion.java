import java.util.InputMismatchException;
import java.util.Scanner;

// ! Class For Currency Conversion ***
class TempConversion {
    double cel; // --> variable for Celsius
    double far; // --> variable for Fahrenheit
    Scanner sc = new Scanner(System.in);

    // 1st method : celsius to Fahrenheit converter
    void celsiusToFahrenheit() {
        System.out.print("Enter Temperature in Celsius: ");
        try {
            cel = sc.nextDouble();
            far = (cel * 9 / 5) + 32;
            System.out.println("In Fahrenheit: " + far);
        } catch (Exception e) {
            System.out.println("Give Correct Temperature");
        }
    }

    // 2nd method : Fahrenheit to Celsius Convert
    void fahrenheitToCelsius() {
        System.out.print("Enter Temperature in fahrenheit: ");
        try {
            far = sc.nextDouble();
            cel = ((far - 32) * 5) / 9;
            System.out.println("In Celsius : " + cel);
        } catch (Exception e) {
            System.out.println("Give Correct Temperature");
            System.out.println(e);
        }
    }

}

// ! ** Class For Currency Conversion **
class CurrencyConversion {
    double dollar;
    double rupees;
    Scanner money_Input = new Scanner(System.in);

    double input() {
        System.out.print("Enter currency in Indian Rupee: ");
        try {
            rupees = money_Input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Pls, Enter in Numbers WithOut Use any symbol ");
        } catch (Exception e) {
            System.out.println("Pls, Enter Again Some things went Wrong");
        }
        return rupees;
    }

    // Method 1: Convert to dollars form rupees
    void convertToDollars() {
        System.out.print("Enter currency in Indian Rupee: ");
        try {
            rupees = money_Input.nextDouble();
            dollar = rupees * 0.012;
            System.out.println(rupees + " Indian Rupee equals : $" + dollar);
        } catch (InputMismatchException e) {
            System.out.println("Pls, Enter in Numbers WithOut Use any symbol ");
        } catch (Exception e) {
            System.out.println("Pls, Enter Again Some things went Wrong");
        }
    }

    // Method 2: Convert from dollars to rupee
    void convertToRupee() {
        System.out.print("Enter currency in US Dollar: $");
        try {
            dollar = money_Input.nextDouble();
            rupees = dollar * 81.68;
            System.out.format("$ %.2f US Dollar equals : $ %.3f Indian rupees", dollar, rupees);
        } catch (InputMismatchException e) {
            System.out.println("Pls, Enter in Numbers WithOut Use any symbol ");
        } catch (Exception e) {
            System.out.println("Pls, Enter Again Some things went Wrong");
        }
    }

    // method3 : Convert Rs to Pound
    void convertToPound() {
        double money = input();
        double pound = money * 0.00991;
        System.out.println(money + " Indian Rupee equals : " + pound + "GBP");
    }

    // method 4. Convert Rs to Euro
    void convertToEuro() {
        double money = input();
        double euro = money * 0.011;
        System.out.println(money + " Indian Rupee equals : " + euro + " EUR ");
    }

    // method 5. Convert Rs to Dirham
    void convertToDirham() {
        double money = input();
        double dirham = money * 0.045;
        System.out.println(money + " Indian Rupee equals : " + dirham + " AED ");
    }

    // method 6. Convert Rs to Mark
    void convertToMark() {
        double money = input();
        double mark = money * 0.02;
        System.out.println(money + " Indian Rupee equals : " + mark + " Mark ");
    }

    // method 7. Convert Rs to Yen
    void convertToYen() {
        double money = input();
        double yen = money * 1.59;
        System.out.println(money + " Indian Rupee equals : " + yen + " JPY ");
    }
}

// ! ** Class for Distance Conversion **
class DistanceConversion {
    Scanner distance_Input = new Scanner(System.in);
    double length;

    // method for Take user Input
    double lengthInput() {
        System.out.print("Enter The Distance: ");
        try {
            length = distance_Input.nextDouble();
        } catch (Exception e) {
            System.out.println("Enter Correct Input");
            System.out.println(e);
        }
        return length;
    }

    // Method 1. Convert Yards to Feet
    void yardToFeet() {
        double yard = lengthInput();
        double feet = yard * 3;
        System.out.println(yard + "yd = " + feet + "ft");
    }

    // Method 2. Convert Miles to Km
    void milesToKm() {
        double miles = lengthInput();
        double km = miles * 1.609;
        System.out.println(miles + "mi = " + km + "Km");
    }

    // Method 3. Convert Km to Meter
    void kmToMeter() {
        double km = lengthInput();
        double meter = km * 1000;
        System.out.println(km + "km = " + meter + "m");
    }

    // Method 4. Convert Meter to Centimeter
    void meterToCentimeter() {
        double meter = lengthInput();
        double centimeter = meter * 100;
        System.out.println(meter + "m = " + centimeter + "cm");
    }

}

// ! *** Menu : Continuously Shown Display of Portal ***
class Menu {

    // * SubChoice For Temperature Conversion ----------
    void tempChoice(int key) {
        TempConversion tempConvert = new TempConversion();
        switch (key) {
            case 1:
                tempConvert.celsiusToFahrenheit();
                break;
            case 2:
                tempConvert.fahrenheitToCelsius();
                break;
            case 3:
                displayMenu();
                break;

            default:
                System.out.println("Don't Put Wong Input , Pls try again.");
                break;
        }
        System.out.println("Thank You For Choosing Us");
    }

    // * SubChoice For Currency Conversion ----------
    void choiceForCurrency(int key) {
        CurrencyConversion currencyConvert = new CurrencyConversion();
        switch (key) {
            case 1:
                currencyConvert.convertToDollars();
                break;
            case 2:
                currencyConvert.convertToRupee();
                break;
            case 3:
                currencyConvert.convertToPound();
                break;
            case 4:
                currencyConvert.convertToEuro();
                break;
            case 5:
                currencyConvert.convertToDirham();
                break;
            case 6:
                currencyConvert.convertToMark();
                break;
            case 7:
                currencyConvert.convertToYen();
                break;
            case 8:
                displayMenu();
                break;

            default:
                System.out.println("Don't Put Wong Input , Pls try again.");
                break;
        }
        System.out.println("Thank You For Choosing Us");
    }

    // * SubChoice For Distance Conversion -------------
    void choiceForDistanceConvert(int key) {
        DistanceConversion disConvert = new DistanceConversion();
        switch (key) {
            case 1:
                disConvert.yardToFeet();
                break;
            case 2:
                disConvert.milesToKm();
                break;
            case 3:
                disConvert.kmToMeter();
                break;
            case 4:
                disConvert.meterToCentimeter();
                break;
            case 5:
                displayMenu();
                break;
            default:
                System.out.println("Sorry! Pls Try Again");
                break;
        }

    }

    // * Main Menu Of this Portal =======>
    void displayMenu() {
        try (Scanner choice_input = new Scanner(System.in)) {
            while (true) {
                // Printing Primary Choice -->
                System.out.println(
                        "\nTell as your Choice through the number \n\tpress 1: Temperature Conversion\n\tpress 2: Currency Conversion\n \tpress 3: Distance Conversion\n\tPress 4: for Quit/Exit this Portal");
                System.out.print("Enter Your Choice: ");
                int primaryChoice = choice_input.nextInt(); // Take the primary choice For Which Type Conversion

                // Printing Further Details -------->
                if (primaryChoice == 1) {
                    System.out.println("\nWhat Type of Conversion you want to perform");
                    System.out.println("Celsius to Fahrenheit :----->1");
                    System.out.println("Fahrenheit to Celsius :------2");
                    System.out.println("Back to Main Menu :----------3");
                    System.out.print("Which One You want ? >:");

                } else if (primaryChoice == 2) {
                    System.out.println("\nWhat Type of Conversion you want to perform");
                    System.out.println("Rupees to Dollars : ---------> 1");
                    System.out.println("Dollar to Rupees : ----------> 2");
                    System.out.println("Rupees to Pound : -----------> 3");
                    System.out.println("Rupees to Euro : ------------> 4");
                    System.out.println("Rupees to Dirham : ----------> 5");
                    System.out.println("Rupees to Mark : ------------> 6");
                    System.out.println("Rupees to Yen : -------------> 7");
                    System.out.println("Back to Main Menu : ---------> 8");
                    System.out.print("Which One You want ? >:");
                } else if (primaryChoice == 3) {
                    System.out.println("\nWhat Type of Conversion you want to perform");
                    System.out.println("Yard to Feet : ---------> 1");
                    System.out.println("Miles to Kilometer : ---> 2");
                    System.out.println("Kilometer to Meter : ---> 3");
                    System.out.println("Meter to Centimeter : --> 4");
                    System.out.println("Back to Main Menu: -----> 5");
                    System.out.print("Which One You want ? >:");
                }

                // As User Choose the Type,By instruction that operation will be performed --
                switch (primaryChoice) {
                    case 1:
                        System.out.println("");
                        tempChoice(choice_input.nextInt());
                        break;
                    case 2:
                        System.out.println("");
                        choiceForCurrency(choice_input.nextInt());
                        break;
                    case 3:
                        System.out.println("");
                        choiceForDistanceConvert(choice_input.nextInt());
                        break;
                    case 4:
                        System.out.println("Thank you For Choosing Us !");
                        System.exit(0);
                    default:
                        System.out.println("Don't Type Other than instruct ! ");
                }

            }
        }

    }

}

public class ProjectConversion {
    public static void main(String[] args) {
        System.out.println("\n\tHello my friend");
        System.out.println("<<==== Welcome to Our Conversion portal ====>>");
        Menu menu = new Menu();
        menu.displayMenu();
    }
}
