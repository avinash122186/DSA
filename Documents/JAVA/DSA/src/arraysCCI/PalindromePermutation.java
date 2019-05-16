package arraysCCI;

import java.util.Scanner;

public class PalindromePermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		sc.close();
		palinPermu(s);
	}

	private static void palinPermu(String s) {

		int[] letters = new int[128];

		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);
			letters[val]++;
		}
		boolean flag = true;
		if (s.length() % 2 == 0) {
			for (int i = 0; i < 128; i++) {
				if (!(letters[i] % 2 == 0)) {
					flag = false;
					break;
				}
			}
		} else {
			int count = 0;
			for (int i = 0; i < 128; i++) {
				if (!(letters[i] % 2 == 0) && count < 2) {
					count++;
				}
			}
			if (count > 1) {
				flag = false;
			} else {
				flag = true;
			}
		}

		System.out.println(s + " is Permutation of Palindrome ? :" + flag);
	}

}
