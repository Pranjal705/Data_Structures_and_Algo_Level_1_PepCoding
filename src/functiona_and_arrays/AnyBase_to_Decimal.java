package functiona_and_arrays;
//1. You are given a number n.
//2. You are given a base b. n is a number on base b.
//3. You are required to convert the number n into its corresponding value in decimal number system.

//Sample Input
//111001
//2
//Sample Output
//57

import java.util.Scanner;

public class AnyBase_to_Decimal {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int b = scn.nextInt();
	    int d = getValueIndecimal(n, b);
	    System.out.println(d);
	  }

	  public static int getValueIndecimal(int n, int b) {
	    int number = 0;
	    int i = 0;

	    while (n > 0)
	    {
	      int r = n % 10;
	      number += r * Math.pow(b, i);
	      i++;
	      n = n / 10;
	    }
	    return number;
	  }
}
