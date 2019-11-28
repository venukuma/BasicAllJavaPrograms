package com.venu.practise.List.examples;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/*1) Heterogeneous objects are allowed
 *2) It is a synchronized version of ArrayList. It is a concurrent collection.
 *3) Duplicates are allowed
 *4) It is a thread safe.
 *5) It is available in java.util.concurrent.CopyOnWriteArrayList
 *6) Null insertion is possible.
 *7) It implements Serializable, Cloneable, and RandomAccess 
 *8) For Write operation it created cloned copy under Arraylist. At certain point jvm will make both obj in sync
 *9) It is a fail-safe
 *10) It can't perform remove operations while iterator perform read operations.If we tried to remove we will get RunTimeException like UnSupportedOperationException
 *11) It never throws ConcurrentModificationExcepion 
 */
public class CopyOnWriteArrayListDemo2 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();
		cowal.add("A");
		cowal.add("B");
		cowal.add("C");
		cowal.add("D");
		cowal.add(null);
		cowal.add(null);
		Iterator<String> itr = cowal.iterator();
		while(itr.hasNext()) {
			String s = (String) itr.next();
			cowal.add("V");
			/*
			 * if(s.contains("A")) { itr.remove(); } //java.lang.UnsupportedOperationException
			 */
			System.out.println(s);
			
		}
		
		Iterator<String> itr1 = cowal.iterator();
		while(itr1.hasNext()) {
			String s = (String) itr1.next();
			/*
			 * if(s.contains("A")) { itr.remove(); } //java.lang.UnsupportedOperationException
			 */
			System.out.println("Updated List: "+s);
			
		}
	}

}
