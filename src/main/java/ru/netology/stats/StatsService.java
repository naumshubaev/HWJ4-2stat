package ru.netology.stats;

public class StatsService {

    public long allSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
//            sum = sum + sale;
        }
        return sum;
    }

    public long averageSale(long[] sales) {
        StatsService service = new StatsService();
        long sum = service.allSales(sales);
        long average = sum / sales.length;
        return average;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int monthIndex = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = monthIndex;
            }
            monthIndex = monthIndex + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int monthIndex = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = monthIndex;
            }
            monthIndex = monthIndex + 1;
        }
        return maxMonth + 1;
    }

    public int numberMonthsBelowAverage(long[] sales) {
        StatsService service = new StatsService();
        int indexBelowAverage = 0;
        long average = service.averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                indexBelowAverage++;
            }
        }
        return indexBelowAverage;
    }

    public int numberMonthsAboveAverage(long[] sales) {
        StatsService service = new StatsService();
        int indexAboveAverage = 0;
        long average = service.averageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                indexAboveAverage++;
            }
        }
        return indexAboveAverage;
    }

}
