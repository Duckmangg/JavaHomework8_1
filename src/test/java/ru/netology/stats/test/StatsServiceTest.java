package ru.netology.stats.test;

import org.junit.jupiter.api.Assertions;
import ru.netology.stats.Conditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatsServiceTest {
    @Test
    public void totalSalesOfAllMonthsTest() {
        Conditioner cond = new Conditioner();
        cond.setCurrentTemperature(40);
        int actual = cond.getCurrentTemperature();
        int expected = 0;

        assertEquals(expected, actual);
    }

}