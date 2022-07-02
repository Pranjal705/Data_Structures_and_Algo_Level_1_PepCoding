package tcs_advanced_coding;

//Third largest element 
//Basic Accuracy: 46.52% Submissions: 58808 Points: 1
//Given an array of distinct elements. Find the third largest element in it.
//
//Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be 5 because it is the 3 largest element in the array A.
//
//Example 1:
//
//Input:
//N = 5
//A[] = {2,4,1,3,5}
//Output: 3
//Example 2:
//
//Input:
//N = 2
//A[] = {10,2}
//Output: -1
//Your Task:
//Complete the function thirdLargest() which takes the array a[] and the size of the array, n, as input parameters and returns the third largest element in the array. It return -1 if there are less than 3 elements in the given array.
//
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)
//
//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class Third_largest_element
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			T g = new T();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}// } Driver Code Ends


class T
{
 int thirdLargest(int a[], int n)
 {
	    // Your code her

 // Find first 
 // largest element
	 if(n<3)
     {
         return -1;
     }
 int first = a[0];
 for (int i = 1;
          i < n ; i++)
     if (a[i] > first)
         first = a[i];

 // Find second 
 // largest element
 int second = Integer.MIN_VALUE;
 for (int i = 0; 
          i < n; i++)
     if (a[i] > second && 
         a[i] < first)
         second = a[i];

 // Find third
 // largest element
 int third = Integer.MIN_VALUE;
 for (int i = 0; 
          i < n ; i++)
          {
     if (a[i] > third && 
         a[i] < second)
         third = a[i];
              
          }
return third;
 }
}
