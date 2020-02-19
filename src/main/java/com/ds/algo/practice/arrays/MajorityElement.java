package com.ds.algo.practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number_of_test_cases = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < number_of_test_cases; i++) {
			int number_of_elements = Integer.parseInt(br.readLine().trim());
			int ar[] = new int[number_of_elements];
			String strs[] = br.readLine().split("\\s");
			for (int j = 0; j < strs.length; j++) {
				ar[j] = Integer.parseInt(strs[j]);
			}
			System.out.println(findMajorityElement2(ar));
		}
	}

	private static int findMajorityElement(int ar[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : ar) {
			if (hm.containsKey(i)) {
				int currentCount = hm.get(i);
				hm.put(i, currentCount + 1);
			} else {
				hm.put(i, 1);
			}
		}
		for (int j : hm.keySet()) {
			if (hm.get(j) > (ar.length / 2)) {
				return j;
			}
		}
		return -1;
	}

	private static int findMajorityElement2(int ar[]) {

		int me = ar[0], count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (me == ar[i]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				me = ar[i];
				count = 1;
			}
		}
		int counter = 0;
		for (int i : ar) {
			if (i == me)
				counter++;
		}
		if (counter > ar.length / 2) {
			return me;
		} else {
			return -1;
		}
	}
}