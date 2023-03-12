/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task05;
import Task03.View;
/**
 *
 * @author Evgenii
 */
public class RestoreConsoleCommand implements ConsoleCommand {
	/** Объект, реализующий интерфейс {@linkplain View};
	 * обслуживает коллекцию объектов {@linkplain ex01.Item2d}
	 */

	private View view;
	/** Инициализирует поле {@linkplain RestoreConsoleCommand#view}
	 * @param view объект, реализующий интерфейс {@linkplain View}
	 */
	public RestoreConsoleCommand(View view) {
		this.view = view;
	}
	@Override
	public char getKey() {
		return 'r';
	}
	@Override
	public String toString() {
		return "'r'estore";
	}
	@Override
	public void execute() {
		System.out.println("Restore last saved.");
		try {
			view.viewRestore();
		} catch (Exception e) {
			System.err.println("Serialization error: " + e);
		}
		view.viewShow();
	}
}
