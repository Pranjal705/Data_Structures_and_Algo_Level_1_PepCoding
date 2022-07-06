package tcs_advanced_coding;
//Maximum path sum in matrix 
//Medium Accuracy: 50.83% Submissions: 32791 Points: 4
//Lamp
//This problem is part of GFG SDE Sheet. Click here to view more.   
//Given a NxN matrix of positive integers. There are only three possible moves from a cell Matrix[r][c].
//
//Matrix [r+1] [c]
//Matrix [r+1] [c-1]
//Matrix [r+1] [c+1]
//Starting from any column in row 0 return the largest sum of any of the paths up to row N-1.
//
//Example 1:
//
//Input: N = 2
//Matrix = {{348, 391},
//          {618, 193}}
//Output: 1009
//Explaination: The best path is 391 -> 618. 
//It gives the sum = 1009.
//
//Example 2:
//
//Input: N = 2
//Matrix = {{2, 2},
//          {2, 2}}
//Output: 4
//Explaination: No matter which path is 
//chosen, the output is 4.
//
//Your Task:
//You do not need to read input or print anything. Your task is to complete the function maximumPath() which takes the size N and the Matrix as input parameters and returns the highest maximum path sum.
//
//
//Expected Time Complexity: O(N*N)
//Expected Auxiliary Space: O(N*N)
//

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Maximum_path_sum_in_matrix
{
 public static void main(String args[])throws IOException
 {
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(in.readLine());
     while(t-- > 0){
         int N = Integer.parseInt(in.readLine());
         String input_line[] = in.readLine().trim().split("\\s+");
         int Matrix[][] = new int[N][N];
         for(int i = 0; i < N*N; i++)
             Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
         
         Matrix ob = new Matrix();
         System.out.println(ob.maximumPath(N, Matrix));
     }
 }
}
//} Driver Code Ends


//User function Template for Java

class Matrix{
 static int maximumPath(int n, int a[][])
 {
     // code here
     int[][] dp = new int[n][n];
     
     for(int i=n-1; i>=0; i--)
     {
         for(int j=n-1; j>=0; j--)
         {
             if(i==n-1)
             {
                 dp[i][j] = a[i][j];
             }
             else if(j==n-1)
             {
                 dp[i][j] = a[i][j] + Math.max(dp[i+1][j],dp[i+1][j-1]);
             }
             else if(j==0)
             {
                 dp[i][j] = a[i][j] + Math.max(dp[i+1][j],dp[i+1][j+1]);
             }
             else
             {
                 dp[i][j] = a[i][j] + Math.max(Math.max(dp[i+1][j],dp[i+1][j+1]),dp[i+1][j-1]);
             }
         }
     }
     int answer = Integer.MIN_VALUE;
     for(int i=0; i<n; i++)
     {
         if(dp[0][i] > answer)
             answer = dp[0][i];
     }
     return answer;
 }
}