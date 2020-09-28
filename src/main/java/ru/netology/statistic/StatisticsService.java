package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        int index = 0;
        for (int i = 0; i < incomes.length; i++) {
            index = incomes[i] > incomes[index] ? i : index;
        }

        return index;
    }
}