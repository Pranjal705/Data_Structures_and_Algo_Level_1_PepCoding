package functiona_and_arrays;
//1. You are given a decimal number n.
//2. You are given a base b.
//3. You are required to convert the number n into its corresponding value in base b.

//Sample Input
//57
// 2
//Sample Output
//111001

import java.util.Scanner;

public class Decimal_to_any_base {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int b = scn.nextInt();
	    int dn = getValueInBase(n, b);
	    System.out.println(dn);
	  }

	  public static int getValueInBase(int n, int b) {
	    // write code here
	    int number = 0;
	    int i = 1;

	    while (n > 0)
	    {
	      int r = n % b;
	      number += r * i;
	      i *= 10;
	      n = n / b;
	    }
	    return number;
	  }
}
