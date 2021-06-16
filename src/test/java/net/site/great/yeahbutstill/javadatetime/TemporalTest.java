package net.site.great.yeahbutstill.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.*;
import java.util.ArrayList;
import java.util.List;

public class TemporalTest {

    @Test
    void testTemporal() {

        Temporal temporal = LocalDate.now();
        Temporal temporal1 = LocalDateTime.now();
        Temporal temporal2 = ZonedDateTime.now();
        Temporal temporal3 = Year.now();
        Temporal temporal4 = LocalTime.now();
        Temporal temporal5 = YearMonth.now();
        Temporal temporal6 = Instant.now();

        System.out.println(temporal);
        System.out.println(temporal1);
        System.out.println(temporal2);
        System.out.println(temporal3);
        System.out.println(temporal4);
        System.out.println(temporal5);
        System.out.println(temporal6);

    }

    @Test
    void testTemporalAmount() {

        Temporal temporal = LocalDateTime.now();
        Temporal temporal1 = temporal.plus(Duration.ofHours(10));
        Temporal temporal2 = temporal.plus(Period.ofDays(10));

        System.out.println(temporal);
        System.out.println(temporal1);
        System.out.println(temporal2);

    }

    @Test
    void testTemporalUnit() {

        long temporalUnit = ChronoUnit.MINUTES.between(LocalTime.now(), LocalTime.now().plusHours(10));
        long temporalUnit1 = ChronoUnit.SECONDS.between(LocalDateTime.now(), LocalDateTime.now().plusDays(10));
        long temporalUnit2 = ChronoUnit.DAYS.between(LocalDateTime.now(), LocalDateTime.now().plusDays(10));

        System.out.println(temporalUnit);
        System.out.println(temporalUnit1);
        System.out.println(temporalUnit2);

    }

    @Test
    void testTemporalField() {

        Temporal temporal = LocalDateTime.now();
        int chronoYear = temporal.get(ChronoField.YEAR);
        int monthYear = temporal.get(ChronoField.MONTH_OF_YEAR);
        int dayMonth = temporal.get(ChronoField.DAY_OF_MONTH);
        int hourDay = temporal.get(ChronoField.HOUR_OF_DAY);
        int minuteHour = temporal.get(ChronoField.MINUTE_OF_HOUR);
        int secondMinute = temporal.get(ChronoField.SECOND_OF_MINUTE);
        int milliDay = temporal.get(ChronoField.MILLI_OF_DAY);
        int milliSecond = temporal.get(ChronoField.MILLI_OF_SECOND);
        int nanoSecond = temporal.get(ChronoField.NANO_OF_SECOND);

        System.out.println(chronoYear);
        System.out.println(monthYear);
        System.out.println(dayMonth);
        System.out.println(hourDay);
        System.out.println(minuteHour);
        System.out.println(secondMinute);
        System.out.println(milliDay);
        System.out.println(milliSecond);
        System.out.println(nanoSecond);

    }

    @Test
    void testTemporalQuery() {

        Temporal temporal = LocalDateTime.now();
        List<Integer> integer = temporal.query(new TemporalQuery<List<Integer>>() {
            @Override
            public List<Integer> queryFrom(TemporalAccessor temporalAccessor) {
                ArrayList<Integer> list = new ArrayList<>();

                list.add(temporal.get(ChronoField.YEAR));
                list.add(temporal.get(ChronoField.MONTH_OF_YEAR));
                list.add(temporal.get(ChronoField.DAY_OF_MONTH));

                return list;
            }
        });

        System.out.println(integer);

    }

    @Test
    void testTemporalAdjuster() {

        Temporal temporal = LocalDate.now();
        System.out.println(temporal);

        // manual
        Temporal temporal1 = temporal.with(new TemporalAdjuster() {
            @Override
            public Temporal adjustInto(Temporal temporal) {
                return LocalDate.of(
                        temporal.get(ChronoField.YEAR),
                        temporal.get(ChronoField.MONTH_OF_YEAR),
                        1
                );
            }
        });
        System.out.println(temporal1);

        Temporal temporal2 = temporal.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(temporal2);
        Temporal temporal3 = temporal.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(temporal3);

    }
}
