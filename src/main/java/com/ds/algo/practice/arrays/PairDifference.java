package com.ds.algo.practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class PairDifference {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int number_of_test_cases = Integer.parseInt(br.readLine());
		for (int i = 0; i < number_of_test_cases; i++) {
			String[] strs1 = br.readLine().trim().split("\\s+");
			int number_of_elements = Integer.parseInt(strs1[0]);
			int diff = Integer.parseInt(strs1[1]);
			int ar[] = new int[number_of_elements];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			Set<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < number_of_elements; j++) {
				ar[j] = Integer.parseInt(strs[j]);
				set.add(Integer.parseInt(strs[j]));
			}
			System.out.println(pairDifference(ar, set, diff));
		}
	}

	private static int pairDifference(int ar[], Set set, int diff) {
		for (int i = 0; i < ar.length; i++) {
			if (set.contains(ar[i] - diff)) {
				return 1;
			}
		}
		return -1;
	}
}
