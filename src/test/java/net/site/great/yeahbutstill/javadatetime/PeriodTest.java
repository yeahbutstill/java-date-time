package net.site.great.yeahbutstill.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

    @Test
    void testCreate() {

        Period period = Period.ofDays(10);
        Period period1 = Period.ofWeeks(10);
        Period period2 = Period.ofMonths(10);
        Period period3 = Period.ofYears(10);
        Period period4 = Period.of(10, 10, 10);

        System.out.println(period);
        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);

    }

    @Test
    void testGet() {

        Period period = Period.of(10, 10, 10);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }

    @Test
    void testBetween() {

        Period period = Period.between(
                LocalDate.of(1993, 8, 22),
                LocalDate.now()
        );

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
}
