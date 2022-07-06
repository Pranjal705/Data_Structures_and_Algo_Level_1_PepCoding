package tcs_advanced_coding;

//Gold Mine Problem 
//Easy Accuracy: 51.7% Submissions: 37691 Points: 2
//Given a gold mine called M of (n x m) dimensions. Each field in this mine contains a positive integer which is the amount of gold in tons. Initially the miner can start from any row in the first column. From a given cell, the miner can move
//
//to the cell diagonally up towards the right 
//to the right
//to the cell diagonally down towards the right
//Find out maximum amount of gold which he can collect.
//
//
//Example 1:
//
//Input: n = 3, m = 3
//M = {{1, 3, 3},
//     {2, 1, 4},
//     {0, 6, 4}};
//Output: 12
//Explaination: 
//The path is {(1,0) -> (2,1) -> (2,2)}.
//
//Example 2:
//
//Input: n = 4, m = 4
//M = {{1, 3, 1, 5},
//     {2, 2, 4, 1},
//     {5, 0, 2, 3},
//     {0, 6, 1, 2}};
//Output: 16
//Explaination: 
//The path is {(2,0) -> (3,1) -> (2,2) 
//-> (2,3)} or {(2,0) -> (1,1) -> (1,2) 
//-> (0,3)}.
//
//Your Task:
//You do not need to read input or print anything. Your task is to complete the function maxGold() which takes the values n, m and the mine M as input parameters and returns the maximum amount of gold that can be collected.
//
//
//Expected Time Complexity: O(n*m)
//Expected Auxiliary Space: O(n*m)
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GoldmineProblem_dp{
 public static void main(String args[])throws IOException
 {
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(in.readLine());
     while(t-- > 0){
         String inline[] = in.readLine().trim().split("\\s+");
         int n = Integer.parseInt(inline[0]);
         int m = Integer.parseInt(inline[1]);
         String inline1[] = in.readLine().trim().split("\\s+");
         int M[][] = new int[n][m];
         for(int i = 0;i < n*m;i++){
             M[i/m][i%m] = Integer.parseInt(inline1[i]);
         }
         
         Goldmine ob = new Goldmine();
         System.out.println(ob.maxGold(n, m, M));
     }
 }
} // } Driver Code Ends


//User function Template for Java

class Goldmine{
 static int maxGold(int n, int m, int mine[][])
 {
     // code here
     if(n == 1)
     {
         int sum = 0;
         for(int j=m-1; j>=0; j--)
         {
             sum+=mine[0][j];
         }
         return sum;
     }
     int[][] dp = new int[n][m];

     
     for(int j=m-1; j>=0; j--)
     {
         for(int i=n-1; i>=0; i--)
         {
             if(j==m-1)
             {
                 dp[i][j] = mine[i][j];
             }
             else if(i==0)
             {
                 dp[i][j] = mine[i][j] + Math.max(dp[i+1][j+1],dp[i][j+1]);
             }
             else if(i==n-1)
             {
                 dp[i][j] = mine[i][j] + Math.max(dp[i-1][j+1],dp[i][j+1]);
             }
             else
             {
                 dp[i][j] = mine[i][j] + Math.max(Math.max(dp[i+1][j+1],dp[i][j+1]),dp[i-1][j+1]);
             }
         }
     }
     int max  = Integer.MIN_VALUE;
     for(int i=0; i<n; i++)
     {
         if(dp[i][0] > max)
             max = dp[i][0];
     }
     // for(int i=0; i<n; i++)
     // {
     //     for(int j=0; j<m; j++)
     //     {
     //         System.out.print(dp[i][j] + " ");
     //     }
     //     System.out.println();
     // }
     // System.out.println(max);
     return max;
 }
}