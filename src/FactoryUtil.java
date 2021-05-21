import java.time.LocalDate;

public class FactoryUtil {

    public static LocalDate getDate() {
        int dayOfMonth = (int)(Math.random()*28)+1;
        int month = (int)(Math.random()*12)+1;
        int year = (int)(Math.random()*22)+2000;
        return LocalDate.of(year, month, dayOfMonth);
    }

}
