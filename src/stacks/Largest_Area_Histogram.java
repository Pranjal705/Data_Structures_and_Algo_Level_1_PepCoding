package stacks;

import java.io.*;
import java.util.*;

//1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing the height of bars in a bar chart.
//3. You are required to find and print the area of largest rectangle in the histogram.
//
//e.g.
//for the array [6 2 5 4 5 1 6] -> 12

//Sample Input
//7
//6
//2
//5
//4
//5
//1
//6
//Sample Output
//12
public class Largest_Area_Histogram {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }

	    // code
	    
	    int[] rb = new int[n];
	    Stack<Integer>  st = new Stack<>();
	    rb[n-1] = n;
	    st.push(n-1);
	    
	    for(int i = n-2; i>=0; i--)
	    {
	        while(st.size() != 0 && a[st.peek()] >= a[i])
	        {
	            st.pop();
	        }
	        if(st.size() > 0)
	        {
	            rb[i] = st.peek();
	        }
	        else
	        {
	            rb[i] = n;
	        }
	        st.push(i);
	    }
	    
	    int[] lb = new int[n];
	    Stack<Integer> stack = new Stack<>();
	    
	    lb[0] = -1;
	    stack.push(0);
	    
	    for(int i=1; i<n; i++)
	    {
	        while(stack.size() !=0 && a[stack.peek()] >= a[i])
	        {
	            stack.pop();
	        }
	        if(stack.size() > 0)
	        {
	            lb[i] = stack.peek();
	        }
	        else
	        {
	            lb[i] = -1;
	        }
	        stack.push(i);
	    }
	    // area
	    
	    int max = 0;
	    
	    for(int i=0; i<n; i++)
	    {
	        int width = rb[i] - lb[i] -1;
	        int area = a[i] * width;
	        if(area > max)
	        {
	            max = area;
	        }
	    }
	    
	    System.out.println(max);
	 }
}
