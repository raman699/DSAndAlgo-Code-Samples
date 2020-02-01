package com.ds.algo.practice.arrays.sorting;

import java.util.Scanner;

public class InsertionSortGFG {

	public static void main(String... s) {
		Scanner sc = new Scanner(System.in);
		int number_of_test_cases = sc.nextInt();
		for (int i = 0; i < number_of_test_cases; i++) {
			int number_of_elements = sc.nextInt();
			int ar[] = new int[number_of_elements];
			for (int j = 0; j < number_of_elements; j++) {
				ar[j] = sc.nextInt();
			}
			insertionSort(ar, ar.length);
			System.out.println();
			for (int j : ar) {
				System.out.print(j + " ");
			}
		}
		sc.close();
	}

	static void insertionSort(int arr[], int n) {
		int i;
		for (i = 1; i < n; i++)
			insert(arr, i);
	}

	static void insert(int arr[], int i) {
		// Your code here
		for (int j = i; j > 0; j--) {
			if (arr[j] < arr[j - 1]) {
				int k = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = k;
			}
		}
	}
}
