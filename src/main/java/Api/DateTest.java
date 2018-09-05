package Api;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public static void main(String[] args) { //1
         LocalDateTime greatDay = LocalDateTime.parse("2011-12-03T10:15:30");//2
           String greatDayStr = greatDay.format(DateTimeFormatter.ISO_DATE_TIME); //3
           System.out.println(greatDayStr);//4
         }
}
