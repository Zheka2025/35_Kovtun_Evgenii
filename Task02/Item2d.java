package Task02;
import java.util.Random;
import java.io.Serializable;

/**
 * Клас Item2d представляє приміщення з трьома сторонами - довжина, ширина та висота,
 * що задаються в двійковому форматі.
 * Реалізує інтерфейс Serializable для можливості серіалізації об'єкту.
 */
public class Item2d implements Serializable {
    private int length;
    private int width;
    private int height;
    private static final long serialVersionUID = 1L;

    /**
     * Створює об'єкт Item2d з довжиною, шириною та висотою, що рівні 0.
     */
    public Item2d() {
         Random random = new Random();
         this.length = random.nextInt(100); // случайное число от 0 до 99
        this.width = random.nextInt(100);
        this.height = random.nextInt(100);
    }

    /**
     * Створює об'єкт Item2d з заданими значеннями довжини, ширини та висоти.
     *
     * @param length довжина приміщення
     * @param width ширина приміщення
     * @param height висота приміщення
     */
    public Item2d(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * Встановлює нове значення довжини приміщення.
     *
     * @param length нове значення довжини
     * @return оновлене значення довжини приміщення
     */
    public int setLength(int length) {
        this.length = length;
        return this.length;
    }

    /**
     * Повертає довжину приміщення.
     *
     * @return довжина приміщення
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Встановлює нове значення ширини приміщення.
     *
     * @param width нове значення ширини
     * @return оновлене значення ширини приміщення
     */
    public int setWidth(int width) {
        this.width = width;
        return this.width;
    }

    /**
     * Повертає ширину приміщення.
     *
     * @return ширина приміщення
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Встановлює нове значення висоти приміщення.
     *
     * @param height нове значення висоти
     *
     * @return оновлене значення висоти приміщення
*/
public int setHeight(int height) {
this.height = height;
return this.height;
}

/**

Повертає висоту приміщення.
@return висота приміщення
*/
public int getHeight() {
return this.height;
}
/**

Повертає об'єм приміщення.
@return об'єм приміщення
*/
public int getVolume() {
return this.length * this.width * this.height;
}
public int getArea(){
    return this.length*this.width;
}
public int getPerimeter() {
    return 2 * (this.length + this.width);
}
/**

Перевизначення методу toString() для виведення інформації про приміщення у зрозумілому форматі.
@return рядок із виведеною інформацією про приміщення
*/
@Override
public String toString() {
return "Item2d{" +
            "length=" + length +
            ", width=" + width +
            ", height=" + height +
            ", volume=" + getVolume() +
            ", area=" + getArea() +
            ", perimeter=" + getPerimeter() +
            '}';
}
}