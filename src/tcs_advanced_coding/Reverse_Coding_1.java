package tcs_advanced_coding;


//{ Driver Code Starts
//Initial Template for Java
//Sherlock Being tired with the usual coding rounds started growing his interest towards reverse coding when he won the event in his college symposium. He wondered if his friend has the brain to quickly identify the pattern and verify if his inputs are correct or not. From the example portion given below, where you will be given a number(n) and its output m, Using this find the pattern. Your task is that from the pattern you identified above, You have to tell if for the given n whether the given m is the correct answer or not.
//
//
//Example to identify the pattern :
//Input                            Output
//10                                 55
//20                                 210
//5                                   15
//0                                    0
//1                                    1
//2                                    3
//
// 
//
//Example 1:
//
//Input:
//n = 10, m = 55 
//Output:
//1
//Explanation:
//It follows the given pattern.
//Example 2:
//
//Input:
//n = 4, m = 11 
//Output:
//0
//Explanation:
//It doesn't follow the given pattern.
import java.io.*;
import java.util.*;

public class Reverse_Coding_1 {
 public static void main(String args[]) throws IOException {
     BufferedReader read =
         new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(read.readLine());
     while (t-- > 0) {
         String S[] = read.readLine().split(" ");
         
         int n = Integer.parseInt(S[0]);
         int m = Integer.parseInt(S[1]);

         solutionn ob = new solutionn();
         System.out.println(ob.revCoding(n,m));
     }
 }
}// } Driver Code Ends


//User function Template for Java

class solutionn {
 static int revCoding(int n, int m) {
     int sumUptoN = (n*(n+1))/2;
     if(m == sumUptoN)
     {
         return 1;
     }
     return 0;
 }
};
