package kadanes.subarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class MinimumLengthOfSubArrayWithGreaterThanGivenSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		{
			int number_of_test_cases = Integer.parseInt(br.readLine());
			for (int i = 0; i < number_of_test_cases; i++) {
				String line = br.readLine();
				String[] strs = line.trim().split("\\s+");
				int number_of_elements = Integer.parseInt(strs[0]);
				int sum = Integer.parseInt(strs[1]);
				int ar[] = new int[number_of_elements];
				line = br.readLine();
				strs = line.trim().split("\\s+");
				for (int j = 0; j < number_of_elements; j++) {
					ar[j] = Integer.parseInt(strs[j]);
				}
				System.out.println(printSubArrayIndexesWithSumGreaterThanGivenSum(ar, sum));
			}
		}
	}

	private static int printSubArrayIndexesWithSumGreaterThanGivenSum(int ar[], int givenSum) {
		int currentSum = ar[0];
		int startIndex = 0;
		if (currentSum > givenSum) {
			return 1;
		}
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 1; i < ar.length; i++) {
			if (currentSum + ar[i] <= givenSum) {
				currentSum += ar[i];
			} else if (currentSum + ar[i] > givenSum) {
				while (currentSum + ar[i] > givenSum) {
					currentSum -= ar[startIndex];
					set.add(i - startIndex + 1);
					startIndex++;
				}
				currentSum += ar[i];
			}
		}
		if (!set.isEmpty()) {
			return set.first();
		}
		return -1;
	}
}
