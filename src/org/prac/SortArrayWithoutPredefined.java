package org.prac;

public class SortArrayWithoutPredefined {
public static void main(String[] args) {
	int[] a = {1,9,5,4,8,6,7};
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]>a[j]) {
				int temp= a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
		System.out.println("After sorting is ascending Order");
		for (int i : a) {
			System.out.println(i);
		}
	}

}

