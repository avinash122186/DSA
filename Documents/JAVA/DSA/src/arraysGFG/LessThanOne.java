package arraysGFG;

import java.util.HashMap;
import java.util.Scanner;

public class LessThanOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		HashMap<Integer, Integer> fr = new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			if(fr.containsKey(a[i]))
			{
				fr.put(a[i], fr.get(a[i])+1);
			}
			else
			{
				fr.put(a[i], 1);
			}
		}
		
		int ans =0;
		for (Integer key : fr.keySet())  
        {  
            if(fr.containsKey(key+1))  
                ans = Math.max(ans, fr.get(key) + fr.get(key+1));  
        } 
		
		System.out.println("Count : "+ans );
	}

}
