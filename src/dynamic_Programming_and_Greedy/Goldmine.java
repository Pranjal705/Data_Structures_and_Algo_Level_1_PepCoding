package dynamic_Programming_and_Greedy;

import java.util.Scanner;

public class Goldmine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. You are given a number n, representing the number of rows.
//		2. You are given a number m, representing the number of columns.
//		3. You are given n*m numbers, representing elements of 2d array a, which represents a gold mine.
//		4. You are standing in front of left wall and are supposed to dig to the right wall. You can start from 
//		     any row in the left wall.
//		5. You are allowed to move 1 cell right-up (d1), 1 cell right (d2) or 1 cell right-down(d3).
		Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        
	        int[][] goldmine = new int[n][m];
	        
	        for(int i=0; i<n; i++)
	        {
	            for(int j=0; j<m; j++)
	            {
	                goldmine[i][j] = sc.nextInt();
	            }
	        }
	        
	        int[][] dp = new int[n][m];
	        
	        for(int j=m-1; j>=0; j--)
	        {
	            for(int i=n-1; i>=0; i--)
	            {
	                if(j==m-1)
	                {
	                    dp[i][j] = goldmine[i][j];
	                }
	                else if(i==0)
	                {
	                    dp[i][j] = goldmine[i][j] + Math.max(dp[i][j+1],dp[i+1][j+1]);
	                }
	                else if(i==n-1)
	                {
	                    dp[i][j] = goldmine[i][j] + Math.max(dp[i-1][j+1],dp[i][j+1]);
	                }
	                else
	                {
	                    dp[i][j] = goldmine[i][j] + Math.max(Math.max(dp[i-1][j+1],dp[i][j+1]),dp[i+1][j+1]);
	                }
	            }
	        }
	        
	        int max = Integer.MIN_VALUE;

	        for(int k=0; k<n; k++)
	        {
	            if(dp[k][0] > max)
	            {
	                max = dp[k][0];
	            }
	        }
	        System.out.println(max);
	}

}
