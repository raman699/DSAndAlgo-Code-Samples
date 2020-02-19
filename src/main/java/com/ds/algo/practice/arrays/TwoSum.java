package com.ds.algo.practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int number_of_test_cases = Integer.parseInt(br.readLine());
		for (int i = 0; i < number_of_test_cases; i++) {
			String[] strs1 = br.readLine().trim().split("\\s+");
			int number_of_elements = Integer.parseInt(strs1[0]);
			int sum = Integer.parseInt(strs1[1]);
			int ar[] = new int[number_of_elements];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			Set<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < number_of_elements; j++) {
				ar[j] = Integer.parseInt(strs[j]);
				set.add(Integer.parseInt(strs[j]));
			}
			System.out.println(pairSum(ar, set, sum));
		}
	}

	private static int pairSum(int ar[], Set<Integer> set, int sum) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			if (!hm.containsKey(ar[i])) {
				hm.put(ar[i], 1);
			} else {
				hm.put(ar[i], hm.get(ar[i]) + 1);
			}
		}
		int counter = 0;
		for (int i = 0; i < ar.length; i++) {
			if (hm.containsKey(sum - ar[i])) {
				counter += hm.get(sum - ar[i]);
			}
			if (sum - ar[i] == ar[i])
				counter--;
		}
		return counter / 2;
	}
}
