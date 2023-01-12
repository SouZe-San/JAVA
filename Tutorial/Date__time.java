import java.util.Date;

/*
 * Date_&_time  --- In previous versions of Java, java time package was used.

Date in java is stored in the form of a "" long number """. This long number holds the number of milliseconds passed since 1 jan 1970
Java assumes that 1900 is the start year which means it calculates years passed since 1900 whenever We ask it for years passed 
 */
public class Date__time extends Thread {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        // [[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[ This Methods Used In Previous time Now those aren't used That much ]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

        System.out.println(System.currentTimeMillis()); // Its print the time passed since 1 jan 1970
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365); // Its print the time passed since 1 jan 1970

        //--------- FOr any Further information go to oracle java doc14
        @SuppressWarnings({"deprecated"})
        Date date = new Date();
        System.out.println("Today is : " + date);
        System.out.println("The number of milliseconds passed since Jan 1, 1970 : " + date.getTime()); // Its print the time passed since 1 j

        //  -----------------------This method are deprecated use by Uncommented---------------------
        // System.out.println("The current date is : " + date.getDate()); // ----> date of Day
        // System.out.println("The current year is : " + date.getYear()); // here year count from 1900 to present
        // System.out.println(date.getHours()); // --> Hours of time
        // System.out.println(date.getMinutes()); // --> Minutes of time
        // System.out.println(date.getSeconds()); // --> seconds of time
        // @SuppressWarnings({"unchecked", "deprecated"})
        // Date date1 = new Date(2021, 12, 24); // both dates are different -----> this method is deprecated
        // System.out.println(date1.compareTo(date1));
        // System.out.println(date.compareTo(date1)); // that's WHy it show 1
        
    }
}