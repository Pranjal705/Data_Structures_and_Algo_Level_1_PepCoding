package tcs_advanced_coding;

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class Form_a_number_divisible_by_3_using_array_digits {
 public static void main(String args[]) throws IOException {
     BufferedReader in =
         new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(in.readLine());
     while (t-- > 0) {
         int N = Integer.parseInt(in.readLine());
         String a[] = in.readLine().trim().split("\\s+");
         int arr[] = new int[N];
         for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(a[i]);

         S ob = new S();
         System.out.println(ob.isPossible(N, arr));
     }
 }
}// } Driver Code Ends


//User function Template for Java

class S {
 static int isPossible(int n, int arr[]) {
     // code here
     int number = 0;
     for(int i=0; i<n; i++)
     {
         number += sumOfDigits(arr[i]);
     }
     if(number % 3 == 0)
     {
         return 1;
     }
     return 0;
 }
 
 static int sumOfDigits(int n)
 {
     int sum = 0;
     while(n > 0)
     {
         sum = sum + (n%10);
         n/=10;
     }
     // System.out.println(sum);
     return sum;
 }
}
