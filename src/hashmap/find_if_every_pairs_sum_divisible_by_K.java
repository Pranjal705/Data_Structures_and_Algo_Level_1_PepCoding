package hashmap;
import java.util.*;

public class find_if_every_pairs_sum_divisible_by_K {
	
public static void check_If_All_Pairs_Are_Divisible_By_K(int[] arr, int k){
 		//write your code here
HashMap<Integer,Integer> rfmap = new HashMap<>();
	
 		for(int val: arr)
 		{
 		    int rem = val % k;
 		    int of = rfmap.getOrDefault(rem, 0);
 		    rfmap.put(rem, of+1);
 		}
	
 		for(int val: arr)
 		{
 		    int rem = val % k;
	    
 		    if(rem == 0)
 		    {
 		        int fq = rfmap.get(rem);
 		        if(fq % 2 == 1)
 		        {
 		            System.out.println(false);
 		            return;
 		        }
 		    }
 		  else if(2 * rem == k)
 	        {
 	            int fq = rfmap.getOrDefault(rem,0);
 	            if(fq %2 == 1)
 	            {
 	                System.out.println(false);
 	                return;
 	            }
 	        }
 	        else
 	        {
 	            int fq = rfmap.getOrDefault(rem,0);
 	            int of = rfmap.getOrDefault(k-rem,0);
 	            if(fq!=of)
 	            {
 	                System.out.println(false);
 	                return;
 	            }

 	        }
	    
 		}
 		System.out.println(true);
 	}
public static int count(int[] a, int[] b, int k){
		//write your code here
	
		return 0;		

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0 ; i < n; i++){
			a[i] = scn.nextInt();
		}
//		for(int i = 0 ; i < n; i++){
//			b[i] = scn.nextInt();
//		}
		int k = scn.nextInt();
		check_If_All_Pairs_Are_Divisible_By_K(a,k);
	}

}
