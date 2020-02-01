package com.ds.algo.practice.arrays.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String... s) {
		Scanner sc = new Scanner(System.in);
		int number_of_test_cases = sc.nextInt();
		for (int i = 0; i < number_of_test_cases; i++) {
			int number_of_elements = sc.nextInt();
			int ar[] = new int[number_of_elements];
			for (int j = 0; j < number_of_elements; j++) {
				ar[j] = sc.nextInt();
			}
			for (int index = 0; index < number_of_elements - 1; index++)
				bubble(ar, index, number_of_elements);
			for (int index = 0; index < number_of_elements; index++)
				System.out.print(ar[index]+" ");
		}
		sc.close();
	}

	static void bubble(int arr[], int i, int n) {
		for (int j = 0; j < n - i - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				int k = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = k;
			}
		}
	}
}
