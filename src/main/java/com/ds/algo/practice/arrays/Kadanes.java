package com.ds.algo.practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadanes {

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
			System.out.println(maxSubArraySum(ar));
		}
	}

	public static int maxSubArraySum(int ar[]) {
		int currentSum = ar[0];
		int overallSum = ar[0];

		for (int i = 1; i < ar.length; i++) {
			if (ar[i] + currentSum > ar[i]) {
				currentSum = ar[i] + currentSum;
			} else {
				currentSum = ar[i];
			}
			if (currentSum > overallSum) {
				overallSum = currentSum;
			}
		}
		return overallSum;
	}
}
