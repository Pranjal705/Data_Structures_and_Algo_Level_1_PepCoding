package tcs_advanced_coding;

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */
//Excel Sheet | Part - 2 
//Easy Accuracy: 65.27% Submissions: 2722 Points: 2
//Given a string S that represents column title of an Excel sheet, find the number that represents that column.
//In excel A column is number 1, AA is 27 and so on.
//
//Example 1:
//
//Input:
//S = A
//Output: 1
//
//Example 2:
//
//Input:
//S = AA
//Output: 27
import java.io.*;
import java.util.*;

public class Excel_Sheet_Part2 {
 public static void main (String[] args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine());
 
	    while(t > 0){
	        String s = br.readLine();
	        ColumnNameToNumber T = new ColumnNameToNumber();
	        
	        System.out.println(T.excelColumnNumber(s));
	        
         t--;
	    }
	}
 
}// } Driver Code Ends


//User function Template for Java

class ColumnNameToNumber {
 public int excelColumnNumber(String s) {
     // Code here
     int result = 0;
     int factor = 1;
     for(int i=s.length() -1; i>=0; i--)
     {
         char slast= s.charAt(i);
         int nlast = ((int)slast - (int)('A')) + 1;
         result += (nlast*factor);
         factor *= 26;
         
     }
     return result;
 }
}
