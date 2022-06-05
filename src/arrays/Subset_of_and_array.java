package arrays;

import java.util.Scanner;
//1. You are given a number n, representing the count of elements.
//2. You are given n numbers.
//3. You are required to print all subsets of arr. Each subset should be
//on separate line. For more clarity check out sample input and output.
//Sample Input
//3
//10
//20
//30
//Sample Output
//-	-	-	
//-	-	30	
//-	20	-	
//-	20	30	
//10	-	-	
//10	-	30	
//10	20	-	
//10	20	30	


public class Subset_of_and_array {
	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();

	    int[] arr = new int[n];

	    for (int i = 0; i < n; i++)
	    {
	      arr[i] = sc.nextInt();
	    }

	    int limit = (int)Math.pow(2, n); // calculating the numbr of subsets
	    // getting 2ˆn subsets
	    for (int i = 0; i < limit; i++)
	    {
	      //convert i to binary and use 0's and 1's
	      //to check if an array's element is to be printed or not
	      int temp = i;// we store i because we need to use value of i without manipulating the actual i // as i is the outer loop iterator
	      String set = "";// we make use of set to print in required order
	      for (int j = n - 1; j >= 0; j--)
	      {
	        //calculating the binary, extracting the remainder one and by one
	        //and putting required element in the String to be printed.
	        int r = temp % 2;
	        temp = temp / 2;

	        if (r == 0) //nothing to be printed
	        {
	          set = "-\t" + set;
	        }
	        else
	        {
	          // we print the element, so we add it to our answer string
	          set = arr[j] + "\t" + set;
	        }
	      }
	      System.out.println(set);// printing the required pattern line-by-line
	    }
	  }

}
