package arrays;
//1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing elements of array a.
//3. You are give a number d
//Asssumption - Array is sorted. Array may have duplicate values.
//Sample Input
//15
//1
//5
//10
//15
//22
//33
//33
//33
//33
//33
//40
//42
//55
//66
//77
//33
//Sample Output
//5
//9

import java.util.Scanner;

public class FirstIndex_LastIndex_Official {
	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner sc = new Scanner(System.in);

	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++)
	    {
	      arr[i] = sc.nextInt();
	    }

	    int d = sc.nextInt();

	    int l = 0;
	    int h = n - 1;

	    int m = (l + h) / 2;
	    int firstIndex = -1;
	    int lastIndex = -1;

	    while (l <= h)
	    {
	      if (d < arr[m])
	      {
	        h = m - 1;
	      }
	      else if (d > arr[m])
	      {
	        l = m + 1;
	      }
	      else
	      {
	        while (arr[m - 1] == d)
	        {
	          m--;
	        }
	        firstIndex = m;

	        while (arr[m + 1] == d)
	        {
	          m++;
	        }
	        lastIndex = m;

	        break;
	      }
	      m = (l + h) / 2;
	    }
	    System.out.println(firstIndex);
	    System.out.println(lastIndex);
	  }

}
