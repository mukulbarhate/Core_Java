// public class main implements Runnable
// {
// 	synchronized public void run()
// 	{
// 		for(int i=0;i<5;i++)
// 		{	
// 			System.out.println("Hello"+i);
// 		}
// 	}
// 	public static void main(String args[])
// 	{
// 		main ob=new main();
// 		Thread t1=new Thread(ob);
// 		Thread t2=new Thread(ob);
// 		t1.start();
// 		t2.start();
// 	}
// }








public class kreads implements Runnable
{
	 synchronized public void run()
	{
		if ( Thread.currentThread().getName().equalsIgnoreCase("hread1"))
		for (int i = 1 ; i< 51 ; i++)
		{
			System.out.println(i);
		}
		else
		for (int j = 50 ; j > 0;j--)
		System.out.println(j);
	}
	public static void main (String[] abc)
	{
		kreads k = new kreads();
		Thread t1 = new Thread(k);
		t1.setName("hread1");
		Thread t2 = new Thread(k);
		t2.setName("hread2");
		t1.start();
		t2.start();


	}
}




