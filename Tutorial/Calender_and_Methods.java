import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
[[[[[[[[[[[[[[[[[[[======================== Normal CAlENDER =============]]]]]]]]]]]]]]]]]]]
    The calendar class in java provides the methods that helps in converting date between a specific instant in time.
    It is an abstract class.  ----> public abstract class Calendar
    Since it is an abstract class, we can not create an instance of this class with the help of a constructor.
    We use the static method Calender.getInstance() in order to implement a sub-class.

Constructors of the Calendar class :
    Calendar(): This constructor is used to construct a calendar with the default time zone & locale.
    Calendar(Time zone, Locale locale): This constructor is used to construct a calendar with the specified time zone & locale.

Methods of the Calendar class : 
    get(int field) : This method returns the value of the specified calendar field.add(int field, int amount) :
   add(int field, int amount) : This method is useful for calculating the time after or before of a specified calendar field. 
                                By add Or subtract Some year or month we  can find specific day on that that year
    getWeeksInWeekYear() :
    getMaximum(int field) : Returns the maximum value for the specified calendar field. {Field is like Second or month or Year or Hours}

][[[[[[[[[[[[[[[[[[[[[[[[[[[[[[================== GregorianCalendar class ==================]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
    The calendar class is an abstract class. So, the instance of this class can not be instantiated. Therefore, we need to use the static method Calendar.getInstance() to initialize the object of the Calendar class :

    ---- Constructor ------
    GregorianCalendar(): This constructor is used to initialize an object with the current time in the default time zone.
    GregorianCalendar(int year, int month, int day): This constructor is used to initialize an object with the date-set specified as parameters in the default time zone and default locale.
    GregorianCalendar(int year, int month, int day, int hours, int minutes): This constructor initializes an object with the given date and time set in the default locale and time zone.
    GregorianCalendar(int year, int month, int day, int hours, int minutes, int seconds): This constructor initializes an object with the more specific time and date-set passed as a parameter in the default locale and time zone.
    GregorianCalendar(Locale locale): Initializes a GregorianCalendar object with the current date and time in the default time zone and the specified locale.
    GregorianCalendar(TimeZone timeZone): Initializes a GregorianCalendar object with the current date and time in the default locale and the specified time zone.
    GregorianCalendar(TimeZone timeZone, Locale locale): Initializes an object with the locale and timezone passed as parameters.

    --------- Methods ------------
    isLeapYear(int year) :
    roll(int field, boolean up) : if true then  rolls up the value by 1 (+1).if false then rolls down the value by 1 (-1). 
    getTime()
    getDefault()
    getId()

 */

public class Calender_and_Methods {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {


        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getCalendarType());
         System.out.println(cal.getTimeZone());
         System.out.println("Current date is : " + cal.getTime());
        System.out.println("Current year is :"+ cal.get(Calendar.YEAR));
        System.out.println("Current month is :"+ cal.get(Calendar.MONTH)); //The indexing for month field ranges from [0,11] 
        System.out.println("Current day is :"+ cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is :"+ cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is :"+ cal.get(Calendar.MINUTE));
        System.out.println("Current second is :"+ cal.get(Calendar.SECOND));
        System.out.println( cal.get(Calendar.HOUR_OF_DAY)+ ":"+cal.get(Calendar.MINUTE) + ":"+cal.get(Calendar.SECOND));
        cal.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : "+ cal.getTime());  // after 4 years form today what wil be the day that can fnd bt this
        cal.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : "+ cal.getTime());  // AS that we can also find that 12 years before form today what wil be the day that can fnd bt this
        cal.add(Calendar.MONTH,2);
        System.out.println("After 2 months  : "+ cal.getTime());
        System.out.println("The holydays In an Year is:System.out.println(gergorcal.getWeeksInWeekYear()); "+cal.getWeeksInWeekYear());
        System.out.println(" The maximum no. of Hours on A day : " + cal.getMaximum(Calendar.HOUR_OF_DAY));
        
        System.out.println();
        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("Europe/London")); // By this We get time and date of Another Area
        System.out.println(cal2.getTimeZone());
        System.out.println(cal2.getTime());

    GregorianCalendar gergorcal = new GregorianCalendar();
    System.out.println(gergorcal.isLeapYear(2000));
    System.out.println(gergorcal.isLeapYear(2021));

    System.out.println("Date before rolling : " + gergorcal.getTime());   
    gergorcal.roll(Calendar.MONTH, true); // as True , Next month 
    gergorcal.roll(Calendar.DATE, false); // one date before or date decrease by 1
    gergorcal.roll(Calendar.YEAR, true);
    System.out.println("Date after rolling : " + gergorcal.getTime());
    System.out.println("The hashCode for this calendar is : "+ gergorcal.hashCode());
   // --> We Can List down all timeZones In this way
    System.out.println(TimeZone.getAvailableIDs()[0]); 
    System.out.println(TimeZone.getAvailableIDs()[1]); 
    System.out.println(TimeZone.getAvailableIDs()[2]);
           
       
    }
}
