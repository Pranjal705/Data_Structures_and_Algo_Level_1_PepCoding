package tcs_advanced_coding;
//Faithful Numbers 
//Easy Accuracy: 57.29% Submissions: 2466 Points: 2
//A number is called faithful if you can write it as the sum of distinct powers of 7. 
//e.g.,  2457 = 7 + 72 + 74 . If we order all the faithful numbers, we get the sequence 1 = 70, 7 = 71, 8 = 70 + 71, 49 = 72, 50 = 70 + 72 . . . and so on.
//Given some value of N, you have to find the N'th faithful number.
//
// 
//
//Example 1:
//
//Input:
//N = 3
//Output:
//8
//Explanation:
//8 is the 3rd Faithful number.
//Example 2:
//
//Input:
//N = 7
//Output:
//57
//Explanation:
//57 is the 7th Faithful number.
// 
//
//Your Task:
//You don't need to read input or print anything. Your task is to complete the function nthFaithfulNum() which takes an Integer N as input and returns the answer.
//
// 
//
//Expected Time Complexity: O(log(N))
//Expected Auxiliary Space: O(log(N))
import java.io.*;
import java.util.*;

class Faithful_Number {
 public static void main(String args[]) throws IOException {
     BufferedReader read =
         new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(read.readLine());
     while (t-- > 0) {
         int N = Integer.parseInt(read.readLine());

         Faithful ob = new Faithful();
         System.out.println(ob.nthFaithfulNum(N));
     }
 }
}// } Driver Code Ends


//User function Template for Java

class Faithful {
 static Long nthFaithfulNum(int N) {
    // code here
    String binaryS = Integer.toBinaryString(N);
    int power = 0;
    Long sum = 0L;
    for(int i=binaryS.length()-1; i>=0; i--)
    {
        int bit =Character.getNumericValue(binaryS.charAt(i));
        sum += (long)((Math.pow(7,power))*bit);
        power++;
    }
    
    return sum;
    
 }
};