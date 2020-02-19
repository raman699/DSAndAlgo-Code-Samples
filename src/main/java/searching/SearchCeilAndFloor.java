package searching;

public class SearchCeilAndFloor {

	public static void main(String... s) {
		int ar[] = { 1, 2, 8, 10, 12, 13, 19 };
		System.out.println(ceilSearch(ar, 0, ar.length - 1, 5));
	}

	protected static int ceilSearch(int ar[], int beg, int end, int x) {

		int mid = (beg + end) / 2;

		if (ar[mid] == x) {
			return mid;
		} else if (x <= ar[beg]) {
			return beg;
		} else if (x > ar[end]) {
			return -1;
		} else if (x > ar[mid]) {
//			if (mid + 1 <= end && x <= ar[mid + 1])
//				return mid + 1;
			return ceilSearch(ar, mid + 1, end, x);
		} else if (x < ar[mid]) {
			if (mid - 1 >= beg && x > ar[mid - 1])
				return mid;
			return ceilSearch(ar, beg, mid - 1, x);
		}
		return -1;
	}

	protected static int floorSearch(int ar[], int beg, int end, int x) {

		int mid = (beg + end) / 2;

		if (ar[mid] == x) {
			return mid;
		} else if (x < ar[beg]) {
			return -1;
		} else if (x >= ar[end]) {
			return end;
		} else if (x > ar[mid]) {
			if (mid + 1 < end && x < ar[mid + 1])
				return mid;
			return floorSearch(ar, mid + 1, end, x);
		} else if (x < ar[mid]) {
			return floorSearch(ar, beg, mid - 1, x);
		}
		return -1;
	}
}
