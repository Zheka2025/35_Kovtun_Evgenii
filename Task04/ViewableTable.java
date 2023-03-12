/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task04;

import Task03.View;
import Task03.ViewableResult;


/** ConcreteCreator
* (шаблон проектирования
* Factory Method)<br>
* Объявляет метод,
* "фабрикующий" объекты
* @version 1.0
* @see ViewableResult
* @see ViewableTable#getView()
*/
public class ViewableTable extends ViewableResult 
{
	/** Создаёт отображаемый объект {@linkplain ViewTable}
     * @return  */
	@Override
	public View getView() 
	{
		return new ViewTable();
	}
}
