package arrays;
//1. You are given a number n, representing the count of elements.
//2. You are given n numbers.
//3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

//Sample Input
//6
//15
//30
//40
//4
//11
//9
//Sample Output
//36

import java.util.Scanner;

public class Span_of_an_array {
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0; i<n; i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    
	    for(int i=0; i<n; i++)
	    {
	     if(arr[i] > max)
	     {
	        max = arr[i];
	     }
	     
	     if(arr[i] < min )
	     {
	        min = arr[i];
	     }
	    }
	    
	    int span = max-min;
	    System.out.println(span);
	 }
}
