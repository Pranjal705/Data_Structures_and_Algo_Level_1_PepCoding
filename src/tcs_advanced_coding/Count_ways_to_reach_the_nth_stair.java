package tcs_advanced_coding;
//{ Driver Code Starts
import java.io.*;
import java.util.*;

//There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top (order does matter).
//
//Example 1:
//
//Input:
//n = 4
//Output: 5
//Explanation:
//You can reach 4th stair in 5 ways. 
//Way 1: Climb 2 stairs at a time. 
//Way 2: Climb 1 stair at a time.
//Way 3: Climb 2 stairs, then 1 stair
//and then 1 stair.
//Way 4: Climb 1 stair, then 2 stairs
//then 1 stair.
//Way 5: Climb 1 stair, then 1 stair and
//then 2 stairs.
//Example 2:
//
//Input:
//n = 10
//Output: 89 
//Explanation: 
//There are 89 ways to reach the 10th stair.
//Your Task:
//Complete the function countWays() which takes the top stair number m as input parameters and returns the answer % 10^9+7.
//
//Expected Time Complexity : O(n)
//Expected Auxiliary Space: O(1)
class Count_ways_to_reach_the_nth_stair {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    StairCount obj = new StairCount();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}// } Driver Code Ends


class StairCount
{
 //Function to count number of ways to reach the nth stair.
 // Recursive approach
 // int countWays(int n)
 // {
 //     if(n<=0)
 //     {
 //         if(n==0)
 //             return 1;
 //         return 0;
             
 //     }
 //     int count1 = countWays(n-1);
 //     int count2 = countWays(n-2);
     
 //     return count1+count2;
 // }
 long countWays(int n)
 {
     long[] dp = new long[n+1];
     
     dp[0] = 1;
     for(int i=1; i<=n; i++)
     {
         if(i == 1)
         {
             dp[i] = dp[i-1];
         }
         else
         {
             dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
         }
     }
     
     return dp[n] % 1000000007;
     
     
     
 }
}

