package com.ds.algo.practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SegregateZeroAndOne {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int number_of_test_cases = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < number_of_test_cases; i++) {
			int number_of_elements = Integer.parseInt(br.readLine().trim());
			int ar[] = new int[number_of_elements];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int j = 0; j < number_of_elements; j++) {
				ar[j] = Integer.parseInt(strs[j]);
			}
			segregate2(ar);
			System.out.println();
		}
	}

	private static void segregate(int ar[]) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				System.out.print(ar[i] + " ");
				count++;
			}
		}
		for (int i = 0; i < ar.length - count; i++) {
			System.out.print(1 + " ");
		}
	}

	private static void segregate2(int ar[]) {
		int zeroIndex = 0;
		int oneIndex = ar.length - 1;
		while (zeroIndex < oneIndex) {
			while (ar[zeroIndex] == 0 && zeroIndex < oneIndex) {
				zeroIndex++;
			}

			while (ar[oneIndex] == 1 && oneIndex > zeroIndex) {
				oneIndex--;
			}
			swap(ar, zeroIndex, oneIndex);
		}
		StringBuilder sb = new StringBuilder();
		for (int i : ar)
			sb.append(i + " ");
		System.out.println(sb);
	}

	private static void swap(int ar[], int i, int j) {
		int k = ar[i];
		ar[i] = ar[j];
		ar[j] = k;
	}
}
