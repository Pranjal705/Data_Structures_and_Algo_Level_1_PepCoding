package functiona_and_arrays;
//1. You are given a number n.
//2. You are given a base b1. n is a number on base b.
//3. You are given another base b2.
//4. You are required to convert the number n of base b1 to a number in base b2.

//Sample Input
//111001
//2
//3
//Sample Output
//2010
import java.util.Scanner;

public class AnyBaseToAnyBase {
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int sourceBase = scn.nextInt();
	    int  destBase = scn.nextInt();

	    int answer = getValue(n, sourceBase, destBase);
	    System.out.println(answer);
	  }

	  public static int getValue(int n, int b1, int b2) {
	    // converting number to decimal
	    int decimalEquivalent = AnyBaseToDecimal(n, b1);
	    // converting the decimal equivalent to destination base
	    int answer = DecimalToAnyBase(decimalEquivalent, b2);
	    return answer;
	  }
	  
	  
	  public static int DecimalToAnyBase(int n, int b) {
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
	  public static int AnyBaseToDecimal(int n, int b) {
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
