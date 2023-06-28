import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        int month, day, step;

        while (true) {
            commands();
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Введите номер месяца:");
                    month = scanner.nextInt();
                    while (month <= 0 || month > 12) {
                        System.out.println("Ошибка.Попробуйте ввести число от 1 до 12.");
                        month = scanner.nextInt();
                    }
                    System.out.println("Введите день:");
                    day = scanner.nextInt();
                    while (day <= 0 || day > 30) {
                        System.out.println("Ошибка.Попробуйте ввести число от 1 до 30.");
                        day = scanner.nextInt();
                    }
                    System.out.println("Введите количество шагов:");
                    step = scanner.nextInt();
                    while (step < 0) {
                        System.out.println("Ошибка.Попробуйте ввести положительное число.");
                        step = scanner.nextInt();
                    }
                    stepTracker.setSteps(step, month - 1, day - 1);
                    break;
                case 2:
                    System.out.println("Данные за какой месяц вы бы хотели увидеть? (Введите номер месяца)");
                    month = scanner.nextInt();
                    while (month <= 0 || month > 12) {
                        System.out.println("Ошибка.Попробуйте ввести число от 1 до 12.");
                        month = scanner.nextInt();
                    }
                    stepTracker.printSteps(month - 1);
                    break;
                case 3:
                    System.out.println("Введите новую цель:");
                    int newGoal = scanner.nextInt();
                    while (newGoal < 0) {
                        System.out.println("Ошибка.Попробуйте ввести положительное число.");
                        newGoal = scanner.nextInt();
                    }
                    stepTracker.setGoal(newGoal);
                    break;
                case 4:
                    System.out.println("Программа завершена.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Извините, такой команды не существует. Попробуйте снова.");
            }
        }
    }

    public static void commands()
    {
        System.out.println("Выберите пункт меню:\n" +
                "1 - Ввести количество шагов за день.\n" +
                "2 - Напечатать статистику за выбранный месяц.\n" +
                "3 - Изменить цель по количеству шагов в день.\n" +
                "4 - Выход.");
    }
}


