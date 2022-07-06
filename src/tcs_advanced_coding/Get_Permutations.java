package tcs_advanced_coding;

//Permutations of a given string 
//Medium Accuracy: 49.85% Submissions: 53374 Points: 4
//Lamp
//This problem is part of GFG SDE Sheet. Click here to view more.   
//Given a string S. The task is to print all permutations of a given string in lexicographically sorted order.
//
// 
//
//Example 1:
//
//Input: ABC
//Output:
//ABC ACB BAC BCA CAB CBA
//Explanation:
//Given string ABC has permutations in 6 
//forms as ABC, ACB, BAC, BCA, CAB and CBA .
//Example 2:
//
//Input: ABSG
//Output:
//ABGS ABSG AGBS AGSB ASBG ASGB BAGS 
//BASG BGAS BGSA BSAG BSGA GABS GASB 
//GBAS GBSA GSAB GSBA SABG SAGB SBAG 
//SBGA SGAB SGBA
//Explanation:
//Given string ABSG has 24 permutations.
// 
//
//Your Task:  
//You don't need to read input or print anything. Your task is to complete the function find_permutaion() which takes the string S as input parameter and returns a vector of string in lexicographical order.
//
// 
//
//Expected Time Complexity: O(n! * n)
//
//Expected Space Complexity: O(n)
//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class Get_Permutations
{
	public static void main(String[] args) throws IOException
	{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(br.readLine().trim());
     while(t-->0)
     {
         String S = br.readLine().trim();
         Permutations obj = new Permutations();
         List<String> ans = obj.find_permutation(S);
         for( int i = 0; i < ans.size(); i++)
         {
             System.out.print(ans.get(i)+" ");
         }
         System.out.println();
                     
     }
	}
}

//} Driver Code Ends


class Permutations {
 public List<String> find_permutation(String S) {
     // Code here
     if(S.length() == 0)
     {
         List<String> bres = new ArrayList<String>();
         bres.add("");
         return bres;
     }
     List<String> mres = new ArrayList<String>();
     for(int i=0; i<S.length(); i++)
     {
         
         char ch0 = S.charAt(i);
         String lp = S.substring(0,i);
         String rp = S.substring(i+1);
         // if((lp+rp).indexOf(ch0) == -1)
         // {
             List<String> p1 = find_permutation(lp + rp);
             for(String pm : p1)
             {
                 if(!(mres.contains(ch0+pm)))
                     mres.add(ch0 + pm);
             }
         // }
         
         
     }
      Collections.sort(mres,String.CASE_INSENSITIVE_ORDER);  
     return mres;
     
 }
}
