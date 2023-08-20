import java.util.Scanner;

/* 
! 3. Assume that the first day of the year is "Sunday". 
@WAP to accept two inputs. The first input should be between 1 and 12. The second input should be between 1 and 31. Output should be the corresponding day of the week. Display invalid output if input <1 or >31.
*/
class CalenderDay {

    boolean isLeper(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    // print the Day in Month.....
    void day(int day) {
        String weak[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        if (1 <= day && day <= 31) {
            int index = (day - 1) % 7;
            System.out.println("The day on " + day + " is : " + weak[index]);
        } else {
            System.out.println("Invalid date");
        }
    }

    // Print the Day name in a year : as input take only the day and month
    void returnDay(int date, int month) {
        int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String weak[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        // Printing Algorithms
        if ((1 <= date && date <= 31) && (1 <= month && month <= 12)) {
            int totalDays = 0;
            for (int i = 1; i < month; i++) {
                totalDays += monthDays[i - 1];
            }
            totalDays += date;
            int index = (totalDays - 1) % 7;
            System.out.println("The day on " + date + " / " + month + " is: " + weak[index]);
        } else {
            System.out.println("Invalid date");
        }

    }

}
public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalenderDay cal = new CalenderDay();
        
        // Take Input Values :
        System.out.print("Enter the date : ");
        int dateInput = sc.nextInt();
        System.out.println("Enter the date : ");
        int monthInput = sc.nextInt();

        cal.returnDay(dateInput, monthInput);
        sc.close();
    }
}
