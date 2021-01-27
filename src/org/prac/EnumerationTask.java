package org.prac;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTask {
public static void main(String[] args) {
	Vector<Integer> l = new Vector<>();
	l.add(10);
	l.add(30);
	l.add(40);
	l.add(90);
	l.add(50);
	
	Enumeration<Integer> elements = l.elements();
	while (elements.hasMoreElements()) {
		Integer integer = elements.nextElement();
		System.out.println(integer);
		
	}
}
}
