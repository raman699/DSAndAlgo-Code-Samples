package kadanes.subarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountSubArraysWithGivenSum0 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		{
			int number_of_test_cases = Integer.parseInt(br.readLine());
			for (int i = 0; i < number_of_test_cases; i++) {
				String line = br.readLine();
				int number_of_elements = Integer.parseInt(line);
				int ar[] = new int[number_of_elements];
				line = br.readLine();
				String[] strs = line.trim().split("\\s+");
				for (int j = 0; j < number_of_elements; j++) {
					ar[j] = Integer.parseInt(strs[j]);
				}
				printSubArrayIndexesWithSumZero(ar, 0);
			}
		}
	}

	private static void printSubArrayIndexesWithSumZero(int ar[], int givenSum) {
		int counter = 0;
		int currentSum = ar[0];
		int startIndex = 0;
		int endIndex = 0;
		if (currentSum == givenSum) {
			// System.out.println(startIndex + 1 + " " + (endIndex + 1));
			counter++;
		}
		for (int i = 1; i < ar.length; i++) {
			if (currentSum + ar[i] == givenSum) {
				endIndex = i;
				// System.out.println(startIndex + 1 + " " + (endIndex + 1));
				counter++;
				// return;
			} else if (currentSum + ar[i] < givenSum) {
				currentSum += ar[i];
			} else if (currentSum + ar[i] > givenSum) {
				while (currentSum + ar[i] > givenSum) {
					currentSum -= ar[startIndex];
					startIndex++;
				}
				if (currentSum + ar[i] == givenSum) {
					endIndex = i;
					// System.out.println(startIndex + 1 + " " + (endIndex + 1));
					counter++;
					// return;
				}
				currentSum += ar[i];
			}
		}
		System.out.println(counter);
	}
}

//output
//1
//17 415
//186 76 66 87 231 227 193 217 230 170 253 210 167 116 196 34 29