package tcs_advanced_coding;

//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Zero
{
 public static void sort012(int a[], int n)
 {
     // code here 
     int i = 0; // 0 to j-1 -> 0's area
     int j = 0; // j to i-1 -> 1's area
     int k = n-1; // k+1 to end -> 2's area
     // i to k unknow area
     while(i<=k)
     {
         if(a[i] == 0)
         {
             swap(a,j,i);
             i++;
             j++;
         }
         else if(a[i] == 1)
         {
             i++;
         }
         else
         {
             swap(a, i, k);
             k--;
         }
         
     }
 }
 static void swap(int[] a, int i, int j)
 {
     int temp = a[i];
     a[i] = a[j];
     a[j] = temp;
 }
}

//{ Driver Code Starts.

class segragate012 {
 
 public static void main (String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
     while(t-->0){
         int n = Integer.parseInt(br.readLine().trim());
         int arr[] = new int[n];
         String inputLine[] = br.readLine().trim().split(" ");
         for(int i=0; i<n; i++){
             arr[i] = Integer.parseInt(inputLine[i]);
         }
         Zero ob=new Zero();
         ob.sort012(arr, n);
         StringBuffer str = new StringBuffer();
         for(int i=0; i<n; i++){
             str.append(arr[i]+" ");
         }
         System.out.println(str);
     }
 }
}

// } Driver Code Ends