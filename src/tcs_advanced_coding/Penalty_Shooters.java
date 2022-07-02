package tcs_advanced_coding;
import java.util.*;
public class Penalty_Shooters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		
		List<Integer> ans = new ArrayList<Integer>();
		ans = goals(X, Y, Z);
		System.out.println(ans);
		

	}
	static List<Integer> goals(int X, int Y, int Z)
    {

		ArrayList<Integer> aL = new ArrayList<>();
	       int a = 0 , b = 0;
	       while(Z > 1)
	       {
	           if(X % Z == 0)
	           {
	               ++a;
	               --X;
	           }
	           else if(Y % Z == 0)
	           {
	               ++b;
	               --Y;
	           }
	           else
	               --Z;
	       }
	       aL.add(a);
	       aL.add(b);
	       return aL;
        
    }
	

}
