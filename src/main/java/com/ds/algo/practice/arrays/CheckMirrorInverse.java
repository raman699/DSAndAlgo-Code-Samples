package com.ds.algo.practice.arrays;

import java.util.Scanner;

public class CheckMirrorInverse {

	public static void main(String... s) {
		Scanner sc = new Scanner(System.in);
		int numberOfTestCases = sc.nextInt();
		for (int i = 0; i < numberOfTestCases; i++) {
			int numberOfElements = sc.nextInt();
			int ar[] = new int[numberOfElements];
			for (int j = 0; j < numberOfElements; j++) {
				ar[j] = sc.nextInt();
			}
			System.out.println(checkMirrorInverse(ar));
		}
		sc.close();
	}

	public static boolean checkMirrorInverse(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			if(ar[ar[i]]!=i)
			{
				return false;
			}
		}
		return true;
	}
}
