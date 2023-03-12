/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task06;
import java.util.concurrent.TimeUnit;
import Task03.*;
import Task05.*;

/**
 *
 * @author Evgenii
 */
public class ExecuteConsoleCommand implements ConsoleCommand {
	/** Объект, реализующий интерфейс {@linkplain View};
	* обслуживает коллекцию объектов {@linkplain ex01.Item2d}
	*/
	private View view;

	/** Возвращает поле {@linkplain ExecuteConsoleCommand#view}
	* @return значение {@linkplain ExecuteConsoleCommand#view}
	*/
	public View getView() {
		return view;
	}

	/** Устанавливает поле {@linkplain ExecuteConsoleCommand#view}
	* @param view значение для {@linkplain ExecuteConsoleCommand#view}
	* @return новое значение {@linkplain ExecuteConsoleCommand#view}
	*/
	public View setView(View view) {
		return this.view = view;
	}

	/** Инициализирует поле {@linkplain ExecuteConsoleCommand#view}
	* @param view объект, реализующий {@linkplain View}
	*/
	public ExecuteConsoleCommand(View view) {
		this.view = view;
	}

	@Override
	public char getKey() {
		return 'e';
	}

	@Override
	public String toString() {
		return "'e'xecute";
	}

	@Override
	public void execute() {
		/**/
		CommandQueue queue1 = new CommandQueue();
		CommandQueue queue2 = new CommandQueue();
		/**
		ExecutorService exec1 = Executors.newSingleThreadExecutor();
		ExecutorService exec2 = Executors.newSingleThreadExecutor();
		/**/
		MaxCommand maxCommand = new MaxCommand((ViewResult)view);
		AvgCommand avgCommand = new AvgCommand((ViewResult)view);
		MinMaxCommand minMaxCommand = new MinMaxCommand((ViewResult)view);
		System.out.println("Execute all threads...");
		/**
		exec1.execute(minMaxCommand);
		exec2.execute(maxCommand);
		exec2.execute(avgCommand);
		/**/
		queue1.put(minMaxCommand);
		queue2.put(maxCommand);
		queue2.put(avgCommand);
		/**/
		try {
			while (avgCommand.running() ||
					maxCommand.running() ||
					minMaxCommand.running()) {
				TimeUnit.MILLISECONDS.sleep(100);
			}
			/**
			exec1.shutdown();
			exec2.shutdown();
			/**/
			queue1.shutdown();
			queue2.shutdown();
			/**/
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			System.err.println(e);
		}
		System.out.println("All done.");
	}
}
