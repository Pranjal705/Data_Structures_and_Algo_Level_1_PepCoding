package tcs_advanced_coding;

//{ Driver Code Starts
//Initial Template for Java
//Segregate 0s and 1s 
//Easy Accuracy: 59.27% Submissions: 43763 Points: 2
//Given an array of length N consisting of only 0s and 1s in random order. Modify the array to segregate 0s on left side and 1s on the right side of the array.
//
//Example 1:
//
//Input:
//N = 5
//arr[] = {0, 0, 1, 1, 0}
//Output: 0 0 0 1 1
//
//Example 2:
//
//Input:
//N = 4
//Arr[] = {1, 1, 1, 1}
//Output: 1 1 1 1
//Explanation: There are no 0 in the given array, 
//so the modified array is 1 1 1 1.
//
//Your Task:
//You don't need to read input or print anything. Your task is to complete the function segregate0and1() which takes arr[] and n as input parameters and modifies arr[] in-place without using any extra memory.
//
//
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)
import java.io.*;
import java.util.*;

public class Segregate_0s_and_1s {

 public static void main(String[] args) throws Exception {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int tc = Integer.parseInt(br.readLine().trim());
     while (tc-- > 0) {
         String[] inputLine;
         inputLine = br.readLine().trim().split(" ");
         int n = Integer.parseInt(inputLine[0]);
         int[] arr = new int[n];
         inputLine = br.readLine().trim().split(" ");
         for (int i = 0; i < n; i++) {
             arr[i] = Integer.parseInt(inputLine[i]);
         }
         new Z().segregate0and1(arr, n);
         for (int i = 0; i < n; i++) {
             System.out.print(arr[i] + " ");
         }
         System.out.println();
     }
 }
}

//} Driver Code Ends


//User function Template for Java

class Z {
	void segregate0and1(int[] a, int n) {
        // code here
        int i= 0;
        int j= n-1;
        
        while(i<=j)
        {
            if(a[i] == 0)
            {
                i++;
            }
            else
            {
                swap(a, i, j);
                j--;
            }
        }
    }
    void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
