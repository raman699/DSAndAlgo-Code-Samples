package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SearchRepeatedAndMissingElement {
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
			search2(ar);
		}
	}

	private static void search(int[] ar) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int re = -1;
		int me = -1;
		for (int i = 0; i < ar.length; i++) {

			if (!map.containsKey(ar[i])) {
				map.put(ar[i], true);
			} else {
				re = ar[i];
			}

		}
		for (int i = 1; i <= ar.length; i++) {
			if (!map.containsKey(i)) {
				me = i;
			}
		}
		System.out.println(re + " " + me);
	}

	private static void search2(int[] ar) {
		int[] temp = new int[ar.length + 1];

		for (int i = 0; i < ar.length; i++) {
			temp[ar[i]]++;

		}
		int re = -1;
		int me = -1;
		for (int i = 1; i <= ar.length; i++) {
			if (temp[i] == 0) {
				me = i;
			}
			if (temp[i] > 1) {
				re = i;
			}

		}
		System.out.println(re + " " + me);
	}
}
