package org.prac;

public class ReverseANumber {

	
	public static void main(String[] args) {

		int i = 15625, reminder = 0, result = 0;
		while (i>0) {
			reminder = i % 10;
			result = (result*10)+reminder;
					i=i/10;
							}
		System.out.println(result);
	}
}
