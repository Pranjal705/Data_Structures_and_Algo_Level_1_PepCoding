//1. You are given a number n, representing the count of elements.
//2. You are given n numbers.
//3. You are required to find the maximum of input. 
//4. For the purpose complete the body of maxOfArray function. Don't change the signature.
//
//Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
//Sample Input
//6
//15
//30
//40
//4
//11
//9
//Sample Output
//40

package recursion_in_arrays;
import java.util.*;
public class Max_of_an_array {
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans = maxOfArray(arr, n-1);
        System.out.println(ans);
    }

    public static int maxOfArray(int[] arr, int n){
        if(n==0)
            return arr[0];
        int maxnm1 = maxOfArray(arr, n-1);
        if(maxnm1 > arr[n])
            return maxnm1;
        else
            return arr[n];
    }

}
