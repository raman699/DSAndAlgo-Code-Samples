package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchInSortedAndRotatedArray {

	public static void main(String[] s) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number_of_test_cases = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < number_of_test_cases; i++) {
			int number_of_elements = Integer.parseInt(br.readLine().trim());
			int ar[] = new int[number_of_elements];
			String elements[] = br.readLine().trim().split("\\s");
			for (int j = 0; j < number_of_elements; j++) {
				ar[j] = Integer.parseInt(elements[j]);
			}
			int element_to_search = Integer.parseInt(br.readLine().trim());
			int index_of_element = search(ar, element_to_search);
			System.out.println(index_of_element);
		}
	}

	private static int search(int ar[], int x) {
		int ci = -1;
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] > ar[i + 1]) {
				ci = i;
				break;
			}
		}
		if (ci == -1) {
			ci = ar.length - 1;
		}
		if (x >= ar[0]) {
			return binarySearch(ar, 0, ci, x);
		} else if (x < ar[0]) {
			return binarySearch(ar, ci, ar.length - 1, x);
		}
		return -1;
	}

	private static int binarySearch(int ar[], int beg, int end, int x) {
		int mid = (beg + end) / 2;
		while (beg <= end) {

			if (ar[mid] == x) {
				return mid;
			}

			else if (ar[mid] > x) {
				end = mid - 1;
			}

			else if (ar[mid] < x) {
				beg = mid + 1;
			}
			mid = (beg + end) / 2;
		}
		return -1;
	}
}
