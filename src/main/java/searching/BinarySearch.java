package searching;

import java.util.Scanner;

public class BinarySearch
{
	public static void main(String... s)
	{
		Scanner sc = new Scanner(System.in);
		int number_of_test_cases = sc.nextInt();
		for (int i = 0; i < number_of_test_cases; i++)
		{
			int number_of_elements = sc.nextInt();
			int ar[] = new int[number_of_elements];
			for (int j = 0; j < number_of_elements; j++)
			{
				ar[j] = sc.nextInt();
			}
			int element_to_search = sc.nextInt();
			int index_of_element = bin_search(ar, 0, ar.length-1, element_to_search);
			System.out.println(index_of_element);
		}
		sc.close();
	}

	public static int bin_search(int ar[], int left, int right, int k)
	{
		int mid = (left + right) / 2;
		while (left <= right)
		{
			if (ar[mid] == k)
				return mid;
			else if (ar[mid] > k)
				right = mid - 1;
			else if (ar[mid] < k)
				left = mid + 1;
			mid = (left + right) / 2;
			
		}
		return -1;
	}
}
