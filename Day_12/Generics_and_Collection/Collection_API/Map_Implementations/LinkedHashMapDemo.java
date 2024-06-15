/*The LinkedHashMap Class is just like HashMap with an 
 * additional feature of maintaining an order of elements 
 * inserted into it. HashMap provided the advantage of 
 * quick insertion, search, and deletion but it never 
 * maintained the track and order of insertion, 
 * which the LinkedHashMap provides where the elements 
 * can be accessed in their insertion order. */

//package datatypes_pro;


// when u call get, the sequence is "hashCode()","==" 
// if == returns false , it checks "equals"
import java.util.*;
class Employee
{
	private String empid;
	private int deptcode;
	private int citycode;

	public Employee(String empid,int deptcode,int citycode)
	{
		this.empid=empid;
		this.deptcode=deptcode;
		this.citycode=citycode;
	}
	@Override
	public int hashCode()
	{
		System.out.println("in hashcode");
		return deptcode;
	}
	@Override
	public boolean equals(Object ref)
	{
		boolean flag=citycode==((Employee)ref).citycode;
		System.out.println("in equals\t"+flag);
		return flag;
	}
	@Override
	public String toString()
	{
		
		return empid+"\t"+deptcode+"\t"+citycode;
	}
}
public class HashMapDemo1
{
	public static void main(String args[])
	{
		Employee e1=new Employee("e001",1,10);
		Employee e2=new Employee("e002",1,12);
		Employee e3=new Employee("e003",2,10);
		Employee e4=new Employee("e004",1,13);

		Map<Employee,String> map=new LinkedHashMap<Employee,String>();
		map.put(e4,"fourth");
		map.put(e1,"first");
		map.put(e2,"second");
		map.put(e3,"third");
		//map.put(e4,"fourth");
		System.out.println(map);

		String val=map.get(e2); 
		System.out.println(val);
	}
}