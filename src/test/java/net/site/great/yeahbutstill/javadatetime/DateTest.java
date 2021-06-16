package net.site.great.yeahbutstill.javadatetime;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateTest {

    @Test
    void testCreate() {

        var date = new Date();
        var date1 = new Date(System.currentTimeMillis());
        var date2 = new Date(1623173802094L);

        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);

    }
}
