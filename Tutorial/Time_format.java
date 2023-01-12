import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
this is an Abstract class so we cant create instance of this Clock class
1.Clock class: =============================
    --------- Methods ------------
    getZone()
    instant()
 2.Duration class :=============================
    This class is used to measure time in seconds and nano seconds.
    -----methods--------
   isNegative():  Checks if this duration is negative, excluding zero.
   isZero() : This method is used to check if the duration is zero. Returns boolean value.

3. LocalDate class :
    This class is useful for representing the dates in the year-month-day format.
    --------method ---
4.LocalTime class :
    This class helps us to represent the time without the dates.
    ---- method ---
    minusMinutes(long minutesToSubtract)
    plusHours(long hoursToAdd)
============================================================================================

DateTimeFormatter----> Here can Set a formate to display time date;;
        format() : this method throw exception

 */
public class Time_format {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());
        Clock cl1= Clock.systemUTC();
        System.out.println(cl1.instant()); 

        Duration du1 = Duration.between(LocalTime.MIN,LocalTime.NOON);
        System.out.println(LocalTime.NOON);
        System.out.println(LocalTime.MIN);
        System.out.println(du1);
        System.out.println(du1.isNegative()); 
        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);   //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'
        System.out.println(d2);
        System.out.println(d2.isNegative());
        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.MIDNIGHT); //LocalTime.MIN = '00:00' , LocalTime.NOON = '00:00'
        System.out.println(d1.isZero());

        LocalDate locda = LocalDate.now();
        System.out.println(locda);
        LocalDate ld1= LocalDate.parse("2021-05-26");
        System.out.println(ld1);
        System.out.println(ld1.equals(locda));
        System.out.println(locda.withYear(2023));  // _---> Given Year set as Its actual year

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // ----> print with nano seconds
        localTime = localTime.plusHours(4); // By this Adding in hours but like this many others VIsit in java Docs 14
        System.out.println("After adding 4 Hours : " + localTime);
        localTime = localTime.minusMinutes(4); // By this minus in mints but like this many others VIsit in java Docs 14
        System.out.println("After minus 4 Minutes from Actual time : " + localTime);


        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy || H:m");  /// This Only a format it return nothing special;;;
          // For this syntax visit DOcs o Theory
        String MyDateTime = localDateTime.format(df); // Creating date string using date and format, Store as String The time
        System.out.println(">> Formatting Date"+MyDateTime);

        DateTimeFormatter dtFormatter1 = DateTimeFormatter.ISO_LOCAL_DATE;// Formatting the date in the ISO format
        DateTimeFormatter dtFormatter2 = DateTimeFormatter.ISO_WEEK_DATE;
        DateTimeFormatter dtFormatter3 = DateTimeFormatter.ISO_ORDINAL_DATE;//

        System.out.println("Date in ISO format : " + localDateTime.format(dtFormatter1));
        System.out.println("Date in ISO_WEEK_DATE format : " + localDateTime.format(dtFormatter2));
        System.out.println("Date in ISO_ORDINAL_DATE format : "+ localDateTime.format(dtFormatter3));

        // IF Want to Know What is this Format --< Visit In  https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/time/format/DateTimeFormatter.html#method.summary
       
        
    }
}
