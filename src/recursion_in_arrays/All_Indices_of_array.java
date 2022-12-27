//1. You are given a number n, representing the count of elements.
//2. You are given n numbers.
//3. You are given a number x. 
//4. You are required to find the all indices at which x occurs in array a.
//5. Return an array of appropriate size which contains all indices at which x occurs in array a.
//
//Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

package recursion_in_arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class All_Indices_of_array {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // write ur code here
        if(idx == arr.length)
        {
            int[] aarray = new int[fsf];
            return aarray;
        }
        int[] iarray;
        if(arr[idx] == x)
        {
            iarray = allIndices(arr, x, idx+1, fsf+1);
            iarray[fsf] = idx;
        }
        else
        {
            iarray = allIndices(arr, x, idx+1, fsf);

        }
        return iarray;
    }
}
