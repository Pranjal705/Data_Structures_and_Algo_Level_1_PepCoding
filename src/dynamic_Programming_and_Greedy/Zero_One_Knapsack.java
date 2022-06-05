package dynamic_Programming_and_Greedy;

import java.util.Scanner;

//1. You are given a number n, representing the count of items.
//2. You are given n numbers, representing the values of n items.
//3. You are given n numbers, representing the weights of n items.
//3. You are given a number "cap", which is the capacity of a bag you've.
//4. You are required to calculate and print the maximum value that can be created in the bag without 
//     overflowing it's capacity.
//
//Note -> Each item can be taken 0 or 1 number of times. You are not allowed to put the same item 
//               again and again.

//Sample Input
//5
//15 14 10 45 30
//2 5 1 3 4
//7
// Output
// 75

public class Zero_One_Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] vals = new int[n];
        
        int[] wts = new int[n];
        
        for(int i = 0; i<n; i++)
        {
            vals[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++)
        {
            wts[i] = sc.nextInt();
        }
        
        int cap = sc.nextInt();
        
        int[][] dp = new int[n+1][cap+1];
        
        for(int i=1; i<dp.length; i++)
        {
            for(int j=1; j<dp[0].length; j++)
            {
                if(j>=wts[i-1])
                {
                    int rCap = j - wts[i-1];
                    if(dp[i-1][rCap] + vals[i-1] > dp[i-1][j])
                    {
                        dp[i][j] = dp[i-1][rCap] + vals[i-1];
                    }
                    else
                    {
                        dp[i][j] = dp[i-1][j];
                    }
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][cap]);

	}

}
