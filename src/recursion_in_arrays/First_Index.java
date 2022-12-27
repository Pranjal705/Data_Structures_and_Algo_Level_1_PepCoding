//1. You are given a number n, representing the count of elements.
//2. You are given n numbers.
//3. You are given a number x. 
//4. You are required to find the first index at which x occurs in array a.
//5. If x exists in array, print the first index where it is found otherwise print -1.
//
//Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
//Sample Input
//6
//15
//11
//40
//4
//4
//9
//4
//Sample Output
//3
package recursion_in_arrays;
import java.util.*;
public class First_Index {
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int ans = firstIndex(arr, n-1,x);
        System.out.println(ans);
    }

    public static int firstIndex(int[] arr, int n, int x){
        if(n == 0)
        {
            if(arr[0] == x)
                return 0;
            else
                return -1;
        }
        int inm1 = firstIndex(arr, n-1, x);
        if(inm1 == -1 && arr[n] == x)
            return n;
        else
            return inm1;
    }
}
