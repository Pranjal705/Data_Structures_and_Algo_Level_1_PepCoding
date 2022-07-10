package sorting_gfg;
//Merge Sort 
//Medium Accuracy: 41.46% Submissions: 88207 Points: 4
//Lamp
//This problem is part of GFG SDE Sheet. Click here to view more.   
//Given an array arr[], its starting position l and its ending position r. Sort the array using merge sort algorithm.
//Example 1:
//
//Input:
//N = 5
//arr[] = {4 1 3 9 7}
//Output:
//1 3 4 7 9
//Example 2:
//
//Input:
//N = 10
//arr[] = {10 9 8 7 6 5 4 3 2 1}
//Output:
//1 2 3 4 5 6 7 8 9 10
//
//Your Task:
//You don't need to take the input or print anything. Your task is to complete the function merge() which takes arr[], l, m, r as its input parameters and modifies arr[] in-place such that it is sorted from position l to position r, and function mergeSort() which uses merge() to sort the array in ascending order using merge sort algorithm.
//
//Expected Time Complexity: O(nlogn) 
//Expected Auxiliary Space: O(n)
//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
 //method to print the elements of the array
	static void printArray(int arr[])
 {
     StringBuffer sb=new StringBuffer("");
     int n = arr.length;
     for (int i=0; i<n; ++i)
         sb.append(arr[i]+" ");
     System.out.println(sb.toString());
 }

 

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

         
			Merge_Sort_Solution g = new Merge_Sort_Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

         //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}


//} Driver Code Ends


class Merge_Sort_Solution
{
 void merge(int arr[], int l, int m, int r)
 {
      // Your code here
     //  int i=l, j=m+1, k = l;
     //  int[] c = new int[r+1];
      
     //  while(i<=m && j<=r)
     //  {
     //     if(arr[i]<=arr[j])
     //         c[k++] = arr[i++];
     //     else
     //         c[k++] = arr[j++];
     //  }
      
     //  if(j>r)
     //  {
     //      while(i<=m)
     //      {
     //          c[k] = arr[i];
     //          i++;
     //          k++;
     //      }
     //  }
     //  else if(i>m)
     //  {
     //      while(j<=r)
     //      {
     //          c[k] = arr[j];
     //          j++;
     //          k++;
     //      }
     //  }
     //  for(int start=l; start<=r; start++)
     //  {
     //      arr[start] = c[start];
     //  }
     int n1 = m - l + 1;
     int n2 = r - m;

     /* Create temp arrays */
     int L[] = new int[n1];
     int R[] = new int[n2];

     /*Copy data to temp arrays*/
     for (int i = 0; i < n1; ++i)
         L[i] = arr[l + i];
     for (int j = 0; j < n2; ++j)
         R[j] = arr[m + 1 + j];

     /* Merge the temp arrays */

     // Initial indexes of first and second subarrays
     int i = 0, j = 0;

     // Initial index of merged subarray array
     int k = l;
     while (i < n1 && j < n2) {
         if (L[i] <= R[j]) {
             arr[k] = L[i];
             i++;
         }
         else {
             arr[k] = R[j];
             j++;
         }
         k++;
     }

     /* Copy remaining elements of L[] if any */
     while (i < n1) {
         arr[k] = L[i];
         i++;
         k++;
     }

     /* Copy remaining elements of R[] if any */
     while (j < n2) {
         arr[k] = R[j];
         j++;
         k++;
     }
      
 }
 void mergeSort(int arr[], int l, int r)
 {
     if(l<r)
     {
         
         int m = (l+(r-1))/2;
         mergeSort(arr, l, m);
         mergeSort(arr, m+1, r);
         merge(arr, l, m, r);
     }
     
 }
}
