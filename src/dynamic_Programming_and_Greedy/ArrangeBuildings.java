package dynamic_Programming_and_Greedy;

import java.util.Scanner;

//1. You are given a number n, which represents the length of a road. The road has n plots on it's each side.
//2. The road is to be so planned that there should not be consecutive buildings on either side of the road.
//3. You are required to find and print the number of ways in which the buildings can be built on both side of roads.

//Sample Input
//6
//Sample Output
//441
public class ArrangeBuildings {
	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner sc = new Scanner(System.in);
	    
	    long n = sc.nextInt();
	    
	    // for plot of one side
	    long ocb = 1;
	    long ocs = 1;
	    
	    
	    for(int i=2; i<n+1; i++)
	    {
	        long ncb = ocs;
	        long ncs = ocb + ocs;
	        
	        ocb = ncb;
	        ocs = ncs;
	    }
	    // for both side
	    long oneside = ocb + ocs;
	    System.out.println(oneside*oneside);
	 }

}
