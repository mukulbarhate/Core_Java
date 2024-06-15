// Unchecked exception

// public class jdb1 
// {
// 	void disp3()
// 	{
// 		int num=0;
// 		if(num>10)
// 		{
// 			throw new RuntimeException();
// 		}
		
// 	}
// 	void disp2()
// 	{
// 		disp3();
// 	}
// 	void disp1()
// 	{
// 		disp2();
// 	}
// 	public static void main(String args[])
// 	{
// 		jdb1 j=new jdb1();
// 		j.disp1();
// 	}
// }		














// import java.io.IOException;

// public class jdb1 
// {
// 	void disp3()throws IOException
// 	{
// 		int num=20;
// 		if(num>10)
// 		{
// 			throw new IOException();
// 		}
// 	}
// 	void disp2()throws IOException
// 	{
// 		disp3();
// 	}
// 	void disp1()throws IOException
// 	{
// 		disp2();
// 	}
// 	// public static void main(String args[])throws IOException // bad idea
// 	public static void main(String args[])
// 	{
// 		try {
// 			jdb1 j=new jdb1();
// 			j.disp1();
// 		} catch (IOException e) {
// 			System.out.println(e);
// 		}
// 	}
// }						


















// import java.io.IOException;

// public class jdb1 
// {
// 	void disp3()throws IOException
// 	{
// 		int num=20;
// 		if(num>10)
// 		{
// 			throw new IOException();
// 		}
// 	}
// 	void disp2()throws IOException
// 	{
// 		disp3();
// 	}
// 	void disp1()throws IOException
// 	{
// 		disp2();
// 	}
// 	public static void main(String args[])
// 	{
// 		jdb1 j=new jdb1();
// 		j.disp1(); // compilation error : add throws or try_catch
// 	}
// }						























// import java.io.IOException;

// public class jdb1 
// {
// 	void disp3()throws IOException
// 	{
// 		int num=20;
// 		if(num>10)
// 		{
// 			throw new IOException();
// 		}
// 	}
// 	void disp2()throws IOException
// 	{
// 		disp3();
// 	}
// 	void disp1()
// 	{
// 		disp2(); // compilation error: add throws or try_catch
// 	}
// 	public static void main(String args[])
// 	{
// 		jdb1 j=new jdb1();
// 		j.disp1();
// 	}
// }						


























// import java.io.IOException;

// public class jdb1 
// {
// 	void disp3()throws IOException
// 	{
// 		int num=20;
// 		if(num>10)
// 		{
// 			throw new IOException();
// 		}
// 	}
// 	void disp2()
// 	{
// 		disp3(); // compilation error: add throws or try_catch
// 	}
// 	void disp1()
// 	{
// 		disp2();
// 	}
// 	public static void main(String args[])
// 	{
// 		jdb1 j=new jdb1();
// 		j.disp1();
// 	}
// }						























// import java.io.IOException;

// public class jdb1 
// {
// 	void disp3()
// 	{
// 		int num=20;
// 		if(num>10)
// 		{
// 			throw new IOException(); // compilation error : add throws or try_catch
// 		}
// 	}
// 	void disp2()
// 	{
// 		disp3();
// 	}
// 	void disp1()
// 	{
// 		disp2();
// 	}
// 	public static void main(String args[])
// 	{
// 		jdb1 j=new jdb1();
// 		j.disp1();
// 	}
// }						

