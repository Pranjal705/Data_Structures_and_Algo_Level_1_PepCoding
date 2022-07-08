package dp_gfg;

//Count number of hops 
//Easy Accuracy: 46.41% Submissions: 39583 Points: 2
//Lamp
//This problem is part of GFG SDE Sheet. Click here to view more.   
//A frog jumps either 1, 2, or 3 steps to go to the top. In how many ways can it reach the top. As the answer will be large find the answer modulo 1000000007.
//
//Example 1:
//
//Input:
//N = 1
//Output: 1
//Example 2:
//
//Input:
//N = 4
//Output: 7
//Explanation:Below are the 7 ways to reach
//4
//1 step + 1 step + 1 step + 1 step
//1 step + 2 step + 1 step
//2 step + 1 step + 1 step
//1 step + 1 step + 2 step
//2 step + 2 step
//3 step + 1 step
//1 step + 3 step
//Your Task:
//Your task is to complete the function countWays() which takes 1 argument(N) and returns the answer%(10^9 + 7).
//
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).
//

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Count_Number_of_Hops
{
 public static void main(String args[])
 {
     //taking input using Scanner class
     Scanner sc = new Scanner(System.in);
     
     //taking number of testcases
     int t = sc.nextInt();
     
     while(t-- > 0)
     {
         //taking number of steps in stair
         int n = sc.nextInt();
         
         //calling method countWays() of class Hops
         System.out.println(new Stairpaths().countWays(n));
         
     }
 }
}
//} Driver Code Ends


//User function Template for Java


class Stairpaths
{
 //Function to count the number of ways in which frog can reach the top.
 static long countWays(int n)
 {
     // ith place in dp tell the no. of ways to reach to ith position from 0th
     // position
     long[] dp = new long[n+1];
     dp[0] = 1;
     for(int i=1; i<=n; i++)
     {
         if(i == 1)
             dp[i] = dp[i-1] % 1000000007;
         else if(i == 2)
             dp[i] = (dp[i-1] + dp[i-2])% 1000000007;
         else
         dp[i] = (dp[i-1] + dp[i-2] + dp[i-3])% 1000000007;
     }
     return dp[n] % 1000000007;
 }
 
}


