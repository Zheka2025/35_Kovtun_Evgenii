/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task05;
import java.io.IOException;
import Task03.View;
/**
 *
 * @author Evgenii
 */
public class SaveConsoleCommand implements ConsoleCommand {
	/** Объект, реализующий интерфейс {@linkplain View};
	 * обслуживает коллекцию объектов {@linkplain ex01.Item2d}
	 */
	private View view;
	/** Инициализирует поле {@linkplain SaveConsoleCommand#view}
	 * @param view объект, реализующий интерфейс {@linkplain View}
	 */
	public SaveConsoleCommand(View view) {
		this.view = view;
	}
	@Override
	public char getKey() {
		return 's';
	}
	@Override
	public String toString() {
		return "'s'ave";
	}
	@Override
	public void execute() {
		System.out.println("Save current.");
		try {
			view.viewSave();
		} catch (IOException e) {
			System.err.println("Serialization error: " + e);
		}
		view.viewShow();
	}


}
