package strings;
//1. You are given a string. 
//2. You have to print all permutations of the given string iteratively.
//
//Sample Input
//abc
//Sample Output
//abc
//bac
//cab
//acb
//bca
//cba

import java.util.Scanner;

public class Print_All_permutations_ofString {
	public static void solution(String str){
		// write your code here
		int p = factorial(str.length());
		for(int i=0; i<p; i++)
		{
		    int temp = i;
		    StringBuilder sb = new StringBuilder(str);
		    for(int div=sb.length(); div>=1; div--)
		    {
		        int q = temp/div;
		        int r = temp%div;
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        
		        temp = q;
		    }
		    System.out.println();
		}
	}
	
	public static int factorial(int n)
	{
	    int val = 1;
	    for(int i=2; i<=n; i++)
	    {
	        val*=i;
	    }
	    return val;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}
