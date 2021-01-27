package org.prac;

public class ReverseStringAnotherMethod {
	public static void main(String[] args) {
		String name = "niha";
		String reverse = "";
		char[] ch = name.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			reverse=reverse+ch[i];
		}
		System.out.println("reverse of string"+"\n"+reverse);

	}
}
