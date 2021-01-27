package org.prac;

public class CountEvenOddUsingForloop {

	public static void main(String[] args) {
		int sum = 0, even = 0, odd = 0;
		for (int i = 0; i <= 10; i = i + 2) {
			System.out.println(i);
			even++;
		}
		System.out.println("Count of even Number:" + even);
		for (int j = 1; j <= 10; j = j + 2) {
			System.out.println(j);
			odd++;
		}
		System.out.println("Count of odd Number:" + odd);
	}
}


//we can consider this way also
//for (int i = 0; i <= 10; i = i + 2) {
//	if(i%2==0) {
//	even++;
//}
//	else {
//	odd++;
//}
//	System.out.println("Count of even Number:" + even);
//System.out.println("Count of odd Number:" + odd);
//}