/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task03;

/** Creator
* (шаблон проектирования
* Factory Method)<br>
* Объявляет метод,
* "фабрикующий" объекты
* @see Viewable#getView()
*/

public interface Viewable {
/** Создаёт объект, реализующий {@linkplain View}
     * @return  */
public View getView();
}