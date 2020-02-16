package com.ds.algo.practice.arrays;

import java.io.IOException;
import java.util.Scanner;

public class KConcateScanner {
	public static void main(String... s) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		int numberOfTestCases = 0;
		if (sc.hasNext()) {
			numberOfTestCases = sc.nextInt();
		}
		for (int i = 0; i < numberOfTestCases; i++) {

			int N = sc.nextInt();
			int K = sc.nextInt();
			int ar[] = new int[N];
			for (int j = 0; j < N; j++) {
				ar[j] = sc.nextInt();
			}
			System.out.println(kadanes(ar, K));
		}
	}

	public static void print(int ar[]) {
		System.out.println();
		for (int i : ar) {
			System.out.print(i + " ");
		}
	}

	public static int kadanes(int ar[], int k) {
		int currentSum = 0, overallSum = 0;
		for (int i = 0; i < ar.length * k; i++) {
			if (currentSum + ar[i % ar.length] > ar[i % ar.length]) {
				currentSum = currentSum + ar[i % ar.length];
			} else {
				currentSum = ar[i % ar.length];
			}
			if (overallSum < currentSum) {
				overallSum = currentSum;
			}
		}
		return overallSum;
	}
}
