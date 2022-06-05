package strings;

// Performance comparison of String and StringBuilder
public class StringbuilderPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100000;
		
		long start = System.currentTimeMillis();
		String s = "";
		for(int i=0; i<n; i++)
		{
			s+= i;
		}
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println(duration);

		long start1 = System.currentTimeMillis();
		StringBuilder s1 = new StringBuilder();
		for(int i=0; i<n; i++)
		{
			s1.append(i);
		}
		
		long end1 = System.currentTimeMillis();
		long duration1 = end1 - start1;
		System.out.println(duration1);
		
		

	}

}
