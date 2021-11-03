package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
// Sum: 180, Average: 15,
// Min Sales Month: 9, Max Sales Index: 8,
// Number Months < Avrg: 5, Number Months > Avrg: 5
    @Test
    void shouldCalculateAllSales() {
        long expected = 180;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actualSum = service.allSales(sales);
        assertEquals(expected, actualSum);
    }
    @Test
    void shouldCalculateAverageSale() {
        long expected = 15;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        long actualAverage = service.averageSale(sales);
/*        int minIndex = service.minSales(sales);
        int maxIndex = service.maxSales(sales);
        int numberMonthsBelow = service.numberMonthsBelowAverage(sales);
        int numberMonthsAbove = service.numberMonthsAboveAverage(sales);
        */
        assertEquals(expected, actualAverage);
    }
    @Test
    void shouldCalculateMinSalesMonth() {
        int expected = 9;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actualMinIndex = service.minSales(sales);
        assertEquals(expected, actualMinIndex);
    }
    @Test
    void shouldCalculateMaxSalesMonth() {
        int expected = 8;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actualMaxIndex = service.maxSales(sales);
        assertEquals(expected, actualMaxIndex);
    }
    @Test
    void shouldCalculateNumberMonthsBelow() {
        int expected = 5;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actualMonthsBelowAverage = service.numberMonthsBelowAverage(sales);
        assertEquals(expected, actualMonthsBelowAverage);
    }
    @Test
    void shouldCalculateNumberMonthsAbove() {
        int expected = 5;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actualMonthsAboveAverage = service.numberMonthsAboveAverage(sales);
        assertEquals(expected, actualMonthsAboveAverage);
    }
}