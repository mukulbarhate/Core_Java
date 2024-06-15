import java.util.*;
public class main 
{
	 void disp(List mylist)
	{
		Iterator it=mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String args[])
	{
		List<Integer>m=new ArrayList<Integer>();
		m.add(20);
		m.add(40);
		main t=new main();
		t.disp(m);


	}
}