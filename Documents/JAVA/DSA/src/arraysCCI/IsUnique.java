package arraysCCI;

import java.util.Scanner;

public class IsUnique {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String test = sc.nextLine();
		sc.close();
		boolean flag = true;
		boolean[] charset = new boolean[128];
		for(int i=0;i<test.length();i++)
		{
			int val = test.charAt(i);
			if(charset[val])
			{
				flag = false;
			}
			charset[val] = true;
			
		}
		System.out.println("Is String Unique : "+flag);
	}

}
