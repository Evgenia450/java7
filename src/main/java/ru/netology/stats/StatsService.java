package ru.netology.stats;

public class StatsService {
    public int calculateSumAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateAverageSales(int[] sales) {
        int averageSales = calculateSumAllSales(sales) / sales.length;
        return averageSales;
    }

    public int calculateMaxMonthSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateMinMonthSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateMonthUnderAverageSales(int[] sales) {
        int amountMonth = 0;
        int averageSales = calculateAverageSales(sales);
        for (int sale : sales) {
            if (sale < averageSales) {
                amountMonth++;
            }
        }
        return amountMonth;
    }

    public int calculateMonthOverAverageSales(int[] sales) {
        int amountMonth = 0;
        int averageSales = calculateAverageSales(sales);
        for (int sale : sales) {
            if (sale > averageSales) {
                amountMonth++;
            }
        }
        return amountMonth;
    }
}