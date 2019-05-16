package arraysGFG;

import java.util.*;

class IshaanLoveChocolate {
	static int lastChocSquare(int a[], int n) {
		int start = 0;
		int end = n - 1;
		for (int j = 0; j < n - 1; j++) {
			for (int i = start; i <= end; i++) {
				if (a[start] > a[end]) {
					start++;
				} else {
					end--;
				}
			}

			if (start == end)

			{
				break;
			}
		}
		return start;
	}

	public static void main(String[] args) {

		// Taking input using scanner class
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		while (testcase-- > 0) {
			int n = sc.nextInt();

			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			System.out.println(a[lastChocSquare(a, n)]);
		}
		sc.close();
	}
}
