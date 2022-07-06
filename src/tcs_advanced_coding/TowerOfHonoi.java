package tcs_advanced_coding;
//Tower Of Hanoi 
//Medium Accuracy: 47.35% Submissions: 73855 Points: 4
//Lamp
//This problem is part of GFG SDE Sheet. Click here to view more.   
//The tower of Hanoi is a famous puzzle where we have three rods and N disks. The objective of the puzzle is to move the entire stack to another rod. You are given the number of discs N. Initially, these discs are in the rod 1. You need to print all the steps of discs movement so that all the discs reach the 3rd rod. Also, you need to find the total moves.
//Note: The discs are arranged such that the top disc is numbered 1 and the bottom-most disc is numbered N. Also, all the discs have different sizes and a bigger disc cannot be put on the top of a smaller disc. Refer the provided link to get a better clarity about the puzzle.
//
//Example 1:
//
//Input:
//N = 2
//Output:
//move disk 1 from rod 1 to rod 2
//move disk 2 from rod 1 to rod 3
//move disk 1 from rod 2 to rod 3
//3
//Explanation: For N=2 , steps will be
//as follows in the example and total
//3 steps will be taken.
//Example 2:
//
//Input:
//N = 3
//Output:
//move disk 1 from rod 1 to rod 3
//move disk 2 from rod 1 to rod 2
//move disk 1 from rod 3 to rod 2
//move disk 3 from rod 1 to rod 3
//move disk 1 from rod 2 to rod 1
//move disk 2 from rod 2 to rod 3
//move disk 1 from rod 1 to rod 3
//7
//Explanation: For N=3 , steps will be
//as follows in the example and total
//7 steps will be taken.
//Your Task:
//You don't need to read input or print anything. You only need to complete the function toh() that takes following parameters: N (number of discs), from (The rod number from which we move the disc), to (The rod number to which we move the disc), aux (The rod that is used as an auxiliary rod) and prints the required moves inside function body (See the example for the format of the output) as well as return the count of total moves made. The total number of moves are printed by the driver code.
//Please take care of the case of the letters.
//
//Expected Time Complexity: O(2N).
//Expected Auxiliary Space: O(N).
//import java.io.*;
import java.util.*;
public class TowerOfHonoi {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int T = sc.nextInt();//total testcases
     while (T-- > 0) {
         Hanoi obj = new Hanoi();
         int N;
         
         //taking input N
         N = sc.nextInt();

         //calling toh() method 
         System.out.println(obj.toh(N, 1, 3, 2));
     }
 }
}

class Hanoi {

 public long toh(int N, int a, int b, int c) {
     // Your code here
     if(N==0)
     {
         return 0;
     }
     
     long n1 = toh(N-1, a, c, b);
     System.out.println("move disk " + N + " from rod " + a + " to rod " + b);
     long n2 = toh(N-1, c, b, a);
     return 1 + n1 + n2;
 }
}
