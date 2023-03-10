/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task03;


import java.util.Random;
import java.util.Scanner;

/**
 * Головний клас програми, що виконує розрахунок значення функції для різних аргументів та надає можливість
 * зберегти результат обчислень у файл або відновити збережений результат.
 */
public class Main {

    /** Объект, реализующий интерфейс {@linkplain View};
	* обслуживает коллекцию объектов {@linkplain ex01.Item2d}
	*/
	private View view;

	/** Инициализирует поле {@linkplain Main#view view}. */
	public Main(View view) 
	{
		this.view = view;
	}

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
                    view.viewShow();
                    break;
                case 'g':
                    Random random = new Random();
                    System.out.println("Random generation.");
                    view.viewInit();
		    view.viewShow();
                    break;
                case 's':
                    System.out.println("Save current.");
                    try {
                        view.viewSave();
                    } catch (Exception e) {
                        System.out.println("Serialization error: " + e);
                    }
                    view.viewShow();
                    break;
                case 'r':
                    System.out.println("Restore last saved.");
                    try {
                        view.viewLoad();
                    } catch (Exception e) {
                        System.out.println("Serialization error: " + e);
                    }
                    view.viewShow();
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
		Main main = new Main(new ViewableResult().getView());
		main.menu();
	}

}