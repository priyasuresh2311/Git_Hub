package org.prac;

public class SumOfDigits {
public static void main(String[] args) {
	int rem, res =0, num=15234;
	while (num>0) {
		rem=num%10;
		res=res+rem;
		num=num/10;
	}
	
	System.out.println(res);
}
}
