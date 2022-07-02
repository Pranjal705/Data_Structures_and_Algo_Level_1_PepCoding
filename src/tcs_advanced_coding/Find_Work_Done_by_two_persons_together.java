package tcs_advanced_coding;
import java.util.*;
public class Find_Work_Done_by_two_persons_together {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// work done by A in h1 hours
		double h1 = sc.nextInt();
		// work done by B in h2 hours
		double h2 = sc.nextInt();
		
		// hours required if they work together to complete the work
		double hours = (double)((h1*h2)/(h1 + h2));
		System.out.println(hours);
	}

}
