
import java.util.Scanner;

/*
* Receive a string as input count the Vowel in Number , and count it;s times
 */
class vowelCheck {
    String vowel[] = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };
    int count = 0;

    // FInd how many vowel characters present in the string --------> In future ,
    // Use lowercase For Modify this code
    void check(String line) {
        for (String letter : vowel) {
            if (line.contains(letter)) {
                this.count++;
            }
        }
        System.out.println("The Count of Vowel: " + count);
    }

}

class CheckTypeOfVowel extends vowelCheck {
    // Check which Vowel are available
    void countVowel(String line) {
        for (String letter : vowel) {
            if (line.contains(letter)) {
                System.out.println(letter + " : -> present ");
            }
        }
    }
}

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vowelCheck vowelCheck = new vowelCheck();
        System.out.println("Enter a Line : ");
        vowelCheck.check(sc.nextLine());
        sc.close();
    }
}
