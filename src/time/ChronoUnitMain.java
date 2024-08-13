package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] values =ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = "+value);
        }
        System.out.println("HOURS = " + ChronoUnit.HOURS);
        System.out.println("HOURS.duration = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("DAYS+"+ ChronoUnit.DAYS );
        System.out.println("DAYS.Duration = " + ChronoUnit.DAYS.getDuration().getSeconds());

        //차이 구하기
        LocalTime li1 = LocalTime.of(1, 10, 0);
        LocalTime li2 = LocalTime.of(1, 20, 0);

        long secondBetween = ChronoUnit.SECONDS.between(li1,li2);
        System.out.println("secondBetween = " + secondBetween);

        long minutesBetween = ChronoUnit.MINUTES.between(li1, li2);
        System.out.println("minutesBetween = " + minutesBetween);

    }

}
