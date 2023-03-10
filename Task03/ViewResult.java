/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task03;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import Task02.Item2d;
/**
 *
 * @author Evgenii
 */
public class ViewResult implements View
 {
/** Имя файла, используемое при сериализации */
	private static final String FNAME = "items.bin";
	
	/** Определяет количество значений для вычисления по умолчанию */
	private static final int DEFAULT_NUM = 10;
	
	/** Коллекция аргументов и результатов вычислений */
	private ArrayList<Item2d> items = new ArrayList<Item2d>();
	
	/** Вызывает {@linkplain ViewResult#ViewResult(int n) ViewResult(int n)}
	* с параметром {@linkplain ViewResult#DEFAULT_NUM DEFAULT_NUM}
	*/
	public ViewResult() 
	{
		this(DEFAULT_NUM);
	}
	
	/** Инициализирует коллекцию {@linkplain ViewResult#items}
	* @param n начальное количество элементов
	*/
	public ViewResult(int n) 
	{
		for(int ctr = 0; ctr < n; ctr++) 
		{
			items.add(new Item2d());
		}
	}
	
	/** Инициализирует коллекцию {@linkplain ViewResult#items}
	* @param n начальное количество элементов
	*/
	public ArrayList<Item2d> getItems() 
	{
		return items;
	}
        public int calc(int x) throws IllegalArgumentException {
    if (x < 0) {
        throw new IllegalArgumentException("x must be non-negative");
    }
    return 2 * x;}
        public Item2d init(int x) throws IllegalArgumentException {
    int y = calc(x);
    Item2d result = new Item2d(x, y, y);
    return result;
        }
        /** Вызывает <b>init(double stepX)</b> со случайным значением аргумента<br>
	* {@inheritDoc}
	*/
	@Override
	public void viewInit() 
	{
		Random random = new Random();
		init(random.ints(0, 360).findFirst().getAsInt());
	}
        /** Реализация метода {@linkplain View#viewSave()}<br>
	* {@inheritDoc}
	*/
	@Override
	public void viewSave() throws IOException 
	{
		try (ObjectOutputStream os = new ObjectOutputStream(new
				FileOutputStream(FNAME))) {
			os.writeObject(items);
			os.flush();
            }
        }
        /** Реализация метода {@linkplain View#viewRestore()}<br>
	* {@inheritDoc}
	*/
	@SuppressWarnings("unchecked")
	@Override
	public void viewRestore() throws Exception 
	{
		ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
		items = (ArrayList<Item2d>) is.readObject();
		is.close();
               
	}
        /** Реализация метода {@linkplain View#viewHeader()}<br>
	* {@inheritDoc}
	*/
	@Override
	public void viewHeader() 
	{
		System.out.println("Results:");
	}
         /** Реализация метода {@linkplain View#viewBody()}<br>
     * {@inheritDoc}
     */
    @Override
    public void viewBody() {
        for(Item2d item : items) {
            System.out.printf(
                    "Lenth=%d;"
                    + " Width=%d;"
                    + " Height=%d;"
                    + " Volume=%d;"
                    + " Area=%d;"
                            + "Perimetr=%d\n", item.getLength(),item.getWidth(),item.getHeight(),item.getVolume(), item.getArea(), item.getPerimeter());
        }
        System.out.println();
    }
    /** Реализация метода {@linkplain View#viewFooter()}<br>
	* {@inheritDoc}
	*/
	@Override
	public void viewFooter() 
	{
		System.out.println("End.");
	}
        /** Реализация метода {@linkplain View#viewShow()}<br>
	* {@inheritDoc}
	*/
	@Override
	public void viewShow() 
	{
		viewHeader();
		viewBody();
		viewFooter();
	}

       

}