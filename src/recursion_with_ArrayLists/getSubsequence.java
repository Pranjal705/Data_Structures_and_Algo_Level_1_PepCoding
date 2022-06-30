package recursion_with_ArrayLists;
import java.util.*;

//1. You are given a string str.
//2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
//Use sample input and output to take idea about subsequences.
//
//Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
//Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
//Sample Input
//abc
//Sample Output
//[, c, b, bc, a, ac, ab, abc]
public class getSubsequence {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        ArrayList<String> ss = new ArrayList<String>();
        ss = gss(str);
        System.out.println(ss);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0)
        {
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }
        ArrayList<String> mres = new ArrayList<String>();
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> rros = gss(ros);
        for(String s: rros)
        {
            mres.add("" + s);
        }
        for(String s: rros)
        {
            mres.add(ch + s);
        }
        return mres;
    }

}
