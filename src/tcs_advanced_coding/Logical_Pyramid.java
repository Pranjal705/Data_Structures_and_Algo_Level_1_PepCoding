package tcs_advanced_coding;
//6, 28, 66, 120, 190, 276

public class Logical_Pyramid {

	public static void main(String[] args) {
		
		int n = 5;
		int x = 2;
		for(int i=1; i<=n; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print((x*(2*x-1)) + " ");
				x++;
			}
			System.out.println();
		}

	}

}
