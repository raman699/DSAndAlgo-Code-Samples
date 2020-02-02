package com.ds.algo.practice.arrays;

import java.util.Scanner;

public class Rotate {

	public static void main(String... s) {
		Scanner sc = new Scanner(System.in);

		int numberOfTestCases = sc.nextInt();

		for (int i = 0; i < numberOfTestCases; i++) {
			int numberOfElements = sc.nextInt();
			int rotateBy = sc.nextInt();
			int ar[] = new int[numberOfElements];
			for (int j = 0; j < numberOfElements; j++) {
				ar[j] = sc.nextInt();
			}
			if (rotateBy > ar.length) {
				rotateBy = rotateBy % ar.length;
			}
			rotate(ar, rotateBy);
		}

		sc.close();
	}

	public static void rotate(int ar[], int k) {

		reverse(ar, 0, k - 1);
		reverse(ar, k, ar.length - 1);
		reverse(ar, 0, ar.length - 1);
		StringBuilder sb = new StringBuilder();
		for (int i : ar) {
			// System.out.print(i+" ");
			sb.append(i + " ");
		}
		System.out.println(sb);
	}

	public static void reverse(int ar[], int beg, int end) {
		while (beg <= end) {
			int temp = ar[beg];
			ar[beg] = ar[end];
			ar[end] = temp;
			beg++;
			end--;
		}
	}
}
