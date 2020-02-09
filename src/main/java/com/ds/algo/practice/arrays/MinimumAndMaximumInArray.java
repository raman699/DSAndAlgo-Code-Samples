package com.ds.algo.practice.arrays;

import java.util.Scanner;

public class MinimumAndMaximumInArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number_of_test_cases = sc.nextInt();
		for (int i = 0; i < number_of_test_cases; i++)
		{
			int number_of_elements_in_tc = sc.nextInt();
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int ar[] = new int[number_of_elements_in_tc];
			for (int j = 0; j < number_of_elements_in_tc; j++)
			{
				ar[j] = sc.nextInt();
				if (ar[j] > max)
					max = ar[j];
				if (ar[j] < min)
					min = ar[j];
			}
			System.out.println(min + " " + max);
		}
		sc.close();
	}
}
