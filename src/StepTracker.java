public class StepTracker {

    int[][] monthToData = new int[12][30];
    StepTracker(){
    int[][] monthToData;
    }
    int goal = 10000;
    Converter converter = new Converter();
    void setSteps(int step, int month, int day)
    {
        monthToData[month-1][day-1]=monthToData[month-1][day-1]+step;
        System.out.println("Значение сохранено.");
    }
    void printSteps(int month){
        int monthSteps=0;
        int maxSteps = 0;
        int series = 0;
        int bestSeries = 0;
        for (int i=0;i<30;i++){
            System.out.println((i+1)+ " день: "+ monthToData[month-1][i]);
            monthSteps=monthSteps+monthToData[month-1][i];
            if(monthToData[month-1][i]>maxSteps)
            {maxSteps=monthToData[month-1][i];}
            if (monthToData[month-1][i]>goal)
            {series=series+1;}
            else
            {if(series>bestSeries)
            {bestSeries=series;}
                series=0;}
        }
        System.out.println("Общее количество шагов за месяц: "+monthSteps+".");
        System.out.println("Максимальное количество шагов в этом месяце: "+maxSteps+".");
        System.out.println("Среднее количество шагов в этом месяце: "+monthSteps/30+".");
        converter.convert(maxSteps);
        System.out.println("Лучшая серия шагов "+bestSeries+" дня подряд.");

    }

    void setGoal(int newGoal){
        goal = newGoal;
        System.out.println("Принято. Новое количество шагов для достижения цели: "+goal+".");
    }
}
