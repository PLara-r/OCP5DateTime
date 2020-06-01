import java.time.*;
public class Main {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());

        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);

        LocalDate date1 = date.plusDays(2).minusDays(1);


        Period everyYearAndAWeek = Period.of(1, 0, 7);
        System.out.println(date1.plus(everyYearAndAWeek));

    }
}
