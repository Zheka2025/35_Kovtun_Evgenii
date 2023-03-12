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
public class ViewConsoleCommand implements ConsoleCommand {
	/** Объект, реализующий интерфейс {@linkplain View};
	 * обслуживает коллекцию объектов {@linkplain ex01.Item2d}
	 */
	private View view;
	/** Инициализирует поле {@linkplain SaveConsoleCommand#view}
	 * @param view объект, реализующий интерфейс {@linkplain View}
	 */
	public ViewConsoleCommand(View view) {
		this.view = view;
	}
	@Override
	public char getKey() {
		return 'v';
	}
	@Override
	public String toString() {
		return "'v'iew";
	}
	@Override
	public void execute() {
		System.out.println("View current.");
		view.viewShow();
	}
}
