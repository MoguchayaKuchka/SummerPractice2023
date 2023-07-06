package practice.first_source.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    public static boolean isLastWeek(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dt = LocalDate.parse(date, formatter);
        return dt.isAfter(LocalDate.now().minusDays(7));
    }
}
