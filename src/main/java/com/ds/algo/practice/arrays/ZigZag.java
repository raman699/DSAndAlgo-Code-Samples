package com.ds.algo.practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZag {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int number_of_test_cases = Integer.parseInt(br.readLine());
		for (int i = 0; i < number_of_test_cases; i++) {
			int number_of_elements = Integer.parseInt(br.readLine());
			int ar[] = new int[number_of_elements];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int j = 0; j < number_of_elements; j++) {
				ar[j] = Integer.parseInt(strs[j]);
			}
			zigzag(ar);
			for (int j : ar)
				System.out.print(j + " ");
			System.out.println();
		}
	}

	private static void zigzag(int ar[]) {

		boolean operator = true;

		for (int i = 0; i < ar.length - 1; i++) {

			if (operator) {
				if (!(ar[i] < ar[i + 1])) {
					swap(ar, i, i + 1);
				}
			} else if (!operator) {
				if (!(ar[i] > ar[i + 1])) {
					swap(ar, i, i + 1);
				}
			}
			operator = !operator;
		}

	}

	private static void swap(int ar[], int i, int j) {
		int k = ar[i];
		ar[i] = ar[j];
		ar[j] = k;
	}

}
