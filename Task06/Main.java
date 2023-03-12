/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task06;
import Task03.*;

import Task05.*;
/**
 *
 * @author Evgenii
 */
public class Main {
	
	/** Объект, реализующий интерфейс {@linkplain View};
	* обслуживает коллекцию объектов {@linkplain ex01.Item2d};
	* инициализируется с помощью Factory Method
	*/
	private View view = new ViewableResult().getView();
	
	/** Объект класса {@linkplain Menu};
	* макрокоманда (шаблон Command)
	*/
	private Menu menu = new Menu();
	
	/** Обработка команд пользователя */
	public void run() {
		menu.add(new ViewConsoleCommand(view));
		menu.add(new GenerateConsoleCommand(view));
		menu.add(new ChangeConsoleCommand(view));
		menu.add(new ExecuteConsoleCommand(view));
		menu.execute();
	}
	
	/** Выполняется при запуске программы
	* @param args параметры запуска программы
	*/
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
}
