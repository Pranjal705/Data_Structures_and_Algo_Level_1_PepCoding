package dynamic_Programming_and_Greedy;

import java.util.Scanner;

public class Coin_Change_Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        
        int amt = sc.nextInt();
        int[] dp = new int[amt+1];
        
        dp[0] = 1;
        
        
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                if(i>=arr[j])
                dp[i] += dp[i-arr[j]];
            }
        }
        
        System.out.println(dp[amt]);
	}

}
