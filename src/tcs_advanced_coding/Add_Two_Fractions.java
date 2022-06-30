package tcs_advanced_coding;
//You are given four numbers num1, den1, num2, and den2. You need to find (num1/den1)+(num2/den2) and output the result in the form of (numx/denx).
//
//Input Format:
//The first line of input contains an integer T denoting the number of test cases . Then T test cases follow . Each test case contains four integers num1, den1, num2, den2 respectively .
//
//Output Format:
//For each test case, in a new line,  output will be the fraction in the form a/b where the fraction denotes the sum of the two given fractions in reduced form.
//
//Your Task:
//Since this is a function problem, you don't need to worry about the testcases. Your task is to complete the function addFraction  which adds the two fractions and prints the resulting fraction. The function takes four arguments num1, den1, num2, den2 where num1, num2 denotes the numerators of two fractions and den1, den2 denotes their denominators.
//
//Constraints:
//1 <= T <= 100
//1 <= den1,den2,num1,num2 <= 1000
//
//Example:
//Input
//1
//1 500 2 500
//Output
//3/500
//
//Explanation:
//In above test case 1/500+2/500=3/500
//
// 
//
//Note:The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.
import java.util.*;

public class Add_Two_Fractions
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			GfG g = new GfG();
			g.addFraction(a,b,c,d);
		T--;
		}
	}
}// } Driver Code Ends


/*You are required to complete this function*/
class GfG
{ 	
 void addFraction(int num1, int den1, int num2, int den2)
 {
     // Your code here
     int rn = 0;
     int rd = 0;
     if(den1 == den2)
     {
         rn = num1 + num2;
         rd = den1 + den2;
     }
     else
     {
         rd = den1 * den2;
         rn = (num1 * den2) + (num2 * den1);
         
         // OR
         
         // int lcm = findLCM(den1, den2);
         // rn = (num1 * (lcm/den1)) + (num2 * (lcm/den2));
         // rd = lcm;
         
         
         int rgcd = findGCD(rn, rd);
         rn /= rgcd;
         rd /= rgcd;
         
     }
     System.out.println(rn + "/" + rd);
 }
 
 static int findLCM(int a, int b)
 {
     int gcd = findGCD(a,b);
     int lcm = (a*b)/gcd;
     return lcm;
     
 }
 static int findGCD(int a, int b)
 {
     if(a == b)
         return a;
     else if(a==0 && b!=0)
         return b;
     else if(a!=0 && b==0)
         return a;
     else
     {
         if(a>b)
         {
             return findGCD(a-b, b);
         }
         else
         {
             return findGCD(a, b-a);
         }
     }
 }
}
