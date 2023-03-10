package Task03;


import java.io.IOException;
/** Product
* (шаблон проектування
* Factory Method)<br>
* Інтерфейс "фабрикуемых"
* объектов<br>
* Обявляє методи
* відображення обєктів
*/
public interface View {
    /** Отображает заголовок */
    public void viewHeader();
    /** Отображает основную часть */
    public void viewBody();
    /** Отображает окончание */
    public void viewFooter();
    /** Отображает объект целиком */
    public void viewShow();
    /** Выполняет инициализацию */
    public void viewInit();
    /** Сохраняет данные для последующего восстановления */
    public void viewSave() throws IOException;
    /** Восстанавливает ранее сохранённые данные */
    public void viewRestore() throws Exception;
}
