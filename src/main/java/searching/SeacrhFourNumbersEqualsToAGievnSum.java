package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SeacrhFourNumbersEqualsToAGievnSum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int number_of_test_cases = Integer.parseInt(br.readLine());
		for (int i = 0; i < number_of_test_cases; i++) {
			String[] strs1 = br.readLine().trim().split("\\s+");
			int number_of_elements = Integer.parseInt(strs1[0]);
			int sum = Integer.parseInt(strs1[1]);
			int ar[] = new int[number_of_elements];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int j = 0; j < number_of_elements; j++) {
				ar[j] = Integer.parseInt(strs[j]);
			}
			findQuadruple(ar, sum);
		}
	}

	static class Pair implements Comparable<Pair> {
		int first, second, sum;

		Pair(int first, int second, int sum) {
			this.first = first;
			this.second = second;
			this.sum = sum;
		}

		@Override
		public int compareTo(Pair pair) {
			return this.sum - pair.sum;
		}

	}

	protected static void findQuadruple(int ar[], int sum) {

		StringBuilder sb = new StringBuilder();
		Pair pair[] = new Pair[ar.length * (ar.length - 1) / 2];
		int count = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				pair[count] = new Pair(ar[i], ar[j], ar[i] + ar[j]);
				count++;
			}
		}
		Arrays.sort(pair);
//		int temp = 0;
//		for (Pair p : pair) {
//			System.out.println("index= " + temp++ + " " + p.first + " " + p.second + " " + p.sum);
//		}
		int beg = 0;
		int end = pair.length - 1;
		while (beg < ar.length - 1 && end >= 0) {

			if (pair[beg].sum + pair[end].sum == sum && noCommon(pair[beg], pair[end])) {
				StringBuilder toAdd = getString(pair[beg], pair[end]);
				if (!sb.toString().contains(toAdd)) {
					sb.append(toAdd).append("$");
				}
				// beg++;
				end--;
			} else if (pair[beg].sum + pair[end].sum < sum) {
				beg++;
			} else
				end--;
		}
		if (sb.length() == 0) {
			System.out.println(-1);
		} else
			System.out.println(sb);

	}

	private static boolean noCommon(Pair pair, Pair pair2) {
		return pair.first != pair2.first && pair.first != pair2.second && pair.second != pair2.first
				&& pair.second != pair2.second;
	}

	private static StringBuilder getString(Pair p1, Pair p2) {
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new LinkedList<>();
		list.add(p1.first);
		list.add(p1.second);
		list.add(p2.first);
		list.add(p2.second);
		Collections.sort(list);
		for (int i : list) {
			sb.append(i + " ");
		}
		return sb;

	}
}
