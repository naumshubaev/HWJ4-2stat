package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//        long[] sales = new long[12];
        StatsService service = new StatsService();
//        long sum = 0;
        long sum = service.allSales(sales);
        long average = service.averageSale(sales);
        int minIndex = service.minSales(sales);
        int maxIndex = service.maxSales(sales);
        int numberMonthsBelow = service.numberMonthsBelowAverage(sales);
        int numberMonthsAbove = service.numberMonthsAboveAverage(sales);

        // temporary:
        System.out.println("Sum: " + sum +
                ", Average: " + average +
                ", Min Sales Month: " + minIndex +
                ", Max Sales Index: " + maxIndex +
                ", Number Months < Avrg: " + numberMonthsBelow +
                ", Number Months > Avrg: " + numberMonthsAbove);

    }
}
