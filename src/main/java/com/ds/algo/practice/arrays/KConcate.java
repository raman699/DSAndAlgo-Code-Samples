package com.ds.algo.practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KConcate {

	public static void main(String... s) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numberOfTestCases = Integer.parseInt(br.readLine());
		for (int i = 0; i < numberOfTestCases; i++) {

			String[] strs = br.readLine().trim().split("\\s+");
			int N = Integer.parseInt(strs[0]);
			int K = Integer.parseInt(strs[1]);
			int ar[] = new int[N];
			String[] strs1 = br.readLine().trim().split("\\s+");
			for (int j = 0; j < N; j++) {
				ar[j] = Integer.parseInt(strs1[j]);
			}
			int[] newAr = new int[N * K];
			int oldIndex = 0;
			for (int k = 0; k < N * K; k++) {
				newAr[k] = ar[oldIndex % N];
				oldIndex++;
			}
			System.out.println(kadanes(newAr));
		}
	}

	public static int kadanes(int ar[]) {
		int currentSum = 0, overallSum = 0;
		for (int i = 0; i < ar.length; i++) {
			if (currentSum + ar[i] > ar[i]) {
				currentSum = currentSum + ar[i];
			} else {
				currentSum = ar[i];
			}
			if (overallSum < currentSum) {
				overallSum = currentSum;
			}
		}
		return overallSum;
	}
}
