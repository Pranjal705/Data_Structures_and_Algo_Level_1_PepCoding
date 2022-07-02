package tcs_advanced_coding;
//Check perfect square 
//Basic Accuracy: 68.32% Submissions: 4075 Points: 1
//Given a positive integer n, check if it is perfect square or not.
//NOTE: Try to solve the question using only addition and subtraction operation.
//
//Example 1:
//
//Input: n = 35
//Output: 0 
//Explanation: 35 is not perfect
//square because sqrt(35) = 5 but
//5*5 !=35.
//Example 2:
//
//Input: n = 49
//Output: 1
//Explanation: sqrt(49) = 7 and 
//7*7 = 49, Hence 49 is perfect square. 
//
//Your Task:  
//You dont need to read input or print anything. Complete the function isPerfectSquare() which takes n as input parameter and returns 1 if n is a perfect square else return 0.
//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class Check_Peerfect_Square {
 public static void main(String args[]) throws IOException {
     BufferedReader read =
         new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(read.readLine());
     while (t-- > 0) {
         long n = Integer.parseInt(read.readLine());
         C ob = new C();

         System.out.println(ob.isPerfectSquare(n));
     }
 }
}// } Driver Code Ends


//User function Template for Java
class C {
 static long isPerfectSquare(long n){
     // code here
     int sqrt = (int)(Math.sqrt(n));
     if((sqrt*sqrt) == n)
         return 1;
     return 0;
 }
}