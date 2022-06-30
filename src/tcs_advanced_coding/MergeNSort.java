package tcs_advanced_coding;
//Merge and Sort 
//Basic Accuracy: 46.97% Submissions: 1537 Points: 1
//Given two arrays of length N and M, print the merged array in ascending order containing only unique elements.
//
//Example 1:
//
//Input:
//N = 2
//a[] = {1, 8}
//M = 2
//b[] = {10, 11}
//Output:
//answer[] = {1, 8, 10, 11}
//Explanation:
//The answer[] array after merging both
//the arrays and removing duplicates is
//[1 8, 10, 11]
//You have to return the size of the array
//formed ( 4 in this case) and update the
//answer array in the function mergeNsort().
// 
//
//Example 2:
//
//Input:
//N = 5
//a[] = {7, 1, 5, 3, 9}
//M = 6
//b[]  = {8, 4, 3, 5, 2, 6}
//Output:
//answer[] = {1, 2, 3, 4, 5, 6, 7, 8, 9} 
// 
//
//Your Task:  
//You don't need to read input or print anything. Your task is to complete the function mergeNsort() which takes the array A[], B[] and its size N, M respectively as inputs and returns the size of this array and store the merged array sorted in ascending order in the answer[].
import java.util.*;
import java.io.*;

class MergeNSort {
	public static void main(String[] args) throws IOException
	{
		
		Scanner sc = new Scanner(System.in);
	       
            int n = sc.nextInt();
            int a[] = new int[n+5];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int m = sc.nextInt();
            int b[] = new int[m+5];
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            
            
            int answer[] = new int[n+m+5];
            
            Solution obj = new Solution();
            int k=obj.mergeNsort(a, b, n, m, answer);
            StringBuilder output = new StringBuilder();
            for(int i=0;i<k;i++)
            output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}



class Solution {

    public static int mergeNsort(int a[], int b[], int n, int m, int answer[])
    {
        // Write your code here;
        boolean[] visited = new boolean[10000];
        for(int i=0; i<n; i++)
        {
            visited[a[i]] = true;
        }
        for(int i=0; i<m; i++)
        {
            visited[b[i]] = true;
        }
        
        int index = 0;
        
        for(int i=0; i< 10000; i++)
        {
            if(visited[i])
            {
                answer[index++] = i;
            }
        }
        return index;
    }
}

