//1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing elements of array a.
//3. You are required to print the elements of array from beginning to end each in a separate line.
//4. For the above purpose complete the body of displayArr function. Don't change the signature.
//
//Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
//Sample Input
//5
//3
//1
//0
//7
//5
//Sample Output
//3
//1
//0
//7
//5
package recursion_in_arrays;
import java.util.*;
public class Displaly_Array {

	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        displayArr(arr, n-1);
    }

    public static void displayArr(int[] arr, int n){
        if(n < 0)
            return;
        displayArr(arr, n-1);
        System.out.println(arr[n]);
    }
}
