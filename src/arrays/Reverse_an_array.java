package arrays;
//1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing elements of array a.
//3. You are required to reverse the contents of array a.

//Input Format
//Input is managed for you
//Output Format
//Output is managed for you

//Sample Input
//5
//1
//2
//3
//4
//5
//Sample Output
//5 4 3 2 1

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reverse_an_array {
	public static void display(int[] a) {
	    StringBuilder sb = new StringBuilder();

	    for (int val : a) {
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	  }

	  public static void reverse(int[] a) {
	    int i = 0;
	    int j = a.length - 1;
	    int n = a.length;

	    while (i < j)
	    {
	      swap(a, i, j);
	      i++;
	      j--;
	    }
	  }
	  public static void swap(int[] arr, int i, int j)
	  {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for (int i = 0; i < n; i++) {
	      a[i] = Integer.parseInt(br.readLine());
	    }

	    reverse(a);
	    display(a);
	  }
}
