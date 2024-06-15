
enum MyFont
{
	PLAIN,BOLD,ITALIC
}


class MyComponent
{
	public 	void setStyle(MyFont font)
	{
		switch(font)
		{
			case PLAIN: System.out.println("plain");
					break;
			case BOLD: System.out.println("bold");
					break;
			case ITALIC: System.out.println("italic");
					break;
		}			
	}
}
public class Demo1
{
	public static void main(String args[])
	{
		MyComponent mc=new MyComponent();
		mc.setStyle(MyFont.BOLD);
		mc.setStyle(MyFont.ITALIC);
		mc.setStyle(MyFont.PLAIN);
		// mc.setStyle(1); // will not compile hence there is no
		// risk of unpredictable result
	
	}
}
