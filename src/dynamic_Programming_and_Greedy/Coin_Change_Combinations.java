package dynamic_Programming_and_Greedy;

//1. You are given a number n, representing the count of coins.
//2. You are given n numbers, representing the denominations of n coins.
//3. You are given a number "amt".
//4. You are required to calculate and print the number of combinations of the n coins using which the 
//     amount "amt" can be paid.
//
//Note1 -> You have an infinite supply of each coin denomination i.e. same coin denomination can be 
//                  used for many installments in payment of "amt"
//Note2 -> You are required to find the count of combinations and not permutations i.e.
//                  2 + 2 + 3 = 7 and 2 + 3 + 2 = 7 and 3 + 2 + 2 = 7 are different permutations of same 
//                  combination. You should treat them as 1 and not 3.


import java.util.Scanner;

public class Coin_Change_Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int amt = sc.nextInt();
        
        int[] dp = new int[amt+1];
        
        dp[0] = 1;
        
        for(int i=0; i<n; i++)
        {
            for(int j=a[i]; j<dp.length; j++)
            {
                dp[j] += dp[j-a[i]];
            }
        }
        System.out.println(dp[amt]);
	}

}
