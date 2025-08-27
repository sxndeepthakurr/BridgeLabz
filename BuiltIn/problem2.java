import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class problem2 {

    public static void main(String[] args) {
        
        LocalDate startDate = LocalDate.of(2023, 1, 15);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Starting Date: " + startDate.format(formatter));
        
        LocalDate resultDate = startDate
            .plusDays(7)
            .plusMonths(1)
            .plusYears(2);
        
        System.out.println("After adding 7 days, 1 month, and 2 years: " + resultDate.format(formatter));

        LocalDate finalDate = resultDate.minusWeeks(3);
        
        System.out.println("After subtracting 3 weeks: " + finalDate.format(formatter));
    }
}
