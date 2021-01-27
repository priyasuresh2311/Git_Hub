package org.prac;

public class ReverseString {
public static void main(String[] args) {
	String s = "PriyaSuresh"; String result="";
	
	
	for (int i=s.length()-1;i>=0; i--) {
	char reverseCharacter = s.charAt(i);
	result=result+reverseCharacter;
	}
	System.out.println(result+"\n"+result.length());
}
}
