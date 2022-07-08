package dp_gfg;
//Target Sum 
//Medium Accuracy: 39.89% Submissions: 9136 Points: 4
//Given an array of integers A[] of length N and an integer target.
//You want to build an expression out of A by adding one of the symbols '+' and '-' before each integer in A and then concatenate all the integers.
//
//For example, if arr = {2, 1}, you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
//Return the number of different expressions that can be built, which evaluates to target.
//
//
//Example 1:
//
//Input:
//N = 5
//A[] = {1, 1, 1, 1, 1}
//target = 3
//Output:
//5
//Explanation:
//There are 5 ways to assign symbols to 
//make the sum of nums be target 3.
//-1 + 1 + 1 + 1 + 1 = 3
//+1 - 1 + 1 + 1 + 1 = 3
//+1 + 1 - 1 + 1 + 1 = 3
//+1 + 1 + 1 - 1 + 1 = 3
//+1 + 1 + 1 + 1 - 1 = 3
//
//Example 2:
//
//Input:
//N = 1
//A[] = {1}
//target = 1
//Output:
//1
//
//Your Task:
//The task is to complete the function findTargetSumWays() which finds and returns the number of different expressions that can be built.
//
// 
//
//Expected Time Complexity: O(N*sum), where sum refers to the range of sum possible.
//Expected Auxiliary Space: O(N).
//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class TargetSum_Expression_Building {
 public static void main(String args[]) throws IOException {
     BufferedReader read =
         new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(read.readLine());
     while (t-- > 0) {
         int N = Integer.parseInt(read.readLine());
         
         String S[] = read.readLine().split(" ");
         
         int[] A = new int[N];
         
         for(int i=0 ; i<N ; i++){
             A[i] = Integer.parseInt(S[i]);
         }
         int target = Integer.parseInt(read.readLine());

         TS ob = new TS();
         System.out.println(ob.findTargetSumWays(A,N, target));
     }
 }
}// } Driver Code Ends


//User function Template for Java

class TS {
 static int findTargetSumWays(int[] arr , int n, int tar) {
     // code here
     // Subset1 + subset2 = total sum --> eq1
     // Subset1 - Subset2 = diff --> eq2
     // therefore, subset1 = (total sum + diff) / 2
     
     // here target is equal to diff
     // because this problem eventually reduces to the problem which gives 
     // the count of subsets with the given difference
     int s = 0;
     for(int i=0; i<n; i++)
     {
         s+=arr[i];
     }
     if((tar+s)%2 != 0) return 0;
     if(s == 0 && tar==0) return (int)Math.pow(2,n);
     if(s==1 && tar == 1) return (int)Math.pow(2,n-1);
     int s1 = (tar + s)/2;
     
     
     
     int[][] dp = new int[n+1][s1+1];
     
     for(int i=0; i<dp.length; i++)
     {
         for(int j=0; j<dp[0].length; j++)
         {
             if(i==0 && j==0)
             {
                 dp[i][j] = 1;
             }
             else if(i==0)
             {
                 dp[i][j] = 0;
             }
             else if(j==0)
             {
                 dp[i][j] = 1;
             }
             else
             {
                 int val = arr[i-1];
                 if(j>=val)
                     dp[i][j] = dp[i-1][j] + dp[i-1][j-val];
                 else
                     dp[i][j] = dp[i-1][j];
             }
         }
     }
     
     return dp[n][s1];
     
 }
};