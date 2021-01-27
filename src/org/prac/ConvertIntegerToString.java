package org.prac;

public class ConvertIntegerToString {

	public static void main(String[] args) {
		int num = 123; String result="";
		String number = String.valueOf(num);
//		for (int i = number.length()-1; i >=0; i--) {
//			system.out.println(number.charAt(i));
//		}
		
		//or
		for (int i = number.length()-1; i >=0; i--) {
			char c = number.charAt(i);
		result = result+c;
			
	}
		System.out.println(result);
	
		
	}
	
	
}
