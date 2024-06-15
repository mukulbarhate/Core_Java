class MyNumber
{
	private int num;   // instance member or member variable

	// setter and getter

	public void setNum(int k)  // member function
	{
		num=k;
	}
	public int getNum()   // member function
	{
		return num;
	}
}
public class Demo2
{
	public static void main(String args[])
	{
		MyNumber m1=new MyNumber();   // instance or object creation
		m1.setNum(150); 
		System.out.println(m1.getNum());
		MyNumber m2=new MyNumber();
		m2.setNum(200);
		System.out.println(m2.getNum());
	}
}