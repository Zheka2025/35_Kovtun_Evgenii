package Task02;

import java.util.Random;
import java.util.Scanner;

/**
 * Головний клас програми, що виконує розрахунок значення функції для різних аргументів та надає можливість
 * зберегти результат обчислень у файл або відновити збережений результат.
 */
public class Main {

    /**
     * Об'єкт класу {@linkplain Calc}.<br>Розв'язує завдання індивідуального завдання.
     */
    private Calc calc = new Calc();

    /**
     * Отображає меню.
     */
    private void menu() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Enter command...");
            System.out.print("'q'uit, 'v'iew, 'g'enerate, 's'ave, 'r'estore: ");
            input = scanner.nextLine();
            switch (input.charAt(0)) {
                case 'q':
                    System.out.println("Exit.");
                    break;
                case 'v':
                    System.out.println("View current.");
                    calc.show();
                    break;
                case 'g':
                    Random random = new Random();
                    System.out.println("Random generation.");
                    calc.init(random.ints(0, 360).findFirst().getAsInt());
                    calc.show();
                    break;
                case 's':
                    System.out.println("Save current.");
                    try {
                        calc.save();
                    } catch (Exception e) {
                        System.out.println("Serialization error: " + e);
                    }
                    calc.show();
                    break;
                case 'r':
                    System.out.println("Restore last saved.");
                    try {
                        calc.load();
                    } catch (Exception e) {
                        System.out.println("Serialization error: " + e);
                    }
                    calc.show();
                    break;
                default:
                    System.out.print("Wrong command. ");
            }
        } while (input.charAt(0) != 'q');
        scanner.close();
    }

    /**
     * Виконується при запуску програми.
     * Виконується розрахунок значення функції для різних аргументів.
     * Результати обчислень виводяться на екран.
     * @param args - параметри запуску програми.
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
}