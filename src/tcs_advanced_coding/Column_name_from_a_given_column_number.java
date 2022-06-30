package tcs_advanced_coding;


//{ Driver Code Starts
//Initial Template for Java
//Column name from a given column number 
//Medium Accuracy: 52.08% Submissions: 5456 Points: 4
//Given a positive integer, return its corresponding column title as appear in an Excel sheet.
//Excel columns has a pattern like A, B, C, … ,Z, AA, AB, AC,…. ,AZ, BA, BB, … ZZ, AAA, AAB ….. etc. In other words, column 1 is named as “A”, column 2 as “B”, column 27 as “AA” and so on.
//
//Example 1:
//
//Input:
//N = 28
//Output: AB
//Explanation: 1 to 26 are A to Z.
//Then, 27 is AA and 28 = AB.
//
//â€‹Example 2:
//
//Input: 
//N = 13
//Output: M
//Explanation: M is the 13th character of
//alphabet.
import java.io.*;
import java.util.*;
import java.lang.*; 
public class Column_name_from_a_given_column_number
{
 public static void main (String[] args)
 {
     
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     
     while(t-- > 0)
     {
         long n = sc.nextLong();
 		System.out.println (new ColumnNumberToName().colName (n));
     }
     
 }
}

class ColumnNumberToName
{
 String colName (long n)
 {
     StringBuilder str = new StringBuilder();
     while(n > 0)
     {
         long rem = n % 26;
         if(rem == 0)
         {
             str.append("" + 'Z');
             n = (n / 26) -1;
         }else
         {
             str.append((char)('A' + (rem-1)));
             n = (n/26);
         }
     }
     return str.reverse().toString();
 }
}
