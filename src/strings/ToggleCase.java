package strings;

import java.util.Scanner;

public class ToggleCase {
	public static String toggleCase(String str){
	    StringBuilder s = new StringBuilder(str);
	    for(int i=0; i<s.length(); i++)
	    {
	        char ch = s.charAt(i);
	        if(ch>='A' && ch<='Z')
	        {
	            ch = (char)(ch - 'A' + 'a');
	        }
	        else
	        {
	            ch = (char)(ch - 'a' + 'A');
	        }
	        s.setCharAt(i,ch);
	    }
	    return s.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));

	}

}
