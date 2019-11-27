package com.venu.practise.List.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ArrayList-->
 * 1) Underlying DS : GrowableArry/Resizable Array/DynamicArray
 * 2) Insertion order is preserved.
 * 3) Null is allowed.
 * 4) Heterogeneous  elements are allowed.
 * 5) Duplicates are allowed.
 * 6) It implements RandaomAccess interface, hence retrieval is fast in ArrayList.
 * 7) Manipulation is not good in array list bcz of shifting operations.
 * 8) Initial capacity is 10 there after (3/2)*old capacity +1 = new Capacity
 * 9) We can decalre our own capacity using constructor
 * 10) Non-Synchronized.
 * 11) Collections.synchronizedList(List obj); --> Converts synchronized list
 * 12) Not a thread safe
 * 13) It is fail-fast
 * 14) It implements Serialization,cloanable and RandomAccess
 * 15) If trying to modify while iterating the list we will get ConcurrentModificationException 1
 * 
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A"); //Duplicate
		list.add(null); //null
		System.out.println(list); //[A,B,C,A,null]
		System.out.println(list.get(3));  //A
		//System.out.println(list.get(8)); //IndexOutofboundException
		//list.set(8, "Z"); //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 8, Size: 5
		list.set(4, "Z"); 
		System.out.println(list); //[A,B,C,A,Z]
		System.out.println(list.remove(4)); //Z
		System.out.println(list);//[A,B,C,A]
		//list.clear();
		
		//iteration the list
		Iterator<String> itr = list.iterator();
		System.out.println("List Elements One by one is:");
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//list.add("N"); //Exception in thread "main" java.util.ConcurrentModificationException
		}
	
	}

}
