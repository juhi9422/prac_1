package prac_1;

public class PrimeNum {

	public static void main(String[] args) {
		int n,i,m,flag=0;
		n=6;
		m=n/2;
		if(n==0||n==1) {
			System.out.println("not prime");
		}
		else {
			for(i=2;i<m;i++) {
				if(n%i==0) {
					System.out.println("not prime");
					flag=1;
					break;
					
				}
				flag=0;
			}
			if(flag==0) {
				System.out.println("prime");
				
			}
		}

	}

}








