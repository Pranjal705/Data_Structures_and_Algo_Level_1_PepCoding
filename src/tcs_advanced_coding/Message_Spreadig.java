package tcs_advanced_coding;
//Message Spreading 
//Basic Accuracy: 60.19% Submissions: 902 Points: 1
//There are N students in a class, each in possession of a different funny story. 
//
//They want to share funny stories with each other by sending electronic messages. Assume that a sender includes all the funny stories he or she knows at the time the message is sent and that a message may only have one addressee. What is the minimum number of messages they need to send to guarantee that every one of them gets all the funny stories?
//
// 
//
//Example 1:
//
//Input:
//2
//Output:
//2
//Explanation:
//Person 1 sends a message to 
//Person 2, Person 2 sends
//message to Person 1.
//A total of 2 messages are sent.
// 
//
// 
//
//Example 2:
//
//Input:
//1
//Output:
//0
//Explanation:
//No messages are sent.

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Message_Spreadig
{
 public static void main(String args[])throws IOException
 {
     BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(read.readLine());
     while(t-- > 0)
     {
         int N = Integer.parseInt(read.readLine());

         A ob = new A();
         System.out.println(ob.minimumMessages(N));
     }
 }
}// } Driver Code Ends


//User function Template for Java
class A{
 static int minimumMessages(int N){
     // code here
     int messagesSent = 2*N -2;
     return messagesSent;
 }
}