package org.prac;

public class ArmstrongNumber {
public static void main(String[] args) {
	int reminder=0, result=0;  int number=124; int n=number;
	while (number>0) {
		reminder=number%10;
		result=result+(reminder*reminder*reminder);
		number=number/10;
	}
	if (n==result) {
		System.out.println("Armstrong Number");
	}
	else {
		System.out.println("Not an Armstrong Number");
	}
}
}
