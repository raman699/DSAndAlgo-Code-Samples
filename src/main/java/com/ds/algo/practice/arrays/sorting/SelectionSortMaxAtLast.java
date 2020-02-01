package com.ds.algo.practice.arrays.sorting;

import java.util.Scanner;

public class SelectionSortMaxAtLast {
	public static void main(String... s) {
		Scanner sc = new Scanner(System.in);
		int number_of_test_cases = sc.nextInt();
		for (int i = 0; i < number_of_test_cases; i++) {
			int number_of_elements = sc.nextInt();
			int ar[] = new int[number_of_elements];
			for (int j = 0; j < number_of_elements; j++) {
				ar[j] = sc.nextInt();
			}
			selctionSortMaxAtLast(ar);
			System.out.println();
			for (int j : ar) {
				System.out.print(j+" ");
			}
		}
		sc.close();
	}

	public static void selctionSortMaxAtLast(int ar[]) {
		for (int i = ar.length-1; i >0; i--) {
			for (int j = i -1; j >=0; j--) {
				if (ar[j] > ar[i]) {
					int k = ar[j];
					ar[j] = ar[i];
					ar[i] = k;
				}
			}
		}
	}
}
