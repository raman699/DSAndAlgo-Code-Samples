package com.ds.algo.practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SegregateZeroOneAndTwo {

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
			segregate(ar);
			print(ar);
		}
	}

	private static void segregate(int ar[]) {
		int low = 0, mid = 0, high = ar.length - 1;

		while (mid <= high) {
			if (ar[mid] == 1) {
				mid++;
			} else if (ar[mid] == 0) {
				swap(ar, low, mid);
				mid++;
				low++;
			} else if (ar[mid] == 2) {
				swap(ar, mid, high);
				high--;
			}
		}
	}

	private static void swap(int ar[], int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}

	private static void print(int ar[]) {

		StringBuilder sb = new StringBuilder();
		for (int i : ar)
			sb.append(i + " ");
		System.out.println(sb);

	}
}
