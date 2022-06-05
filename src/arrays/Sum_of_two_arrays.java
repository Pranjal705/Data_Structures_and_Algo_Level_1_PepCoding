package arrays;
//1. You are given a number n1, representing the size of array a1.
//2. You are given n1 numbers, representing elements of array a1.
//3. You are given a number n2, representing the size of array a2.
//4. You are given n2 numbers, representing elements of array a2.
//5. The two arrays represent digits of two numbers.
//6. You are required to add the numbers represented by two arrays and print the
//arrays.
//Sample Input
//5
//3
//1
//0
//7
//5
//6
//1
//1
//1
//1
//1
//1
//Sample Output
//1
//4
//2
//1
//8
//6
import java.util.Scanner;

public class Sum_of_two_arrays {
	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int[] arr1 = new int[n1];
	    for (int i = 0; i < n1; i++)
	    {
	      arr1[i] = sc.nextInt();
	    }

	    int n2 = sc.nextInt();
	    int[] arr2 = new int[n2];

	    for (int i = 0; i < n2; i++)
	    {
	      arr2[i] = sc.nextInt();
	    }

	    int[] sum = new int[n1 > n2 ? n1 : n2];
	    int k = sum.length - 1;
	    int i = arr1.length - 1;
	    int j = arr2.length - 1;
	    int carry = 0;
	    while (k >= 0)
	    {
	        int digit = carry;
	        if(i>=0)
	        {
	            digit += arr1[i];
	            i--;
	        }
	        if(j>=0)
	        {
	            digit+= arr2[j];
	            j--;
	        }
	        
	        carry = digit / 10;
	        digit = digit % 10;
	        sum[k] = digit;
	        k--;
	    }
	    if(carry>0)
	    {
	        System.out.println(carry);
	    }
	    for(int l=0; l<sum.length; l++)
	    {
	        System.out.println(sum[l]);
	    }
	  }
}
