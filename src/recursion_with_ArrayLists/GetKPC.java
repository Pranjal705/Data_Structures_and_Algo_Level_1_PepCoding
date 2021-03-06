package recursion_with_ArrayLists;
import java.util.*;
//1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
//2. The following list is the key to characters map :
//    0 -> .;
//    1 -> abc
//    2 -> def
//    3 -> ghi
//    4 -> jkl
//    5 -> mno
//    6 -> pqrs
//    7 -> tu
//    8 -> vwx
//    9 -> yz
//3. Complete the body of getKPC function - without changing signature - to get the list of all words that could be produced by the keys in str.
//Use sample input and output to take idea about output.
//
//Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
//Sample Input
//78
//Sample Output
//[tv, tw, tx, uv, uw, ux]
public class GetKPC {
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();

	    ArrayList<String> answer = getKPC(str);
	    System.out.println(answer);
	  }
	  static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx",
	                           "yz"
	                          };
	  public static ArrayList<String> getKPC(String str) {
	    if (str.length() == 0)
	    {
	      ArrayList<String> bres = new ArrayList<String>();
	      bres.add("");
	      return bres;
	    }
	    char ch = str.charAt(0);
	    int nch = ch - '0';
	    String res = str.substring(1);
	    String coch = codes[nch];
	    ArrayList<String> mres = new ArrayList<String>();
	    ArrayList<String> rres = getKPC(res);
	    for (int i = 0; i < coch.length(); i++)
	    {
	      for (String val : rres)
	      {
	        mres.add(coch.charAt(i) + val);
	      }
	    }


	    return mres;
	  }
}
