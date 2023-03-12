/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task06;
import Task05.Command;
/**
 *
 * @author Evgenii
 */
public interface Queue {
	/** Добавляет новую задачу в очередь;
	 * шаблон Worker Thread
	 * @param cmd задача
	 */
	void put(Command cmd);
	/** Удаляет задачу из очереди;
	 * шаблон Worker Thread
	 * @return удаляемая задача
	 */
	Command take();
}
