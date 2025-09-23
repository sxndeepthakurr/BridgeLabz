import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class builtin {

    public static void main(String[] args) {

        ZonedDateTime currentTime = ZonedDateTime.now();

        ZoneId gmtZone = ZoneId.of("Etc/GMT");
        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        ZoneId pstZone = ZoneId.of("America/Los_Angeles");

        ZonedDateTime gmtTime = currentTime.withZoneSameInstant(gmtZone);
        ZonedDateTime istTime = currentTime.withZoneSameInstant(istZone);
        ZonedDateTime pstTime = currentTime.withZoneSameInstant(pstZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        System.out.println("Current Time in different Time Zones:");
        System.out.println("------------------------------------------");
        System.out.println("GMT (Greenwich Mean Time): " + gmtTime.format(formatter));
        System.out.println("IST (Indian Standard Time): " + istTime.format(formatter));
        System.out.println("PST (Pacific Standard Time): " + pstTime.format(formatter));

        System.out.println("\nExample: Current hour in GMT is " + gmtTime.getHour());
    }
}
