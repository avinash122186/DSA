package arraysGFG;

import java.util.Scanner;

public class SumOfBitDifference {
	
	public static int countSetBit(int n)
	{
		int count =0;
		while(n > 0)
		{
			count += n & 1;
			n >>= 1;
		}
		return count;
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

		int t;
		t=s.nextInt();
		while(t-- >0){
		int n=s.nextInt();
		int a[]=new int[n];

		for(int i=0;i<n;i++) 
		{
			a[i]=s.nextInt(); 
		}
		int x;
		int sum =0;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++)
			{
				x = a[i]^a[j];
				sum += countSetBit(x);
			}
		}
		System.out.println(sum);
	}
		s.close();
	}
}
	