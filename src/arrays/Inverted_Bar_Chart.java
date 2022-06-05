package arrays;

//1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing elements of array a.
//3. You are required to print an inverted bar chart representing value of arr a.

//Sample Input
//5
//3
//1
//0
//7
//5
//Sample Output
//*	*		*	*	
//*			*	*	
//*			*	*	
//			*	*	
//			*	*	
//			*		
//			*	
import java.util.Scanner;

public class Inverted_Bar_Chart {
	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int[] arr = new int[n];
	    
	    for(int i = 0; i< n; i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    // finding max
	    
	    int max = Integer.MIN_VALUE;
	    
	    for(int i = 0; i<n; i++)
	    {
	        if(arr[i] > max)
	        {
	            max = arr[i];
	        }
	    }
	    
	    for(int i=0; i<max; i++)
	    {
	        for(int j = 0; j<n; j++)
	        {
	            if(arr[j]>i)
	            {
	                System.out.print("*\t");
	            }
	            else
	            {
	                System.out.print("\t");
	            }
	        }
	        System.out.println();
	    }
	  }
}
