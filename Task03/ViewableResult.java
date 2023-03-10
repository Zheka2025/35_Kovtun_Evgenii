/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task03;
import java.io.IOException;
/** ConcreteCreator
 * (шаблон проектирования
 * Factory Method)<br>
 * Объявляет метод,
 * "фабрикующий" объекты
 * @see Viewable
 * @see ViewableResult#getView()
 */
public class ViewableResult implements Viewable {
    /** Создаёт отображаемый объект {@linkplain ViewResult} */
    @Override
    public View getView() {
        return new ViewResult();
    }
}