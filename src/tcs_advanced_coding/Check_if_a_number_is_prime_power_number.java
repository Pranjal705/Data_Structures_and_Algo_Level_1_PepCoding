package tcs_advanced_coding;

public class Check_if_a_number_is_prime_power_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 625;
		int primeType = 0;
		for(int div = 2; div<= n; div ++)
		{
			if(n%div == 0)
			{
				primeType++;
				if(primeType > 1)
				{
					System.out.println("No");
					return;
				}
				while(n % div == 0)
				{
					n /= div;
				}
			}
			
		}
		System.out.println("Yes");

	}

}
