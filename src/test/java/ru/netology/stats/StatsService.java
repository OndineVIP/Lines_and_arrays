package ru.netology.stats;

import org.junit.jupiter.api.Assertions;

public class StatsService {
    public long sum(long[] sales) {
        long FinalSales = 0;
        for (long sale : sales) {
            FinalSales += sale;
        }

        return FinalSales;
    }

    public long average(long[] sales) {
        long FinalSales = 0;
        for (long sale : sales) {
            FinalSales += sale;
        }
        long average = FinalSales / 12;

        return FinalSales;
    }

    public long maxsalels(long[] sales) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxsalels(sales);
        long expected = 8;
\
        Assertions.assertEquals(expected, actual)
    }
    public long mminsalels(long[] sales) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxsalels(sales);
        long expected = 11;

        Assertions.assertEquals(expected, actual)
    }

}