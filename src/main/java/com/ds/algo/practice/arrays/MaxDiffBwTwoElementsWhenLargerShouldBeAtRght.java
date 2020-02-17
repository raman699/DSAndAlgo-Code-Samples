package com.ds.algo.practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxDiffBwTwoElementsWhenLargerShouldBeAtRght {

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
			System.out.println(findMax(ar));
		}
	}

	private static int findMax(int ar[]) {
		int min = ar[0], diff = -1;
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
			diff = Math.max(diff, ar[i] - min);
		}
		if (diff == 0) {
			return -1;
		}
		return diff;
	}
}
