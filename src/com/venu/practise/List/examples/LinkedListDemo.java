package com.venu.practise.List.examples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList-->
 * 1) Underlying DS : Double Linked List
 * 2) Insertion order is preserved.
 * 3) Null is allowed.
 * 4) Heterogeneous  elements are allowed.
 * 5) Duplicates are allowed.
 * 6) It wont implements RandomAccess interface, hence retrieval is not fast in LinkedList.
 * 7) It is best for manipulation bcz there is no shifting operations and it follows nodes.
 * 10) Non-Synchronized.
 * 11) Collections.synchronizedList(List obj); --> Converts synchronized list
 * 12) Not a thread safe
 * 14) It implements Serialization and cloanable 
 * 
 */

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> li = new LinkedList<>();
		li.add("A");
		li.add("B");
		li.add("C");
		li.add("D");
		li.add(null);
		li.add("A");
		li.set(2, "Z");
		System.out.println(li); //[A,B,Z,D,null,A]
		System.out.println(li.get(3)); //D
		//li.clear();
		//System.out.println(li);
		Iterator<String> itr = li.iterator();
		System.out.println("Iterating the list :");
		while(itr.hasNext()) {
			System.out.println(itr.next()); // A B Z D F A
			li.set(4, "F");
			
		}

	}

}
