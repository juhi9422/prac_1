package prac_1;

public class String_1 {
	public void stringFun(String s) {
		
		System.out.println(s.length());
	}


	public static void main(String[] args) {
		String s="Hello"; 
//		s.length();
//		String_1 s1=new String_1();
//		s1.stringFun(s);
		char[] j=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			System.out.print(j[i]);
		}
		


	}

}

