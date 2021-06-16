package net.site.great.yeahbutstill.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ClockTest {

    @Test
    void create() {

        Clock clock = Clock.systemUTC();
        System.out.println(clock);

        Clock clock2 = Clock.systemDefaultZone();
        System.out.println(clock2);

        Clock clock3 = Clock.system(ZoneId.of("Asia/Jakarta"));
        System.out.println(clock3);

    }

    @Test
    void instant() throws Throwable {

        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        Instant instant = clock.instant();
        System.out.println(instant);

        Thread.sleep(1_000);

        Instant instant1 = clock.instant();
        System.out.println(instant1);

    }

    @Test
    void fromClock() {

        Clock clockJakarta = Clock.system(ZoneId.of("Asia/Jakarta"));

        Year year = Year.now(clockJakarta);
        YearMonth yearMonth = YearMonth.now(clockJakarta);
        LocalTime localTime = LocalTime.now(clockJakarta);
        LocalDate localDate = LocalDate.now(clockJakarta);
        LocalDateTime localDateTime = LocalDateTime.now(clockJakarta);
        ZonedDateTime zoneDateTime = ZonedDateTime.now(clockJakarta);
        OffsetTime offsetTime = OffsetTime.now(clockJakarta);
        OffsetDateTime offsetDateTime = OffsetDateTime.now(clockJakarta);

        System.out.println(year);
        System.out.println(yearMonth);
        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(zoneDateTime);
        System.out.println(offsetTime);
        System.out.println(offsetDateTime);

    }
}
