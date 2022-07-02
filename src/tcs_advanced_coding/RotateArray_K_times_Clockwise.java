package tcs_advanced_coding;

public class RotateArray_K_times_Clockwise {
	public static void main (String[] args) {
		int[] arr = { 10, 20, 30, 40, 50};
		int k = 2;
		rotateArray(arr, arr.length, k);
		for(int i=0; i<arr.length; i++)
		{
		    System.out.println(arr[i]);
		}
		
	}
	static void rotateArray(int[] arr, int n, int k)
	{
	    int[] ans = new int[k];
	    
	    // adding last k elements to another array
	    int count = 0;
	    for(int i=n-k; i<n; i++)
	    {
	        ans[count] = arr[i];
	        count++;
	    }
	    // right shifting remaining  elements
	    for(int i=n-1; i>=k; i--)
	    {
	        arr[i] = arr[i-k];
	    }
	    
	    // copying last k elements to first k positions
	    for(int i=0; i<k; i++)
	    {
	        arr[i] = ans[i];
	    }
	}
}
