package com.ds.algo.practice.arrays;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number_of_test_cases = sc.nextInt();
		for (int i = 0; i < number_of_test_cases; i++) {
			int number_of_elements = sc.nextInt();
			int ar[] = new int[number_of_elements];
			for (int j = 0; j < number_of_elements; j++) {
				ar[j] = sc.nextInt();
			}
			reverse(ar);
			System.out.println();
		}
		sc.close();
	}

	public static void reverse(int ar[]) {
		int beg = 0, end = ar.length - 1;
		while (beg < end) {
			int k = ar[beg];
			ar[beg] = ar[end];
			ar[end] = k;
			beg++;
			end--;
		}

		for (int i : ar)
			System.out.print(i + " ");
	}
}
