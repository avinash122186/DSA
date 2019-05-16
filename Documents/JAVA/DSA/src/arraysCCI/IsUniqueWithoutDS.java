package arraysCCI;

import java.util.Scanner;

public class IsUniqueWithoutDS {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String test = sc.nextLine();
		sc.close();
		boolean flag = true;
		for(int i=0;i<test.length();i++)
		{
			for(int j=i+1;j<test.length();j++)
			{
				if(test.charAt(i) == test.charAt(j))
				{
					flag =false;
				}
			}
			
		}
		System.out.println("Is String Unique : "+flag);
	}

}
