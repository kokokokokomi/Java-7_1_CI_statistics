package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 10;

        long actual = service.findMax(incomes);

        assertEquals(expected, actual);
    }

    @Test
    void findSum() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 85;
        long actual = service.findSum(incomes);
        assertEquals(expected, actual);
    }

    @Test
    void findAverageSales() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 7;
        long actual = service.findAverageSales(incomes);
        assertEquals(expected, actual);
    }
}