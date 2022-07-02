package tcs_advanced_coding;

public class Check_if_a_prime_number_is_a_sum_of_two_prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 31;
		
		if(isPrime(n))
		{
			if(isPrime(n-2))
				System.out.println("true");
			else
				System.out.println("false");
				
		}
		else
		{
			System.out.println("Enter a prime number!");
		}
		
		

	}
	
	static boolean isPrime(int n)
	{
		boolean isPrime = true;
		for(int div = 2; div * div <= n; div++)
		{
			if(n%div == 0)
			{
				isPrime = false;
				return isPrime;
			}
		}
		return isPrime;
	}

}
