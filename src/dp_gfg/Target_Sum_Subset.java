package dp_gfg;
//Subset Sum Problem 
//Medium Accuracy: 51.38% Submissions: 73253 Points: 4
//Given an array of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum. 
//
//
//Example 1:
//
//Input:
//N = 6
//arr[] = {3, 34, 4, 12, 5, 2}
//sum = 9
//Output: 1 
//Explanation: Here there exists a subset with
//sum = 9, 4+3+2 = 9.
//Example 2:
//
//Input:
//N = 6
//arr[] = {3, 34, 4, 12, 5, 2}
//sum = 30
//Output: 0 
//Explanation: There is no subset with sum 30.
//
//Your Task:  
//You don't need to read input or print anything. Your task is to complete the function isSubsetSum() which takes the array arr[], its size N and an integer sum as input parameters and returns boolean value true if there exists a subset with given sum and false otherwise.
//The driver code itself prints 1, if returned value is true and prints 0 if returned value is false.
// 
//
//Expected Time Complexity: O(sum*N)
//Expected Auxiliary Space: O(sum*N)
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Target_Sum_Subset
{
 public static void main(String args[])throws IOException
 {
     BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(read.readLine());
     while(t-- > 0)
     {
         int N = Integer.parseInt(read.readLine());
         String input_line[] = read.readLine().trim().split("\\s+");
         int arr[]= new int[N];
         for(int i = 0; i < N; i++)
             arr[i] = Integer.parseInt(input_line[i]);
         int sum = Integer.parseInt(read.readLine());

         Subset ob = new Subset();
         if(ob.isSubsetSum(N, arr, sum))
         System.out.println(1);
         else
         System.out.println(0);

         
     }
 }
}
//} Driver Code Ends


//User function Template for Java

class Subset{


 static Boolean isSubsetSum(int n, int arr[], int sum){
     // code here
     boolean[][] dp = new boolean[n+1][sum+1];
     
     for(int i=0; i<dp.length; i++)
     {
         for(int j=0; j<dp[0].length; j++)
         {
             if(i==0 && j==0)
                 dp[i][j] = true;
             else if(j==0)
                 dp[i][j] = true;
             else if(i==0)
                 dp[i][j] = false;
             else
             {
                 if(dp[i-1][j] == true)
                     dp[i][j] = true;
                 else
                 {
                    int val = arr[i-1];
                    if(j>=val)
                    {
                        if(dp[i-1][j-val] == true)
                         dp[i][j] = true;
                    }
                 }
             }
         }
         
     }
     return dp[n][sum];
 }
}