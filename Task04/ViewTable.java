/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task04;

import java.util.Formatter;
import Task02.Item2d;
import Task03.ViewResult;

/** ConcreteProduct
* (шаблон проектирования
* Factory Method)<br>
* Вывод в виде таблицы

*/

public class ViewTable extends ViewResult 
{
	/** Определяет ширину таблицы по умолчанию */
	private static final int DEFAULT_WIDTH = 88;
	
	/** Текущая ширина таблицы */
	private int width;
	
	/** Устанавливает {@linkplain ViewTable#width width}
	* значением {@linkplain ViewTable#DEFAULT_WIDTH DEFAULT_WIDTH}<br>
	* Вызывается конструктор суперкласса {@linkplain ViewResult#ViewResult() ViewResult()}
	*/
	public ViewTable() 
	{
		width = DEFAULT_WIDTH;
	}
	
	/** Устанавливает {@linkplain ViewTable#width} значением <b>width</b><br>
	* Вызывается конструктор суперкласса {@linkplain ViewResult#ViewResult() ViewResult()}
	* @param width определяет ширину таблицы
	*/
	public ViewTable(int width) 
	{
		this.width = width;
	}
	
	/** Устанавливает {@linkplain ViewTable#width} значением <b>width</b><br>
	* Вызывается конструктор суперкласса {@linkplain ViewResult#ViewResult(int n) ViewResult(int n)}
	* @param width определяет ширину таблицы
	* @param n количество элементов коллекции; передаётся суперконструктору
	*/
	public ViewTable(int width, int n) 
	{
		super(n);
		this.width = width;
	}
	
	/** Устанавливает поле {@linkplain ViewTable#width} значением <b>width</b>
	* @param width новая ширина таблицы
	* @return заданная параметром <b>width</b> ширина таблицы
	*/
	public int setWidth(int width) 
	{
		return this.width = width;
	}
	
	/** Возвращает значение поля {@linkplain ViewTable#width}
	* @return текущая ширина таблицы
	*/
	public int getWidth() 
	{
		return width;
	}
	
	/** Выводит вертикальный разделитель шириной {@linkplain ViewTable#width} символов */
	private void outLine() 
	{
		for(int i = width; i > 0; i--) 
		{
			System.out.print('-');
		}
	}
	
	/** Вызывает {@linkplain ViewTable#outLine()}; завершает вывод разделителем строки */
	private void outLineLn() 
	{
		outLine();
		System.out.println();
	}
	
	/** Выводит заголовок таблицы шириной {@linkplain ViewTable#width} символов */
	private void outHeader() 
	{
		
		Formatter fmt = new Formatter();
System.out.format("%8s | %8s | %8s | %8s | %8s | %8s%n",
        "Lenth", "Width", "Height", "Volume", "Area", "Perimeter");
System.out.println(fmt);
	}
	
	/** Выводит тело таблицы шириной {@linkplain ViewTable#width} символов */
	private void outBody() 
	{
		
	 Formatter fmt = new Formatter();
System.out.println(fmt);
for(Item2d item : getItems()) {
    System.out.printf("%-8d | %-8d | %-8d | %-8d | %-8d | %-8d\n",
            item.getLength(), item.getWidth(), item.getHeight(),
            item.getVolume(), item.getArea(), item.getPerimeter());
}
	}
	
	/** Перегрузка (совмещение, overloading) метода суперкласса;
	* устанавливает поле {@linkplain ViewTable#width} значением <b>width</b><br>
	* Вызывает метод {@linkplain ViewResult#viewInit() viewInit()}
	* @param width новая ширина таблицы
	*/
	public final void setWidth1(int width) 
	{ // method overloading
		this.width = width;
		viewInit();
	}
	

	public final void init(int width, double x) 
{ // метод перегрузки
    this.width = width;
    init(x);
}
public void init(double x) 
{ // метод переопределения
    System.out.print("Initialization... ");
    super.init(width);
    System.out.println("done.");
}
	
	/** Вывод элемента таблицы<br>{@inheritDoc} */
	@Override
	public void viewHeader() 
	{
		outHeader();
		outLineLn();
	}
	
	/** Вывод элемента таблицы<br>{@inheritDoc} */
	@Override
	public void viewBody() 
	{
		outBody();
	}
	
	/** Вывод элемента таблицы<br>{@inheritDoc} */
	@Override
	public void viewFooter() {
		outLineLn();
	}
}
