package net.site.great.yeahbutstill.javadatetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormattingTest {

    @Test
    void testParsing() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate localDate = LocalDate.parse("2021 10 25", formatter);
        LocalDate localDate1 = LocalDate.parse("2021-09-22");
        System.out.println(localDate);
        System.out.println(localDate1);

    }

    @Test
    void testFormatter() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate localDate = LocalDate.parse("2021 06 14", formatter);
        String format = localDate.format(formatter);
        System.out.println(format);

    }

    @Test
    void testDefaultFormatter() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2021 10 25", formatter);
        String format = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format);

    }

    @Test
    void testI18n() {

        Locale locale = new Locale("en", "US");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

        LocalDate localDate = LocalDate.of(2021, 1, 1);
        String format = localDate.format(formatter);

        System.out.println(format);

    }
}
