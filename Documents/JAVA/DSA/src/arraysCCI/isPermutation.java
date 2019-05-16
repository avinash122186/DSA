package arraysCCI;

import java.util.Scanner;

public class isPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1");
		String test1 = sc.nextLine();
		System.out.println("Enter the String2");
		String test2 = sc.nextLine();
		boolean flag = true;
		if(test1.length() != test2.length())
		{
			flag = false;
		}
		int charSet[] = new int[128];
		char[] s = test1.toCharArray();
 		for(char c : s)
		{
			charSet[c]++;
		}
 		for(int i=0;i<test2.length();i++)
 		{
 			int x = test2.charAt(i);
 			charSet[x]--;
 			if(charSet[x] < 0)
 			{
 				flag =false;
 			}
 		}
 		
		sc.close();
		System.out.println(test1+" and "+test2+" are permutation of each other ? : "+flag);
		

	}

}
