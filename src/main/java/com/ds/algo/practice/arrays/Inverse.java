package com.ds.algo.practice.arrays;

import java.util.Scanner;

public class Inverse {
	public static void main(String... s) {
		Scanner sc = new Scanner(System.in);
		int number_of_test_cases = sc.nextInt();
		for (int i = 0; i < number_of_test_cases; i++) {
			int number_of_elements = sc.nextInt();
			int ar[] = new int[number_of_elements];
			for (int j = 0; j < number_of_elements; j++) {
				ar[j] = sc.nextInt();
			}
			inverse(ar);
			System.out.println();
		}
		sc.close();
	}
	
	public static void inverse(int ar[])
	{
		int iar[]= new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			iar[ar[i]] =i;
		}
		for(int i:iar)
			System.out.print(i+" ");
	}
}
