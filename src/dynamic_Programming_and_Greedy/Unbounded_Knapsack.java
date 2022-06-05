package dynamic_Programming_and_Greedy;

import java.util.Scanner;

//1. You are given a number n, representing the count of items.
//2. You are given n numbers, representing the values of n items.
//3. You are given n numbers, representing the weights of n items.
//3. You are given a number "cap", which is the capacity of a bag you've.
//4. You are required to calculate and print the maximum value that can be created in the bag without 
//    overflowing it's capacity.
//Note -> Each item can be taken any number of times. You are allowed to put the same item again 
//                  and again.

//Sample Input
//5
//15 14 10 45 30
//2 5 1 3 4
//7
//Sample Output
//100

public class Unbounded_Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();

	    int[] vals = new int[n];
	    for (int i = 0; i < n; i++)
	    {
	      vals[i] = sc.nextInt();
	    }

	    int[] wts = new int[n];
	    for (int i = 0; i < n; i++)
	    {
	      wts[i] = sc.nextInt();
	    }

	    int cap = sc.nextInt();

	    int[] dp = new int[cap + 1];
	    dp[0] = 0;
	    for (int bagc = 1; bagc < dp.length; bagc++ )
	    {
	      int max = 0;
	      for (int j = 0; j < n; j++)
	      {
	        if (wts[j] <= bagc)
	        {
	          int rbagc = bagc - wts[j];
	          int rbagv = dp[rbagc];
	          int tbagc = rbagv + vals[j];
	          if (tbagc > max)
	          {
	            max = tbagc;
	          }
	        }


	      }
	      dp[bagc] = max;
	    }
	    System.out.println(dp[cap]);

	}

}
