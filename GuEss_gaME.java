
import java.util.Random;
import java.util.Scanner;

/**
 * Game
 */
class Game {
    int theNumber;
    public int numberOfAttempt = 0, guessNumber;
 Scanner sc = new Scanner(System.in);
    Game() {
        System.out.println("The Random Number generated");
        Random randNum = new Random();
        this.theNumber = randNum.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Enter your Guessing Number: ");
        this.guessNumber = sc.nextInt();
    }

    
    /** 
     * @return int
     */
    public int getNumberOfAttempt() {
        return numberOfAttempt;
    }
    
    /** 
     * @param numberOfAttempt
     */
    public void setNumberOfAttempt(int numberOfAttempt) {
        this.numberOfAttempt = numberOfAttempt;
    }

    
    /** 
     * @return boolean
     */
    public boolean isCorrectNumber() {
        numberOfAttempt++;
        if (theNumber == guessNumber) {
            System.out.println("Great! Correct guess");
            System.out.format("It was %d and You achieve the success in %d Attempts", theNumber, numberOfAttempt);
            return true;

        } 
        else if (theNumber < guessNumber) {
            System.out.println("too high , Try again With Low number");
        }
         else if (theNumber > guessNumber) {
            System.out.println("too low, Try again With High number");
        }
        return false;
    }
    
}

public class GuEss_gaME {

   static void gameStart() {
        boolean check = false;
        Game game = new Game();
        while (!check) {
            game.takeUserInput();
            check = game.isCorrectNumber();
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Guess Game,\n\t Let's see how many attempt u need for guess correct number");
        System.out.println(">>>> Follow the instruction <<<<");
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Press 1: Start the Game..\n Press 2: exit the game \n \n what will be your choice: 1 or 2");
            System.out.print("Enter-> ");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    gameStart();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Choose correct OPtion");
            }
             
        }

    }
}
