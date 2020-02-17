package com.ds.algo.practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoveAllZeroesToEndOfAnArray {

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
			moveAllZeroesToEndOfAnArray(ar);
			System.out.println();
		}
	}

	private static void moveAllZeroesToEndOfAnArray(int ar[]) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				System.out.print(ar[i] + " ");
				count++;
			}
		}
		for (int i = 0; i < ar.length - count; i++) {
			System.out.print(0 + " ");
		}
	}
}
