package introduction_to_recursion;
import java.util.*;
public class Factorial {
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
        sc.close();
    }

    public static int factorial(int n){
        if(n == 0)
            return 1;
        int fnm1 = factorial(n-1);
        return n * fnm1;
    }

}
