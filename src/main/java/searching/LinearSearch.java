package searching;

import java.util.Scanner;

public class LinearSearch
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
			int index_of_element = check(ar, element_to_search);
			System.out.println(index_of_element);
		}
		sc.close();
	}

	public static int check(int ar[], int x)
	{
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[i] == x)
			{
				return i;
			}
		}
		return -1;
	}
}
