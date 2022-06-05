package dynamic_Programming_and_Greedy;

import java.util.Scanner;

public class Min_Cost_In_Maze_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();

	    int[][] maze = new int[n][m];
	    for (int i = 0; i < n; i++)
	    {
	      for (int j = 0; j < m; j++)
	      {
	        maze[i][j] = sc.nextInt();
	      }
	    }

	    int[][] dp = new int[n+1][m+1];

	    for (int i = n - 1; i >= 0; i--)
	    {
	      for (int j = m-1; j >= 0; j--)
	      {
	        if (i == n - 1 && j == m - 1)
	        {
	          dp[i][j] = maze[i][j];
	        }
	        else if (i == n - 1)
	        {
	          dp[i][j] = maze[i][j] + dp[i][j + 1];
	        }
	        else if (j == m - 1)
	        {
	          dp[i][j] = maze[i][j] + dp[i + 1][j];
	        }
	        else
	          dp[i][j] = maze[i][j] + Math.min(dp[i][j + 1], dp[i + 1][j]);
	      }
	    }
	    
	    System.out.println(dp[0][0]);
	}

}
