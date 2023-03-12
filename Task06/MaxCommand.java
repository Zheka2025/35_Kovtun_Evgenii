/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task06;
import java.util.concurrent.TimeUnit;
import Task03.*;
import Task05.*;
import java.util.stream.*;
/**
 *
 * @author Evgenii
 */
public class MaxCommand implements Command /*, Runnable */ {
	
	/** Хранит результат обработки коллекции */
	private int result = -1;
	
	/** Флаг готовности результата */
	private int progress = 0;
	
	/** Обслуживает коллекцию объектов {@linkplain ex01.Item2d} */
	private ViewResult viewResult;
	
	/** Возвращает поле {@linkplain MaxCommand#viewResult}
	* @return значение {@linkplain MaxCommand#viewResult}
	*/
	public ViewResult getViewResult() {
		return viewResult;
	}
	
	/** Устанавливает поле {@linkplain MaxCommand#viewResult}
	* @param viewResult значение для {@linkplain MaxCommand#viewResult}
	* @return новое значение {@linkplain MaxCommand#viewResult}
	*/
	public ViewResult setViewResult(ViewResult viewResult) {
		return this.viewResult = viewResult;
	}
	
	/** Инициализирует поле {@linkplain MaxCommand#viewResult}
	* @param viewResult объект класса {@linkplain ViewResult}
	*/
	public MaxCommand(ViewResult viewResult) {
		this.viewResult = viewResult;
	}
	
	/** Возвращает результат
	* @return поле {@linkplain MaxCommand#result}
	*/

	public int getResult() {
		return result;
	}
	
	/** Проверяет готовность результата
	* @return false - если результат найден, иначе - true
	* @see MaxCommand#result
	*/
	public boolean running() {
		return progress < 100;
	}
	
	/** Используется обработчиком потока {@linkplain CommandQueue};
	* шаблон Worker Thread
	*/
	@Override
	public void execute() {
		progress = 0;
		System.out.println("Max executed...");
		int size = viewResult.getItems().size();
		result = 0;
		for (int idx = 1; idx < size; idx++) {
			if (IntStream.of(viewResult.getItems().get(result).getWidth()).sum() <
					IntStream.of(viewResult.getItems().get(idx).getWidth()).sum()) {
				result = idx;
			}
			progress = idx * 100 / size;
			if (idx % (size / 3) == 0) {
				System.out.println("Max " + progress + "%");
			}
			try {
				TimeUnit.MILLISECONDS.sleep(3000 / size);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
		System.out.println("Max done. Item #" + result +
				" found: " + viewResult.getItems().get(result));
		progress = 100;
		}
		
	/**
	@Override
	public void run() {
		execute();
	}
	/**/
}
