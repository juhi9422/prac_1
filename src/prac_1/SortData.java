package prac_1;

public class SortData {

	public static void main(String[] args) {
		int[] a= {5,4,3,24,1};
		int temp;
		int i;
		for(int k=0;k<a.length-1;k++) {
			for(i=0;i<a.length-1;i++) {
			
			 if(a[i]>a[i+1]) {
				temp=a[i+1];
				a[i+1]=a[i];
				a[i]=temp;
				
			}
		}	
			
		}
		for(i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
//		System.out.println(a[a.length-1]);

	}

}
