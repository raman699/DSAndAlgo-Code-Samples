package com.ds.algo.practice.arrays.practice2;

public class BubbleSort {

	public static void main(String... s) {
		int ar[] = { 6, 5, 4, 3, 2, 1 };
		bubbleSort(ar);
	}

	public static void bubbleSort(int ar[]) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j < ar.length-1-i; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		for (int i : ar)
			System.out.print(i+" ");
	}
}
