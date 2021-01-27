package org.prac;

public class PalindromeProgram {
public static void main(String[] args) {
	//Palindrome - 141 shuld be 141
	
	int num =161;
	int n = num;
	int rem; int res=0;
	while (num>0) {
		rem=num%10;
		res=(res*10)+rem;
		num=num/10;
	}
	if(n==res) {
		System.out.println(n+" is Palindrome");
	}
	else {
		System.out.println(n+" Not a Palindrome");
	}
}
}
