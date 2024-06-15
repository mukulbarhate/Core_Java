// it's possible to have bidirectional traversal in case of 
// ListIterator
/*
using ListIterator we can add an element inside the list.
*/

//package core1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Demo2 {

	public static void main(String[] args) {
		List<Integer> mylist=new ArrayList<>();
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(40);
		
		System.out.println("Using ListIterator from the beginning");
		ListIterator ltr=mylist.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}

// ltr.add() will add where ltr points to i.e. at the end
		ltr.add(400); // using ListIterator we can add inside list
		
				
		System.out.println("Using ListIterator from the end");
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		System.out.println("*********************");
		System.out.println("mylist is\t"+mylist);
	}

}
