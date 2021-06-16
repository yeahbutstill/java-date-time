package net.site.great.yeahbutstill.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class DayOfWeekTest {

    @Test
    void testCreate() {

        DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
        DayOfWeek dayOfWeek1 = dayOfWeek.plus(7);
        DayOfWeek dayOfWeek2 = dayOfWeek.plus(1);

        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek1);
        System.out.println(dayOfWeek2);

    }
}
