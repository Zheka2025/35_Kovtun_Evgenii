package Task05;

import Task02.*;

/** Команда
* Change item;
* шаблон Command

* @version 1.0
*/
public class ChangeItemCommand implements Command {
	/** Обрабатываемый объект; шаблон Command */
	private Item2d item;
	
	/** Параметр команды; шаблон Command */
	private int offset;
	
	/** Устанавливаент поле {@linkplain ChangeItemCommand#item}
	* @param item значение для {@linkplain ChangeItemCommand#item}
	* @return новое значение {@linkplain ChangeItemCommand#item}
	*/
	public Item2d setItem(Item2d item) {
		return this.item = item;
	}
	
	/** Возвращает поле {@linkplain ChangeItemCommand#item}
	* @return значение {@linkplain ChangeItemCommand#item}
	*/
	public Item2d getItem() {
		return item;
	}
	
	/** Устанавливаент поле {@linkplain ChangeItemCommand#offset}
	* @param offset значение для {@linkplain ChangeItemCommand#offset}
	* @return новое значение {@linkplain ChangeItemCommand#offset}
	*/
	public int setOffset(int offset) {
		return this.offset = offset;
	}
	
	/** Возвращает поле {@linkplain ChangeItemCommand#offset}
	* @return значение {@linkplain ChangeItemCommand#offset}
	*/
	public int getOffset() {
		return offset;
	}
	
	@Override
	public void execute() {
		item.setHeight(item.getWidth()* offset);
	}
}