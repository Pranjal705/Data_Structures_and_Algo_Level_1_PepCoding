package tcs_advanced_coding;
import java.util.*;
public class Find_Nth_term_in_the_mixture_of_series {
// 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187…


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int pow = 0;
		
		if(N%2== 0)
		{
			pow = (N/2)-1;
			System.out.println((int)(Math.pow(3, pow)));
		}
		else
		{
			pow = (N-1)/2;
			System.out.println((int)(Math.pow(2, pow)));
		}

	}

}
