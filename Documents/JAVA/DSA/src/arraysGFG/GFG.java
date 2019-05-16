package arraysGFG;

import java.util.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
		int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			GFG gfg = new GFG();
			int res = gfg.findZeros(arr);
			System.out.println(res);
		}
		sc.close();
	 }
	 public int findZeros(int arr[]) {
	     int x =0;
	     int rex =0;
		for (int i = 0; i < arr.length; i++) 
		{
		    if(arr[i] == 0)
		    {
		        x = i;
		         rex = arr.length-x;
		         break;
		    }
		}
		
		return rex;
		}
		
	}

