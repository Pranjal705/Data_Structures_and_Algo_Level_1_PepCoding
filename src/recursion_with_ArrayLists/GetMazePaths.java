package recursion_with_ArrayLists;
import java.util.*;
//1. You are given a number n and a number m representing number of rows and columns in a maze.
//2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
//3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
//Use sample input and output to take idea about output.
//Sample Input
//3
//3
//Sample Output
//[hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
public class GetMazePaths {
	public static void main(String[] args) throws Exception {

	    Scanner sc = new Scanner(System.in);

	    int n = sc.nextInt();

	    int m = sc.nextInt();

	    ArrayList<String> answer = getMazePaths(0, 0, n-1, m-1);
	    System.out.println(answer);
	  }

	  // sr - source row
	  // sc - source column
	  // dr - destination row
	  // dc - destination column
	  public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

	    if (sr == dr && sc == dc)
	    {
	      ArrayList<String> bres = new ArrayList<String>();
	      bres.add("");
	      return bres;
	    }
	    else if (sr > dr || sc > dc )
	    {
	      ArrayList<String> bres = new ArrayList<String>();

	      return bres;
	    }

	    ArrayList<String> hpaths = new ArrayList<String>();
	    ArrayList<String> vpaths = new ArrayList<String>();
	    ArrayList<String> paths = new ArrayList<String>();

	    hpaths = getMazePaths(sr, sc+1, dr, dc);
	    vpaths = getMazePaths(sr+1, sc, dr, dc);

	    for (String hpath : hpaths)
	    {
	      paths.add("h" + hpath);
	    }
	    for (String vpath : vpaths)
	    {
	      paths.add("v" + vpath);
	    }

	    return paths;
	  }

}
