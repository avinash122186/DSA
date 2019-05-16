package arraysGFG;

import java.util.Scanner;

class Height {
	int feet;
	int inches;

	Height(int feet, int inches) {
		this.feet = feet;
		this.inches = inches;
	}
}

public class MaximumStructArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			Height arr[] = new Height[n];
			for (int i = 0; i < n; i++) {
				int temp1 = sc.nextInt();
				int temp2 = sc.nextInt();
				arr[i] = new Height(temp1, temp2);
			}
			MaximumStructArray gfg = new MaximumStructArray();
			sc.close();
			int res = gfg.findMax(arr, n);
			System.out.println(res);
		}
	}

	public int findMax(Height arr[], int n) {
		int max = -1;
		int min;
		for (int i = 0; i < arr.length; i++) {
			min = arr[i].feet * 12 + arr[i].inches;
			if (max < min) {
				max = min;
			}
		}
		return max;
	}
}
