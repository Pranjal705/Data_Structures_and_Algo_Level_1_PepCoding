package dynamic_Programming_and_Greedy;

import java.util.Scanner;

//1. You are given a number n.
//2. You are required to print the number of binary strings of length n with no consecutive 0's.
//Sample Input
//6
//Sample Output
//21
public class CountBinaryStrings {
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    int oczeros = 1;
	    int ocones = 1;
	    
	    
	    for(int i=2; i<n+1; i++)
	    {
	        int nczeros = ocones;
	        int ncones = oczeros + ocones;
	        
	        oczeros = nczeros;
	        ocones = ncones;
	    }
	    
	    System.out.println(oczeros + ocones);
	 }
}
