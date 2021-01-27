package org.prac;

public class MultiplyDigitsOfNumber {
public static void main(String[] args) {
	int res=1, rem, num=1234;
	while (num>0) {
		rem=num%10;
		res=res*rem;
		num=num/10;
	}
	System.out.println("Multiplication of all Numbers:"+res);
}
}
