/* it's possible to modify the data in case of 
 ListIterator */

//package core1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Demo4 {

	public static void main(String[] args) {
		List<Integer> mylist=new ArrayList<>();
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(40);
		System.out.println("Using Iterator");
		Iterator<Integer> itr=mylist.iterator();
		while(itr.hasNext())
		{
			int k=itr.next();
			if(k==30)
			{
				itr.remove(); // using Iterator we can remove an element from the list
			}
			System.out.println(k);
		}
		System.out.println("Using ListIterator from the beginning");
		ListIterator<Integer> ltr=mylist.listIterator();
		 
		
		while(ltr.hasNext())
		{
			int k=ltr.next();
			if(k==20)
			{
				ltr.remove(); // using ListIterator we can remove an element from the list
			}
			System.out.println(k); 
		}
		
		System.out.println("*********************");
		System.out.println("mylist is\t"+mylist);
	}

}
