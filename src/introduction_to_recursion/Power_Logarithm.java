//1. You are given a number x.
//2. You are given another number n.
//3. You are required to calculate x raised to the power n. Don't change the signature of power function.
//
//Note1 -> The previous version expects the call stack to be of n height. This function expects call function to be only log(n) high.
//
//Note2 -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

//Sample Input
//2
//5
//Sample Output
//32

package introduction_to_recursion;
import java.util.*;
public class Power_Logarithm {
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        int ans = power(x, n);
        System.out.println(ans);
    }

    public static int power(int x, int n){
        if( n == 0)
            return 1;
        if(n % 2 == 0)
        {
            int xnb2 = power(x, n/2);
            
            return xnb2 * xnb2;
        }
        else
        {
            n = n - 1;
            int xnb2 = power(x, n/2);
            
            return x * xnb2 * xnb2;
        }
        
    }
}
