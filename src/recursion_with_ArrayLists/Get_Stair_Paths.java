package recursion_with_ArrayLists;
import java.util.*;
//1. You are given a number n representing number of stairs in a staircase.
//2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
//3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
//Use sample input and output to take idea about output.
//
//Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

//Sample Input
//3
//Sample Output
//[111, 12, 21, 3]
public class Get_Stair_Paths {
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);

	    int n = sc.nextInt();

	    ArrayList<String> paths = new ArrayList<String>();

	    paths = getStairPaths(n);
	    System.out.println(paths);

	  }

	  public static ArrayList<String> getStairPaths(int n) {
	      
	      if(n==0)
	      {
	        ArrayList<String> bres =  new ArrayList<String>();
	        bres.add("");
	        return bres;
	      }
	      else if(n<0)
	      {
	        ArrayList<String> bres = new ArrayList<String>();
	        return bres;
	      }
	    ArrayList<String> pnm1 = getStairPaths(n - 1);
	    ArrayList<String> pnm2 = getStairPaths(n - 2);
	    ArrayList<String> pnm3 = getStairPaths(n - 3);
	    
	    ArrayList<String> mres = new ArrayList<String>();
	    
	    for(String path : pnm1)
	    {
	        mres.add("1" + path);
	    }
	    for(String path : pnm2)
	    {
	        mres.add("2" + path);
	    }
	    for(String path : pnm3)
	    {
	        mres.add("3" + path);
	    }

	    return mres;
	  }
}
