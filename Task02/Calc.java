package Task02;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author Evgenii
 */
public class Calc {
	/** Ім'я файлу, яке використовується при серіалізації.. */
	private static final String FNAME = "Item2d.bin";
	/** Зберігає результат обчислень. Об'єкт класу {@linkplain Item2d} */
	private Item2d result;
	/** Ініціалізує {@linkplain Calc#result} */
	public Calc() {
		result = new Item2d();
	}
	/** Встановлює значення {@linkplain Calc#result}
        *@param result - нове значення посилання на об'єкт {@linkplain Item2d}
	*/
	public void setResult(Item2d result) {
		this.result = result;
	}
	/** Отримує значення {@linkplain Calc#result}
	 * @return поточне значення посилання на об'єкт {@linkplain Item2d}
	 */
	public Item2d getResult() {
		return result;
	}
	/** Обчислює значення функції.
        * @param x - аргумент обчислюваної функції.
        * @return результат обчислення функції.
	*/
	public int calc(int x) throws IllegalArgumentException {
    if (x < 0) {
        throw new IllegalArgumentException("x must be non-negative");
    }
    return 2 * x;
}
	/** Обчислює значення функції та зберігає
        * результат у об'єкті {@linkplain Calc#result}
        * @param x - аргумент обчислюваної функції.
        * @throws IllegalArgumentException якщо аргумент від'ємний
	*/
	public Item2d init(int x) throws IllegalArgumentException {
    int y = calc(x);
    Item2d result = new Item2d(x, y, y);
    return result;

}
	/** Виводить результат обчислень. */
	public void show() {
		System.out.println(result);
	}
	/** Зберігає {@linkplain Calc#result} у файлі {@linkplain Calc#FNAME}
        * @throws IOException якщо не вдається зберегти у файл
	*/
	public void save() throws IOException {
		try (ObjectOutputStream os = new ObjectOutputStream(new
				FileOutputStream(FNAME))) {
			os.writeObject(result);
			os.flush();
		}
	}
	/** Восстанавливает {@linkplain Calc#result} з файлу {@linkplain Calc#FNAME}
* @throws IOException якщо не вдається зчитати з файлу
* @throws ClassNotFoundException якщо клас не знайдено при десеріалізації
*/
public void load() throws IOException, ClassNotFoundException {
try (ObjectInputStream is = new ObjectInputStream(new
FileInputStream(FNAME))) {
result = (Item2d) is.readObject();
}
}
}