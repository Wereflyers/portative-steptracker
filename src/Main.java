
    import java.util.Scanner;

    public class Main {

        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            StepTracker stepTracker = new StepTracker();
            int month,day,step;

            while (true) {
                commands();
                int command = scanner.nextInt();
                if (command == 1) {
                    System.out.println("Введите номер месяца:");
                    while(true)
                    {month = scanner.nextInt();
                        if (month>0&&month<=12){
                            break;}
                        else {
                            System.out.println("Ошибка.Попробуйте ввести число от 1 до 12.");
                        }}
                    System.out.println("Введите день:");
                    while(true)
                    {day = scanner.nextInt();
                        if (day>0&&day<=30){
                            break;}
                        else {
                            System.out.println("Ошибка.Попробуйте ввести число от 1 до 30.");
                        }}
                    System.out.println("Введите количество шагов:");
                    while(true)
                    {step=scanner.nextInt();
                        if (step>=0){
                            stepTracker.setSteps(step,month-1,day-1);
                            break;}
                        else {
                            System.out.println("Ошибка.Попробуйте ввести положительное число.");
                        }}

                }
                else if (command==2) {
                    System.out.println("Данные за какой месяц вы бы хотели увидеть? (Введите номер месяца)");
                    while(true)
                    {month = scanner.nextInt();
                        if (month>0&&month<=12){
                            stepTracker.printSteps(month-1);
                            break;}
                        else {
                            System.out.println("Ошибка.Попробуйте ввести число от 1 до 12.");
                        }}
                }
                else if (command==3) {
                    System.out.println("Введите новую цель:");
                    while(true)
                    {int newGoal=scanner.nextInt();
                    if (newGoal>=0){
                    stepTracker.setGoal(newGoal);
                    break;}
                    else {
                        System.out.println("Ошибка.Попробуйте ввести положительное число.");
                    }}
                }
                else if (command==4) {
                    System.out.println("Программа завершена.");
                    break;
                }
                else {
                    System.out.println("Извините, такой команды не существует. Попробуйте снова.");
                }
            }

            scanner.close();

        }


    public static void commands() //Меню
    {
        System.out.println("Выберите пункт меню:\n"+
        "1 - Ввести количество шагов за день.\n"+
        "2 - Напечатать статистику за выбранный месяц.\n"+
        "3 - Изменить цель по количеству шагов в день.\n"+
        "4 - Выход.");
    }
}


