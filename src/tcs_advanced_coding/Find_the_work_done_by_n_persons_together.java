package tcs_advanced_coding;
import java.util.*;
public class Find_the_work_done_by_n_persons_together {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of persons: ");
		int n = sc.nextInt();
		
		double[] arr = new double[n];
		System.out.println("Enter work hours of each persons: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextDouble();
		}
		
		double work = 0;
		for(int i=0; i<n; i++)
		{
			work += (1/arr[i]);
		}
		
		System.out.println("Time required if all persons work together is: " + (1/work) + " days");
	}

}
