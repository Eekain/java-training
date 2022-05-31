package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {

    public static void main(String[] args) {
        LocalDateTime t = LocalDateTime.now();
        System.out.println(t);

        LocalDate d = LocalDate.now();
        System.out.println(d);;

        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalDateTime t1 = LocalDateTime.of(2022, 1, 1, 10, 2);
        System.out.println(t1);

        LocalDateTime t2 = LocalDateTime.of(2022, 9, 01,10, 2);

        System.out.println(077); // nullával kezdve nyolcas számrendszerben számolja, ami...nem az, mint szeretnéd
        System.out.println(t1.isAfter(t2)); //és isBefore() az összehasonlítók.
        System.out.println( 5 % 2 == 0 ? 4 : 3);
    }
}
