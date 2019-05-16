package arraysCCI;

import java.util.HashMap;
import java.util.Scanner;

public class CompressedStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		sc.close();
		
		int count =0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			count++;
			
			if(i+1 >=s.length() || s.charAt(i)!=s.charAt(i+1))
			{
				sb.append(s.charAt(i)+""+count);
				count =0;
			}
		}
		
		if(sb.toString().length()<s.length())
		{
			System.out.println(sb.toString());
		}
		else
		{
			System.out.println(s);
		}
	}

}
