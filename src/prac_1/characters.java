package prac_1;

public class characters {
	
	public static void main(String[] args) {
		String sc="Juhi Gupta";
		int count=0;
		int i;
		
		char[] a=sc.toCharArray();
		for(i=0;i<sc.length();i++) {
		if(sc.charAt(i)!= ' ') {
			count++;
			
		}
		}
		System.out.println(count);
		
	
		
	
	}
	
}
