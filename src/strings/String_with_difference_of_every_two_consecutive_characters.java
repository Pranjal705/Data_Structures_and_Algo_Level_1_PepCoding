package strings;

import java.util.Scanner;
//1. You are given a string that contains only lowercase and uppercase alphabets. 
//2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
//   For "abecd", the answer should be "a1b3e-2c1d", as 
//   'b'-'a' = 1
//   'e'-'b' = 3
//   'c'-'e' = -2
//   'd'-'c' = 1

//Sample Input
//pepCODinG
//Sample Output
//p-11e11p-45C12O-11D37i5n-39G

public class String_with_difference_of_every_two_consecutive_characters {
	  public static String solution(String str) {
		    StringBuilder s = new StringBuilder(str);
		    for (int i = 0; i < s.length()-1; i++)
		    {

		      char ch0 = s.charAt(i);

		      if (ch0 >= 'A' && ch0 <= 'Z' || ch0 >= 'a' && ch0 <= 'z')
		      {
		        char ch = s.charAt(i);
		        char ch1 = s.charAt(i + 1);
		        int diff =(int)ch1- (int)ch;
		        s.insert(i + 1, diff);
		      }
		    }

		    return s.toString();

		  }
		  public static void main(String[] args) {
		    Scanner scn = new Scanner(System.in);
		    String str = scn.next();
		    System.out.println(solution(str));
		  }
}
