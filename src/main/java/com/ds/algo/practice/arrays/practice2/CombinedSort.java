package com.ds.algo.practice.arrays.practice2;

public class CombinedSort {

	public static void main(String... s) {
		int ar[] = { 6, 5, 4, 3, 2, 1 };
		bubbleSort(ar);
		int ar1[] = { 6, 5, 4, 3, 2, 1 };
		selectionSort(ar1);
		int ar2[] = { 6, 5, 4, 3, 2, 1 };
		insertionSort(ar2);
	}

	private static void bubbleSort(int ar[]) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j < ar.length - 1 - i; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		print(ar);
	}

	private static void selectionSort(int ar[]) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}
		print(ar);
	}

	private static void insertionSort(int ar[]) {

		for (int i = 1; i < ar.length; i++) {
			for (int j = i; j > 0; j--) {
				if (ar[j] < ar[j - 1]) {
					int temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;
				}
			}
		}
		print(ar);
	}

	private static void print(int ar[]) {
		for (int i : ar)
			System.out.print(i + " ");

		System.out.println();
	}
}
