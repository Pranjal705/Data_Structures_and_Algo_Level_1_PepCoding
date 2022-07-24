package recursion_and_backtracking_gfg;
//N-Queen Problem
//HardAccuracy: 56.62%Submissions: 18673Points: 8
//Lamp
//This problem is part of GFG SDE Sheet. Click here to view more.  
//
//The n-queens puzzle is the problem of placing n queens on a (n×n) chessboard such that no two queens can attack each other.
//Given an integer n, find all distinct solutions to the n-queens puzzle. Each solution contains distinct board configurations of the n-queens’ placement, where the solutions are a permutation of [1,2,3..n] in increasing order, here the number in the ith place denotes that the ith-column queen is placed in the row with that number. For eg below figure represents a chessboard [3 1 4 2].
//
//
//
// 
//
//Example 1:
//
//Input:
//1
//Output:
//[1]
//Explaination:
//Only one queen can be placed 
//in the single cell available.
//Example 2:
//
//Input:
//4
//Output:
//[2 4 1 3 ] [3 1 4 2 ]
//Explaination:
//These are the 2 possible solutions.
// 
//
//Your Task:
//You do not need to read input or print anything. Your task is to complete the function nQueen() which takes n as input parameter and returns a list containing all the possible chessboard configurations in sorted order. Return an empty list if no solution exists.
//
// 
//
//Expected Time Complexity: O(n!)
//Expected Auxiliary Space: O(n2) 
//
// 
//
//Constraints:
//1 ≤ n ≤ 10 
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class NQueens_Print{
 public static void main(String args[])throws IOException
 {
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(in.readLine());
     while(t-- > 0) {
         int n = Integer.parseInt(in.readLine());
         
         NQ ob = new NQ();
         ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
         if(ans.size() == 0)
             System.out.println("-1");
         else {
             for(int i = 0;i < ans.size();i++){
                 System.out.print("[");
                 for(int j = 0;j < ans.get(i).size();j++)
                     System.out.print(ans.get(i).get(j) + " ");
                 System.out.print("] ");
             }
             System.out.println();
         }
     }
 }
}
//} Driver Code Ends


//User function Template for Java

 class NQ{
static ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
static ArrayList<Integer> a = new ArrayList<Integer>();
static ArrayList<ArrayList<Integer>> nQueen(int n) {
  // code here
  int[][] chess = new int[n][n];
  NQueens(chess,0, "");
  return answer;
  
}


public static void NQueens(int[][] chess, int row, String qsf)
{
  if (row == chess.length)
  {
  //   System.out.println(qsf);
  //   a = convertStringToCharList( qsf);
    answer.add(convertStringToCharList( qsf));
  //   a.clear();
    return;
  }
  
  for(int col = 0; col<chess.length; col++)
  {
      if(safePlace(chess, row, col))
      {
          chess[row][col] = 1;
          // a.add(col);
          NQueens(chess, row+1, qsf + (col+1));
          chess[row][col] = 0;
      }
  }
}

public static boolean safePlace(int[][] chess, int row, int col)
{
  for(int i = row - 1, j =  col; i>=0; i--)
  {
    if(chess[i][j] == 1)
    {
        return false;
    }
  }

  for(int i = row -1, j = col -1; i>=0 && j>=0; i--,j--)
  {
      if(chess[i][j] == 1)
       {
            return false;
       }
  }
    
  for(int i = row -1, j = col + 1; i>=0 && j<chess.length; i--,j++)
  {
    if(chess[i][j] == 1)
    {
        return false;
    }
  }
  return true;
}
public static ArrayList<Integer>
convertStringToCharList(String str)
{

  // Create an empty List of character
  ArrayList<String> s = new ArrayList<>(Arrays.asList(str.split("")));
  ArrayList<Integer> ans = new ArrayList<Integer>();
  // For each character in the String
  // add it to the List
  for (String num : s) {

      ans.add(Integer.parseInt(num.trim()));
  }

  // return the List
  return ans;
}
}