package org.prac;

public class FirstLetterUpper_String {
public static void main(String[] args) {
	String name = "welcome to java class";
	String result = " ";
	String[] splits = name.split(" ");
	for (String word : splits) {
		char c = word.charAt(0);
		result = result+Character.toUpperCase(c)+word.substring(1)+" ";
		
	}
	System.out.println(result);
}
}
