package strings;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("Hello");
		char ch = s.charAt(0);
		System.out.println(ch);
		
		s.setCharAt(0, 'M');
		System.out.println(s);
		
		s.insert(2, 'y');
		System.out.println(s);
		
		
		s.deleteCharAt(2);
		System.out.println(s);
		
		s.delete(2, 4);
		System.out.println(s);
		
		s.append('w');
		System.out.println(s);


	}

}
