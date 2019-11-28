package com.venu.practise.List.examples;

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
public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		CopyOnWriteArrayList cowal = new CopyOnWriteArrayList<>();
		cowal.add(12);
		cowal.add("A");
		cowal.add("A");
		System.out.println(cowal); //[12, A, A]

	}

}
