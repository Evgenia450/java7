package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    public void shouldCalculateSumAllSales() {
        StatsService service = new StatsService();
        int[] sales = {48, 23, 43, 5, 77, 8, 21, 23, 10, 1, 14, 0, 23, 55};
        int expected = 351;

        int actual = service.calculateSumAllSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {48, 23, 43, 5, 77, 8, 21, 23, 10, 1, 14, 0, 23, 55};
        int expected = 25;

        int actual = service.calculateAverageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMaxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {48, 23, 43, 5, 77, 8, 21, 23, 10, 1, 14, 0, 23, 55};
        int expected = 5;

        int actual = service.calculateMaxMonthSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMinMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {48, 23, 43, 5, 77, 8, 21, 23, 10, 1, 14, 0, 23, 55};
        int expected = 12;

        int actual = service.calculateMinMonthSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthUnderAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {48, 23, 43, 5, 77, 8, 21, 23, 10, 1, 14, 0, 23, 55};
        int expected = 10;

        int actual = service.calculateMonthUnderAverageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthOverAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {48, 23, 43, 5, 77, 8, 21, 23, 10, 1, 14, 0, 23, 55};
        int expected = 4;

        int actual = service.calculateMonthOverAverageSales(sales);

        assertEquals(expected, actual);
    }
}