package ru.netology.statistic;

public class StatisticsService {

    public long findMax(long[] incomes) {
        int index = 0;
        for (int i = 0; i < incomes.length; i++) {
            index = incomes[i] >= incomes[index] ? i : index;
        }

        return index;
    }

    public long findSum(long[] incomes) {
        long sum = 0;
        for (long income : incomes) {
            sum += income;
        }
        return sum;
    }

    public long findAverageSales(long[] incomes) {
        long sum = findSum(incomes);
        long averageSales = sum / incomes.length;
        return averageSales;
    }
}