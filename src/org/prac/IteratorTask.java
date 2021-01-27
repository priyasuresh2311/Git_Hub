package org.prac;

import java.util.Iterator;
import java.util.Vector;

public class IteratorTask {
public static void main(String[] args) {
	Vector<Integer> l = new Vector<>();
	l.add(10);
	l.add(30);
	l.add(50);
	l.add(90);
	l.add(25);
	
	Iterator<Integer> iterator = l.iterator();
	while (iterator.hasNext()) {
		Integer x = (Integer) iterator.next();
		if (x==30) {
			iterator.remove();
		}
//		System.out.println("before Removing element");
		System.out.println(x);
	}
	
	System.out.println("After removing element:");
	for (Integer remo : l) {
		System.out.println(remo);
	}
}
}
