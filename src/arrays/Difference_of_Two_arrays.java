package arrays;
//1. You are given a number n1, representing the size of array a1.
//2. You are given n1 numbers, representing elements of array a1.
//3. You are given a number n2, representing the size of array a2.
//4. You are given n2 numbers, representing elements of array a2.
//5. The two arrays represent digits of two numbers.
//6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1
//
//Assumption - number represented by a2 is greater.

//Sample Input
//3
//2
//6
//7
//4
//1
//0
//0
//0
//Output
//7
//3
//3
import java.util.Scanner;

public class Difference_of_Two_arrays {
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);

	    int n1 = sc.nextInt();
	    int[] a1 = new int[n1];
	    for (int i = 0; i < n1; i++)
	    {
	      a1[i] = sc.nextInt();
	    }

	    int n2 = sc.nextInt();
	    int[] a2 = new int[n2];

	    for (int i = 0; i < n2; i++)
	    {
	      a2[i] = sc.nextInt();
	    }

	    int[] sum = new int[n2];

	    int k = sum.length - 1;
	    int i = a2.length - 1;
	    int j = a1.length - 1;
	    int carry = 0;
	    while (k >= 0)
	    {
	      int digit = carry;

	      digit += a2[i];
	      int a1v = j>=0 ? a1[j] : 0;
	        if (digit >= a1v)
	        {
	          digit -= a1v;
	          carry = 0;
	        }
	        else
	        {
	          digit += 10;
	          digit -= a1v;
	          carry = -1;
	        }
	      sum[k] = digit;
	      i--;
	      j--;
	      k--;
	    }
	    int l = 0;
	    while (l < sum.length)
	    {
	      if (sum[l] == 0)
	      {
	        l++;
	      }
	      else
	      {
	        break;
	      }
	    }

	    while (l < sum.length)
	    {
	      System.out.println(sum[l]);
	      l++;
	    }
	  }
}
