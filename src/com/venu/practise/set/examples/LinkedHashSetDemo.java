package com.venu.practise.set.examples;
/*
 * 1) Underlying Data Structure is HashTable+Double Linked List
 * 2) Every method present in LinkedHashSet is non-synchronized.
 * 3) Multiple threads can perform on LinkedHashSet object, hence it is not a thread safe
 * 4) Duplicates are not allowed.
 * 5) Insertion order is preserved
 * 6) Null is allowed.
 * 7) It is a child class of HashSet
 * 8) Introduced in 1.4v
 */

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> ht = new LinkedHashSet<>();
		ht.add("A");
		ht.add("B");
		ht.add("A");
		ht.add(null);
		ht.add(null);
		System.out.println(ht); //[A,B,Null]
		
	}

}
