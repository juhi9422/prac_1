package prac_1;

public class prac_032 {
	
	public static void main(String[]args) {
		
	int n=0,n2=1,n3,c=10;
	System.out.print(n + " " + n2);
	for(int i=2;i<c;++i) {
		n3=n2+n;
		System.out.print(" " + n3);
		n=n2;
	    n2=n3;
		
	}
}
}