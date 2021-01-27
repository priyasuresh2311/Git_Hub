package org.prac;

public class ReverseWordReverse {
public static void main(String[] args) {
	//Expected Output: emoclew ot avaj ssalc
	String name="welcome to java class";
	String result="";
	
	String[] splits = name.split(" ");
	for (String word : splits) {
		String reverse="";
	for (int i = word.length()-1; i >=0; i--) {
		reverse = reverse+word.charAt(i);
	}
	result = result+reverse+" ";
	}
	System.out.println(result);
}
}
