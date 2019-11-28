package com.venu.practise.set.examples;

import java.util.HashSet;

/*
 * 1) Underlying Data Structure us Hashtable
 * 2) Unique elements are allowed.
 * 3) It is a non-synchronized
 * 4) Values will be inserted based on their hashcode
 * 6) It is a not a Threadsafe
 * 7) Duplicates are not allowed. If we try to insert duplicates, we wont get any compile/runtime errors but simply method returns false
 * 8) Only one null insertion is possible
 * 9) It's implements serializable, cloneable.
 * 10) It is best choice if our frequent operation is search.
 * 11) Introduced in 1.2v
 */

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> ht = new HashSet<>();
		ht.add("A");
		ht.add("B");
		ht.add("A");
		ht.add(null);
		ht.add(null);
		System.out.println(ht); //[null,A,B]

	}

}
