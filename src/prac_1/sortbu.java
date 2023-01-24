package prac_1;

public class sortbu {

	public static void main(String[] args) {
		int[] a= {2,3,4,7,2};
		int temp;
		int i;
		for(i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
			}
	
		
			}
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	
		

	}

}
