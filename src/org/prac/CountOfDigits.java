package org.prac;

public class CountOfDigits {
public static void main(String[] args) {
	//count of all digits in a number
	int num=12345, count=0;
	while (num>0) {
		count++;
		num=num/10;
	}
	System.out.println("count of all numbers: "+count);
}
}
