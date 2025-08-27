
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
    
public class problem4 {
    
    public static void main(String[] args) {
    
        LocalDate date1 = LocalDate.of(2023, 10, 26);
        LocalDate date2 = LocalDate.of(2023, 11, 15);
    
        System.out.println("Comparing Date 1 (" + date1 + ") and Date 2 (" + date2 + "):");
        System.out.println("---------------------------------------------------------");
    
        if (date1.isBefore(date2)) {
            System.out.println("Date 1 is before Date 2.");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date 1 is after Date 2.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Date 1 is the same as Date 2.");
        }
    }
}
