public class StepTracker {
    private final int[][] monthToData = new int[12][30];
    private int goal = 10000;
    private final Converter converter = new Converter();

    void setSteps(int step, int month, int day) {
        monthToData[month][day] = monthToData[month][day] + step;
        System.out.println("Значение сохранено.");
    }

    void setGoal(int newGoal) {
        goal = newGoal;
        System.out.println("Принято. Новое количество шагов для достижения цели: " + goal + ".");
    }

    void printSteps(int month) {
        int monthSteps=0;
        int maxSteps = 0;
        int series = 0;
        int bestSeries = 0;
        for (int i = 0; i < 30; i++) {
            System.out.print((i + 1) + " день: " + monthToData[month][i]);
            if (i != 29) {
                System.out.print(", ");
            }
            monthSteps = monthSteps + monthToData[month][i];
            if (monthToData[month][i] > maxSteps) maxSteps = monthToData[month][i];
            if (monthToData[month][i] >= goal) series = series+1;
            else {
            if(series > bestSeries) bestSeries = series;
            series=0;
            }
        }
        System.out.println("\n"+ "Общее количество шагов за месяц: " + monthSteps + ".\n" +
        "Максимальное количество шагов в этом месяце: " + maxSteps + ".\n" +
        "Среднее количество шагов в этом месяце: " + monthSteps / 30 + ".");
        converter.convertkm(monthSteps);
        converter.convertkkal(monthSteps);
        printBestSeries(bestSeries);
    }

    void printBestSeries(int bestSeries) {
        if (bestSeries % 10 == 1)
            System.out.println("Лучшая серия шагов " + bestSeries + " день подряд.");
        else if (bestSeries % 10 == 2 || bestSeries % 10 == 3 || bestSeries % 10 == 4)
            System.out.println("Лучшая серия шагов " + bestSeries + " дня подряд.");
        else
            System.out.println("Лучшая серия шагов " + bestSeries + " дней подряд.");
    }
}
