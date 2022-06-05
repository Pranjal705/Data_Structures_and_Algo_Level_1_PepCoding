package dynamic_Programming_and_Greedy;
import java.util.*;
public class Climb_Stairs {
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] dp = new int[n+1];
	    
	    dp[0] = 1;
	    for(int i=1; i<=n; i++)
	    {
	        if(i==1)
	        {
	            dp[i] = dp[0];
	        }
	        else if(i==2)
	        {
	            dp[i] = dp[i-1] + dp[i-2];
	        }
	        else {
	        dp[i] = dp[i-1] + dp[i-2] + dp[i-3];

	        }
	    }
	    System.out.println(dp[n]);
	    sc.close();

	  }
}
