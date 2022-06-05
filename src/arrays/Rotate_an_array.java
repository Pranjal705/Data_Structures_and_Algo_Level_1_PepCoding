package arrays;

//1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing elements of array a.
//3. You are given a number k.
//4. Rotate the array a, k times to the right (for positive values of k), and to
//the left for negative values of k.
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
//3
//Sample Output
//3 4 5 1 2
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rotate_an_array {
	public static void display(int[] a) {
	    StringBuilder sb = new StringBuilder();

	    for (int val : a) {
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	  }

	  public static void rotate(int[] a, int k) {

	    if (k < 0)
	    {
	      k = k - (2 * k);
	      k = k % a.length;// the array repeats itself after it gets rotated to its size times
	      rotateLeft(a, k);
	    }
	    else
	    {
	      k = k % (a.length);
	      rotateRight(a, k);
	    }
	  }

	  public static void rotateRight(int[] a, int k)
	  {
	    while (k >= 1)
	    {
	      int i = a.length - 1;
	      int temp = a[i];
	      while (i > 0)
	      {
	        a[i] = a[i - 1];
	        i--;
	      }
	      a[0] = temp;
	      k--;
	    }
	  }
	  public static void rotateLeft(int[] a, int k)
	  {
	    while (k >= 1)
	    {
	      int i = 0;
	      int temp = a[i];
	      while (i <= a.length - 2)
	      {
	        a[i] = a[i + 1];
	        i++;
	      }
	      a[a.length - 1] = temp;
	      k--;
	    }
	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for (int i = 0; i < n; i++) {
	      a[i] = Integer.parseInt(br.readLine());
	    }
	    int k = Integer.parseInt(br.readLine());

	    rotate(a, k);
	    display(a);
	  }
}
