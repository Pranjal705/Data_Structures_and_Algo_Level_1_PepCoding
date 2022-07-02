package tcs_advanced_coding;

//{ Driver Code Starts
//You are a traveler, lost in a jungle. Backtrack your steps and find the starting point.
//
//Currently, you are at coordinates (x,y). You are also given an array pathCoordinates [ ] where each element is a (a,b) pair.
//
//The ith pair (a,b), in the array, denotes that in the ith move you moved your X co-ordinate by a and Y co-ordinate by b. 
//if X,Y coordinates in an instant are (c,d) then your next move will be to ( c+a, d+b). 
//

//For Input: 
//2 2
//3
//1 0
//0 1
//1 1
//
//Your Output: 
//0 0 
//Example 1:
//
//Input: x = 2, y = 2, 
//pathCoordinates = {{1,0},{0,1},{1,1}}
//Output: {0,0}
//Explaination:
//{0,0} was the starting point of the traveler.
//At first he changed his X co-ordinate by 1 and
//Y co-ordinate by 0.
//{0,0} -> {1,0}
//After that he changed his X co-ordinate by 0 and
//Y co-ordinate by 1.
//{0,0} -> {1,0} -> {1,1}
//And finally, he changed his X co-ordinate by 1 and
//Y co-ordinate by 1.
//{0,0} -> {1,0} -> {1,1} -> {2,2}
import java.util.*;
import java.lang.*;
import java.io.*;
public class Starting_Point
{
 public static void main(String[] args) throws IOException
 {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int T = Integer.parseInt(br.readLine().trim());
     while(T-->0)
     {
         String[] s = br.readLine().trim().split(" ");
         int x = Integer.parseInt(s[0]);
         int y = Integer.parseInt(s[1]);
         int n = Integer.parseInt(br.readLine().trim());
         int[][] pathCoordinates = new int[n][2];
         for(int i = 0; i < n; i++){
             String[] S = br.readLine().trim().split(" ");
             for(int j = 0; j < 2; j++)
                 pathCoordinates[i][j] = Integer.parseInt(S[j]);
         }
         back obj = new back();
         int[] ans = obj.findStartingPoint(x, y, pathCoordinates);
         for(int i = 0; i < ans.length; i++){
             System.out.print(ans[i] + " ");
         }
         System.out.println();
     }
 }
}
//} Driver Code Ends


class back
{
 public int[] findStartingPoint(int x, int y, int[][] pathCoordinates)
 {
     // Code here 
     int n = pathCoordinates.length-1;
     while(n >=0 )
     {
         x = x-pathCoordinates[n][0];
         y = y-pathCoordinates[n][1];
         n--;
     }
     int[] startingPoint = new int[2];
     startingPoint[0] = x;
     startingPoint[1] = y;
     return startingPoint;
 }
}