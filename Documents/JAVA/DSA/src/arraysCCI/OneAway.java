package arraysCCI;

import java.util.Scanner;

public class OneAway {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String1");
		String s1 = sc.nextLine();
		System.out.println("Enter the String2");
		String s2 = sc.nextLine();
		sc.close();
		if(s1.length() == s2.length())
		{
		System.out.println("Is one Away "+OneEditReplace(s1, s2));
		}
		else if(s1.length() +1 == s2.length())
		{
		System.out.println("Is one Away "+oneEditInsert(s1, s2));
		}
		else if(s1.length()-1 == s2.length())
		{
			System.out.println("Is one Away "+oneEditInsert(s2, s1));
		}
		else
		{
			System.out.println("Both strings are different");
		}
	}

	private static boolean OneEditReplace(String s1, String s2) {
			boolean foundDifference = false;
			for(int i=0;i<s1.length();i++)
			{
					if(s1.charAt(i)!=s2.charAt(i))
					{
						if(foundDifference)
						{
							 return false;
						}
						foundDifference = true;
					}
			}
			return true;
	}
	
	private static boolean oneEditInsert(String s1, String s2)
	{
		int index1 =0;
		int index2 =0;
		while(index2 < s2.length() && index1 <s1.length())
		{
			if(s1.charAt(index1) != s2.charAt(index2))
			{
				if(index1 != index2)
				{
					return false;
				}
				index2++;
			}
			else
			{
				index1++;
				index2++;
			}
		}
		return true;
	}
	
}
