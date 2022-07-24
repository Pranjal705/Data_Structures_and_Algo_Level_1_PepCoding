package recursion_and_backtracking_gfg;

//Flood fill Algorithm
//MediumAccuracy: 64.41%Submissions: 23197Points: 4
//An image is represented by a 2-D array of integers, each integer representing the pixel value of the image.
//
//Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.
//
//To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.
//
//Example 1:
//
//Input: image = {{1,1,1},{1,1,0},{1,0,1}},
//sr = 1, sc = 1, newColor = 2.
//Output: {{2,2,2},{2,2,0},{2,0,1}}
//Explanation: From the center of the image 
//(with position (sr, sc) = (1, 1)), all 
//pixels connected by a path of the same color
//as the starting pixel are colored with the new 
//color.Note the bottom corner is not colored 2, 
//because it is not 4-directionally connected to 
//the starting pixel.
// 
//
//Your Task:
//You don't need to read or print anyhting. Your task is to complete the function floodFill() which takes image, sr, sc and newColor as input paramater and returns the image after flood filling.
// 
//
//Expected Time Compelxity: O(n*m)
//Expected Space Complexity: O(n*m)

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class floodfill_algo
{
  public static void main(String[] args) throws IOException
  {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine().trim());
      while(T-->0)
      {
          String[] S1 = br.readLine().trim().split(" ");
          int n = Integer.parseInt(S1[0]);
          int m = Integer.parseInt(S1[1]);
          int[][] image =  new int[n][m];
          for(int i = 0; i < n; i++){
              String[] S2 = br.readLine().trim().split(" ");
              for(int j = 0; j < m; j++)
                  image[i][j] = Integer.parseInt(S2[j]);
          }
          String[] S3 = br.readLine().trim().split(" ");
          int sr = Integer.parseInt(S3[0]);
          int sc = Integer.parseInt(S3[1]);
          int newColor = Integer.parseInt(S3[2]);
          PaintSame obj = new PaintSame();
          int[][] ans = obj.floodFill(image, sr, sc, newColor);
          for(int i = 0; i < ans.length; i++){
              for(int j = 0; j < ans[i].length; j++)
                  System.out.print(ans[i][j] + " ");
              System.out.println();
          }
      }
  }
}

//} Driver Code Ends


class PaintSame
{
  public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
  {
      // Code here
      boolean[][] isVisited = new boolean[image.length][image[0].length];
      int firstColor = image[sr][sc];
      ff(image, sr, sc, newColor, firstColor,isVisited);
      return image;
      
  }
  
  public void ff(int[][] image, int sr, int sc, int newColor, int firstColor, boolean[][] isVisited)
  {
      if(sr < 0 || sc < 0 || sr > image.length-1 || sc > image[0].length -1 || image[sr][sc] != firstColor || isVisited[sr][sc])
      {
          return;
      }
      
      isVisited[sr][sc] = true;
      ff(image, sr-1,sc,newColor,firstColor, isVisited);
      ff(image, sr,sc-1,newColor,firstColor, isVisited);
      ff(image, sr+1,sc,newColor,firstColor, isVisited);
      ff(image, sr,sc+1,newColor,firstColor, isVisited);
      image[sr][sc] =  newColor;

  }
  
  
}