package prac_1;

public class Largest {
	public static void main(String[] args) {
		int temp;

		int a[]= {5,4,3,2,1};
		for(int i=0;i<a.length-1;i++) {
			
		if(a[i]>a[i+1]) {
			temp=a[i+1];
			a[i+1]=a[i];
			a[i]=temp;
			
		}
	}	
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		System.out.println(a[a.length-1]);
	}

}