package org.prac;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorTask {
public static void main(String[] args) {
	Vector<Integer> l = new Vector<>();
	l.add(10);
	l.add(50);
	l.add(100);
	l.add(150);
	l.add(158);
	
	ListIterator<Integer> listIterator = l.listIterator();
	System.out.println("forward");
	while (listIterator.hasNext()) {
		Integer next = listIterator.next();
		if (next==158) {
//			listIterator.remove();
		}
		System.out.println(next);
	}
	System.out.println("backward");
	while (listIterator.hasPrevious()) {
		Integer previous = listIterator.previous();
		System.out.println(previous);
	}
}
}
