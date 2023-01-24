package prac_1;

public class Array_freq {

	public static void main(String[] args) {
		int i,j,count=0;
		int[] b = new int[4];
		int[] a= {1,2,2,3,3,3};
		for(i=0;i<a.length;i++) {
			count = 1;
			for(j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count=count+1;
				}
			}
			if(b[a[i]] < count)
			b[a[i]] = count;
//			System.out.println(a[i] + " is" + count);
			
		}
		for(i = 0; i < b.length; i++) {
			System.out.println(i + " = " + b[i]);
		}

	}

}
