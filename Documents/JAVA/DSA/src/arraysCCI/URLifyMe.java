package arraysCCI;

import java.util.Scanner;

public class URLifyMe {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		sc.close();
		usingStringBuilder(s);
	}

//	private static void normal(String s)
//	{
//		int space = 0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)==' ')
//			{
//				space++;
//			}
//		}
//		int nl = s.length() + space*2;
//		str
//		for(int i = nl -1;i>0;i--)
//		{
//			if(s.charAt(i) == ' ')
//			{
//				 
//			}
//		}
//		
//	}
	private static void usingStringBuilder(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				sb.append("%20");
			}
			else
			{
				sb.append(s.charAt(i));
			}
		}
		
		System.out.println("URLified String is "+sb.toString());
	}

}
