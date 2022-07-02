package tcs_advanced_coding;
import java.util.*;
public class FInd_third_largest_element {
	public static void main(String args[])
	{
		int n = 5;
		int[] a= {2,4,1,3,5};
		
		int first = a[0];
	    for (int i = 1; i < n ; i++)
	        if (a[i] > first)
	        	first = a[i];

	    // Find second 
	    // largest element
	    int second = Integer.MIN_VALUE;
	    for (int i = 0; i < n; i++)
	        if (a[i] > second && a[i] < first)
	            second = a[i];

	    // Find third
	    // largest element
	    int third = Integer.MIN_VALUE;
	    for (int i = 0; i < n ; i++)
	    {
	        if (a[i] > third && a[i] < second)
	            third = a[i];
	                 
	     }
	    System.out.println(third);
	}

}
