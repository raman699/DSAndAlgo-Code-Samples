package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchWhenDifferenceBwElementIs1 {

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

	private static int search(int[] ar, int element_to_search) {

		int i = 0;
		while (i < ar.length) {
			if (ar[i] == element_to_search) {
				return i;
			}
			i = i + Math.abs((ar[i] - element_to_search));
		}
		return -1;

	}
}
