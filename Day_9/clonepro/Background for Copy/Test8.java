// package core1;

import java.util.Arrays;

class Center  // Immutable class
{
	private String name,address;
	private int prnnos[];
	//private int prnnos[]= {100,200,300,400,500};
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @return the prnnos
	 */
	public int[] getPrnnos() {
		return prnnos;
	}
	/**
	 * @param name
	 * @param address
	 * @param prnnos
	 */
	public Center(String name, String address, int[] prnnos) {
		super();
		this.name = name;
		this.address = address;
		this.prnnos = prnnos;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Center [name=" + name + ", address=" + address + ", prnnos=" + Arrays.toString(prnnos) + "]";
	}
	
}
public class Test8
{
	public static void main(String args[])
	{
		Center c1=new Center("Vita","mumbai",new int[]{100,200,300,400,500});
		System.out.println(c1);

		// c1.setName    --- not possible
		// c1.setAddress  --- not possible
		// c1.setPrnnos   --- not possible

		int temp[]=c1.getPrnnos();
		System.out.println("let's display all prnnos");
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
		temp[1]=0;  // violation of Immutability
		System.out.println(c1);
	}
}




















// // package core1;

// import java.util.Arrays;

// class Center  // Immutable class
// {
// 	private String name,address;
// 	private int prnnos[];
// 	//private int prnnos[]= {100,200,300,400,500};
// 	/**
// 	 * @return the name
// 	 */
// 	public String getName() {
// 		return name;
// 	}
// 	/**
// 	 * @return the address
// 	 */
// 	public String getAddress() {
// 		return address;
// 	}
// 	/**
// 	 * @return the prnnos
// 	 */
// 	// let's return copy of prnno array
// 	public int[] getPrnnos() {
// 		//int prncopy[]= {100,200,300,400,500};
// 		int[] prncopy=prnnos.clone();
// 		return prncopy;
// 	}
// 	/**
// 	 * @param name
// 	 * @param address
// 	 * @param prnnos
// 	 */
// 	public Center(String name, String address, int[] prnnos) {
// 		super();
// 		this.name = name;
// 		this.address = address;
// 		this.prnnos = prnnos;
// 	}
// 	/* (non-Javadoc)
// 	 * @see java.lang.Object#toString()
// 	 */
// 	@Override
// 	public String toString() {
// 		return "Center [name=" + name + ", address=" + address + ", prnnos=" + Arrays.toString(prnnos) + "]";
// 	}
	
// }
// public class Test8
// {
// 	public static void main(String args[])
// 	{
// 		Center c1=new Center("Vita","mumbai",new int[]{100,200,300,400,500});
// 		System.out.println(c1);
		

// 		// c1.setName    --- not possible
// 		// c1.setAddress  --- not possible
// 		// c1.setPrnnos   --- not possible

// 		int temp[]=c1.getPrnnos();
// 		System.out.println("let's display all prnnos");
// 		for(int i=0;i<temp.length;i++)
// 		{
// 			System.out.println(temp[i]);
// 		}
// 		temp[1]=0;  // No problem as we are modifying copy
// 		System.out.println(c1);
// 	}
// }



















// // package core1;

// import java.util.Arrays;

// class Center  // Immutable class
// {
// 	private String name,address;
// 	private int prnnos[];
// 	//private int prnnos[]= {100,200,300,400,500};
// 	/**
// 	 * @return the name
// 	 */
// 	public String getName() {
// 		return name;
// 	}
// 	/**
// 	 * @return the address
// 	 */
// 	public String getAddress() {
// 		return address;
// 	}
// 	/**
// 	 * @return the prnnos
// 	 */
// 	// let's return copy of prnno array
// 	public int[] getPrnnos() {
// 		int prncopy[]= {100,200,300,400,500};
// 		return prncopy;
// 	}
// 	/**
// 	 * @param name
// 	 * @param address
// 	 * @param prnnos
// 	 */
// 	public Center(String name, String address, int[] prnnos) {
// 		super();
// 		this.name = name;
// 		this.address = address;
// 		this.prnnos = prnnos;
// 	}
// 	/* (non-Javadoc)
// 	 * @see java.lang.Object#toString()
// 	 */
// 	@Override
// 	public String toString() {
// 		return "Center [name=" + name + ", address=" + address + ", prnnos=" + Arrays.toString(prnnos) + "]";
// 	}
	
// }
// public class Test8
// {
// 	public static void main(String args[])
// 	{
// 		Center c1=new Center("Vita","mumbai",new int[]{100,200,300,400,500});
// 		System.out.println(c1);

// 		// c1.setName    --- not possible
// 		// c1.setAddress  --- not possible
// 		// c1.setPrnnos   --- not possible

		
// 		int temp[]=c1.getPrnnos();
// 		System.out.println("let's display all prnnos");
// 		for(int i=0;i<temp.length;i++)
// 		{
// 			System.out.println(temp[i]);
// 		}
// 		temp[1]=0;  // No problem as we are modifying copy
// 		System.out.println(c1);
// 	}
// }

