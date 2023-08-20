import java.util.Arrays;

// 5. WAP that accepts 10 characters into an array. Count the number of
// non-repeating characters in the array.
class NonRepeating {
    void nonRepeatingCount(Character arr[]) {
        int len = arr.length;
        Character[] repeatChar = new Character[len];
        int array_Index = 0;
        for (int i = 0; i < len; i++) {
            int count = 1;
            Character ch = Character.toLowerCase(arr[i]);
            if (Arrays.asList(repeatChar).contains(ch)) {
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                char nextChar = Character.toLowerCase(arr[j]);
                if (ch == nextChar) {
                    count++;
                }
            }
            if (count > 1) {
                repeatChar[array_Index] = ch;
                array_Index++;
            }
            if (count == 1) {
                System.out.println(arr[i] + " :-> is a Non repeating Character in Array");
            }
        }
    }
}

public class NonRepeatArray {
    public static void main(String[] args) {
        Character char_Array[] = { 'a', 'W', 'i', 'e', 'K', 'a', 'E', 'k', 'A', 'A'
        };
        NonRepeating charArray = new NonRepeating();
        charArray.nonRepeatingCount(char_Array);
    }
}
