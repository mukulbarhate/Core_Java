// BST is formed when a certain threshold value is exceeded
// BST will not be formed if the key i.e. Employee is not Comparable
// We can check whether BST is formed or not by commenting or enabling "implements Comparable" statement.

import java.util.*;
class Employee implements Comparable<Employee>
{
	private String empid;
	private int deptcode;
	private int citycode;

	public Employee(String empid,int deptcode,int 

citycode)
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
		boolean flag=citycode==((Employee)

ref).citycode;
		System.out.println("in equals\t"+flag);
		return flag;
	}
	@Override
	public String toString()
	{
		
		return empid+"\t"+deptcode+"\t"+citycode;
	}
	
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		System.out.println("inside compareTo method");
		if(citycode>o.citycode)
		{
			return 1;
		}
		else if(citycode<o.citycode)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}
public class CollDemo
{
	public static void main(String args[])
	{
		Employee e1=new Employee("e001",1,10);
		Employee e2=new Employee("e002",1,12);
		Employee e3=new Employee("e003",2,10);
		Employee e4=new Employee("e004",1,13);
		Employee e5=new Employee("e005",1,14);
		Employee e6=new Employee("e006",1,15);
		Employee e7=new Employee("e007",1,16);
		Employee e8=new Employee("e008",1,17);
		Employee e9=new Employee("e009",1,18);
		Employee e10=new Employee("e010",1,19);
		Employee e11=new Employee("e011",1,20);
		Employee e12=new Employee("e012",1,22);
		Employee e13=new Employee("e013",1,21);
		Map<Employee,String> map=new HashMap<Employee,String>();
		map.put(e1,"first");
		map.put(e2,"second");
		map.put(e3,"third");
		map.put(e4,"fourth");
		map.put(e5,"fifth");
		map.put(e6,"sixth");
		map.put(e7,"seventh");
		map.put(e8,"eighth");
		map.put(e9,"ninth");
		map.put(e10,"tenth");
		map.put(e11,"eleventh");
		map.put(e12,"twelth");  //here it will go for binary tree
		map.put(e13,"thirteenth");  
		System.out.println(map);

	//String val=map.get(e5);  
String val=map.get(e12);  
		System.out.println(val);
	}
}


