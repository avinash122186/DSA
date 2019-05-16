package arraysGFG;

import java.util.*;
//Position this line where user code will be pasted.
// Driver class
class MatrixInterchange {
    
    // Driver code
	public static void main (String[] args) {
	    
	    // Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int rows = sc.nextInt();
            int cols = sc.nextInt();
		    int a[][] = new int[rows][cols];
		    
		    for(int i = 0;i<rows;i++){
		        for(int j = 0;j<cols;j++){
		            a[i][j] = sc.nextInt();
		        }
		    }
		    
		    Geeks obj = new Geeks();
		    obj.interchange(a, rows, cols);
		}
		sc.close();
	}
}

	class Geeks{
	    
	     void interchange(int a[][],int r, int c){
	        
	        for(int j=0;j<r;j++)
	        {
	        		int temp = a[j][0];
	        		a[j][0] = a[j][c-1];
	        		a[j][c-1]=temp;
	        }
	        
	        for(int i = 0;i<r;i++){
	            for(int j = 0;j<c;j++){
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();
	        } 
	    }
	}
