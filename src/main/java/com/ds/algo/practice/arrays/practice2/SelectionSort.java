package com.ds.algo.practice.arrays.practice2;

public class SelectionSort {
	public static void main(String... s) {
		int ar[] = { 6, 5, 4, 3, 2, 1 };
		selectionSort(ar);
	}

	public static void selectionSort(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int i : ar)
			System.out.print(i+" ");
	}
}
