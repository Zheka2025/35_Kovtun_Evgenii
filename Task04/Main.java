
package Task04;
import Task03.View;


public class Main extends Task03.Main
{
	
	public Main(View view) 	
	{
		super(view);

	}
	
	public static void main(String[] args) 
	{
		Main main = new Main(new ViewableTable().getView());
		main.menu();
	}
}
