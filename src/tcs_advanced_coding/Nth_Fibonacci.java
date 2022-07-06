package tcs_advanced_coding;
//Nth Fibonacci Number 
//Easy Accuracy: 41.85% Submissions: 66060 Points: 2
//Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.
//
//Example 1:
//
//Input: n = 2
//Output: 1 
//Explanation: 1 is the 2nd number
//of fibonacci series.
//Example 2:
//
//Input: n = 5
//Output: 5
//Explanation: 5 is the 5th number
//of fibonacci series.
//
//Your Task:  
//You dont need to read input or print anything. Complete the function nthFibonacci() which takes n as input parameter and returns nth fibonacci number.
//
//Expected Time Complexity: O(n)
//Expected Auxiliary Space: O(n)
import java.io.*;
class Nth_Fibonacci {
 public static void main(String args[]) throws IOException {
     BufferedReader read =
         new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(read.readLine());
     while (t-- > 0) {
         long n = Integer.parseInt(read.readLine());
         Fibonacci ob = new Fibonacci();

         System.out.println(ob.nthFibonacci(n));
     }
 }
}

class Fibonacci {
 static long nthFibonacci(long n){
     
    long prev1 = 0L;
    long prev2 = 1;
     
     for(long i=2; i<=n; i++)
     {
         long cur = (prev1 + prev2)%1000000007;
         prev1 = prev2;
         prev2 = cur;
     }
     return prev2;
 }
}