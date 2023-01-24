package prac_1;

public class Reverse_array {

	public static void main(String[] args) {
		int i,j = 0;
		int[] a= {1,2,3,4};
		int[] b = new int[4];
		for(i=a.length-1,j=0;i>0;i--,j++) {
			 {
				b[j]=a[i];
		}

	}
		for(j=0;j<b.length;j++)
		System.out.println(b[j]);

}}
