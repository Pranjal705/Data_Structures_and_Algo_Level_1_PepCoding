package base_Conversion_gfg;

//Base Conversion 
//Basic Accuracy: 45.26% Submissions: 190 Points: 1
//Given four numbers convert:
//
//a, a decimal number to the binary equivalent
//b, a binary to decimal equivalent
//c, decimal to hexadecimal equivalent
//d, hexadecimal to decimal equivalent
//Example 1:
//
//Input :
//a = 6
//b = 110
//c = 20
//d = 2A
//Output:
//110, 6, 14, 42
//Explanation:
//(6)10 = (110)2
//(110)2 = (6)10
//(20)10 = (14)16
//(2A)16 = (42)10
//Example 2:
//
//Input:
//a = 10 
//b = 111 
//c = 25 
//d = FA
//Output:
//1010, 7, 19, 250
//Explanation:
//(10)10 = (1010)2
//(111)2 = (7)10
//(25)10 = (19)16
//(FA)16 = (250)10
//
//Your Task:
//You don't need to read input or print anything. Your task is to complete the function convert() which takes three integers a, b, c, and string d as input parameters and returns the converted numbers as an array of four strings.
//
// 
//
//
//Expected Time ComplexB <=ity: O(log(max(a,b,c)) + |d|)
//Expected Auxiliary Space: O(1)
//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Bases{
 
 static String [] convert(int a,int b,int c, String d)
 {
     // code here
     String ansA = Integer.toBinaryString(a); // returns binary String from decimal int
     int ansB = anybasetodecimal(b,2);
     String ansC = Integer.toHexString(c); // return hex from fromm decimal int
     int ansD =Integer.parseInt(d,16);   // returns decimal int from hex string
     
     String[] answerArray = new String[4];
     answerArray[0] = ansA;
     answerArray[1] = String.valueOf(ansB);

     answerArray[2] = ansC.toUpperCase();
     answerArray[3] = String.valueOf(ansD);

     return answerArray;
 }
 static long decimaltoanybase(int n, int base)
 {
     // int bit = 0;
     int pow = 1;
     long ans = 0;
     while(n>0)
     {
         int bit = n%base;
         n = n / base;
         ans = ans + bit * pow;
         pow *= 10;
     }
     return ans;
 }
 
 static int anybasetodecimal(int n, int base)
 {
     int bit = 0;
     int pow = 0;
     int ans = 0;
     while(n>0)
     {
         bit = n%10;
         ans += (Math.pow(base, pow++) * bit);
         n/=10;
     }
     return ans;
 }
 
}

//{ Driver Code Starts.
class BaseMix
{
 public static void main(String args[])throws IOException
 {
     BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(read.readLine());
     while(t-- > 0)
     {
         String S[] = read.readLine().split(" ");
         int a = Integer.parseInt(S[0]);
         int b = Integer.parseInt(S[1]);
         int c = Integer.parseInt(S[2]);
         String d = S[3];
         
         Bases ob = new Bases();
         String ans[] = ob.convert(a,b,c,d);
         
         for(int i=0;i<4;i++)
             System.out.print(ans[i]+" ");
         System.out.println();
         
     }
 }
}  // } Driver Code Ends