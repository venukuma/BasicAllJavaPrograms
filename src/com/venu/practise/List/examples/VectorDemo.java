package com.venu.practise.List.examples;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
/*
* LinkedList-->
* 1) Underlying DS : GrowableArry/Resizable Array/DynamicArray
* 2) Insertion order is preserved.
* 3) Null is allowed.
* 4) Heterogeneous  elements are allowed.
* 5) Duplicates are allowed.
* 6) It implements RandaomAccess interface, hence retrieval is fast in Vector.
* 7) It is a legacy Class
* 8) Synchronized.
* 9) It is A thread safe
* 10) It implements Serialization and cloanable and RandomAccess (Only Vector and ArrayList implements RandomAccess Interface)
* 11) initial capacity is 10 and increases the capacity double once its fulled.
* 12) We can declare initial capacity and increase capacity using constructors 
* 13) If trying to modify while iterating the list we will get ConcurrentModificationException
* 
*/
public class VectorDemo {

	public static void main(String[] args) {
		
		List<String> li = new Vector<>();
		li.add("A");
		li.add("B");
		li.add("C");
		li.add("D");
		li.add("A");
		li.add(null);
		System.out.println(li);
		System.out.println(li.get(3));
		li.set(4, "B");
		System.out.println(li);
		System.out.println("Elements in vector one by one");
		Iterator<String> itr = li.iterator(); //Best to use Enumaration
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//li.add("J");
		}

	}

}
