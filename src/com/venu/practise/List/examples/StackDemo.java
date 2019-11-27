package com.venu.practise.List.examples;
/*
 * 1) It is sub class of Vector
 * 2) It is specially designed class for Last In First Order (LIFO)
 * 3) Null is allowed
 * 4) Duplicates are allowed 
 * 5) Insertion order is preserved
 * 6) search()---> it returns -1 if element is not available in stack.else returns offset index
 * 7) pop() -->remove and returns the top of the stack
 * 8) peek() -->returns the top of the stack
 * 9)If trying to modify while iterating the list we will get ConcurrentModificationException
 */

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.add("A");
		st.add("B");
		st.add("C");
		st.add("D");
		st.add("X");
		st.add(null);
		System.out.println(st);
		System.out.println(st.search("B")); //offset-->bottom-top //5
		System.out.println(st.search(9)); //-1
		System.out.println(st.pop()); //null
		System.out.println(st); //[A,B,C,D,A]
		System.out.println(st.peek()); //X
		Iterator<String> itr = st.iterator();
		System.out.println("Iterating the elements one by one in stack");
		while(itr.hasNext()) {
			System.out.println(itr.next()); //[A,B,C,D,X]
			//st.add("N");1
		}

	}

}
