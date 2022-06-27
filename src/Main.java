
    import java.util.Scanner;

    public class Main {

        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            StepTracker stepTracker = new StepTracker();

            while (true) {
                commands();
                int command = scanner.nextInt();
                if (command == 1) {
                    System.out.println("Введите номер месяца:");
                    int month = scanner.nextInt();
                    System.out.println("Введите день:");
                    int day = scanner.nextInt();
                    System.out.println("Введите количество шагов:");
                    while(true)
                    {int step=scanner.nextInt();
                        if (step>=0){
                            stepTracker.setSteps(step,month,day);
                            break;}
                        else {
                            System.out.println("Ошибка.Попробуйте ввести положительное число.");
                        }}

                }
                else if (command==2) {
                    System.out.println("Данные за какой месяц вы бы хотели увидеть? (Введите номер месяца)");
                    int month = scanner.nextInt();
                    stepTracker.printSteps(month);
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

        }


    public static void commands() //Меню
    {
        System.out.println("Выберите пункт меню:");
        System.out.println("1 - Ввести количество шагов за день.");
        System.out.println("2 - Напечатать статистику за выбранный месяц.");
        System.out.println("3 - Изменить цель по количеству шагов в день.");
        System.out.println("4 - Выход.");
    }
}


