package datetime;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();

        System.out.println("Current date and time: " + currentTime);
        System.out.println("Today is " + currentTime.getDayOfYear() + " day of year.");

        String someDate = "2020/03/23 20:34";
        String format = "yyyy/MM/dd HH:mm";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        LocalDateTime dateParse = LocalDateTime.parse(someDate, dateTimeFormatter);
        System.out.println(dateParse);
        System.out.println("-------------------------------------");

        System.out.println("Is now tea time?");
        String teaTime = "2020/03/23 17:00";
        String formatTea = "yyyy/MM/dd HH:mm";
        DateTimeFormatter teaFormatter = DateTimeFormatter.ofPattern(formatTea);
        LocalDateTime dateTea = LocalDateTime.parse(teaTime, teaFormatter);
        if (LocalDateTime.now().getHour() == 17) {
            System.out.println("Yes, you can drink your tea!");
        } else {
            System.out.println("No, it's " + Duration.between(LocalTime.now(), dateTea).toHours() + " hours to next tea!");
        }
    }
}