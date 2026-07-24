import java.time.*;

public class DateTimeDemo {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("Date: " + date);

        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("DateTime: " + dateTime);

        ZonedDateTime zoneDateTime = ZonedDateTime.now();
        System.out.println("Zoned DateTime: " + zoneDateTime);
    }
}