package com.ds.algo.practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubArrayWithGivenSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		{
			int number_of_test_cases = Integer.parseInt(br.readLine());
			for (int i = 0; i < number_of_test_cases; i++) {
				String line = br.readLine();
				String[] strs = line.trim().split("\\s+");
				int number_of_elements = Integer.parseInt(strs[0]);
				int sum = Integer.parseInt(strs[1]);
				int ar[] = new int[number_of_elements];
				line = br.readLine();
				strs = line.trim().split("\\s+");
				for (int j = 0; j < number_of_elements; j++) {
					ar[j] = Integer.parseInt(strs[j]);
				}
				printSubArrayIndexesWithGivenSum(ar, sum);
			}
		}
	}

	private static void printSubArrayIndexesWithGivenSum(int ar[], int givenSum) {
		int currentSum = ar[0];
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 1; i < ar.length; i++) {
			if (currentSum + ar[i] == givenSum) {
				endIndex = i;
				System.out.println(startIndex + 1 + " " + (endIndex + 1));
				return;
			} else if (currentSum + ar[i] < givenSum) {
				currentSum += ar[i];
			} else if (currentSum + ar[i] > givenSum) {
				while (currentSum + ar[i] > givenSum) {
					currentSum -= ar[startIndex];
					startIndex++;
				}
				if (currentSum + ar[i] == givenSum) {
					endIndex = i;
					System.out.println(startIndex + 1 + " " + (endIndex + 1));
					return;
				}
				currentSum += ar[i];
			}
		}
		System.out.println(-1);
	}
}
