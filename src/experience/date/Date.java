package experience.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LongSummaryStatistics;

public class Date {


    public static void main(String[] args) {
        LocalDate date =LocalDate.of(1997,02,27);
        System.out.println(date);
        LocalDate date5 = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println("=======");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println("========");
        LocalDate date1=LocalDate.EPOCH;
        System.out.println(date1);

        System.out.println("========");
        LocalDate date2 = LocalDate.ofYearDay(1997,58);
        System.out.println(date2);

        System.out.println("========");
        LocalDate date3 =LocalDate.MAX;
        System.out.println(date3);

        LocalDate date4 =LocalDate.MIN;
        System.out.println(date4);
        System.out.println("=========");





    }

}
