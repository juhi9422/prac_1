package prac_1;

public class Array_1 {

	public static void main(String[] args) {
//		int[] a= {0,1,2,3,4};
//		a[0]=1;
//		a[1]=2;
//		a[2]=3;
//		a[3]=4;
//		a[4]=5;
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
//		for(int i:a) {
//			System.out.println(a[i]);
//		}
		
		int[][] a={ {1,2,3},{4,5,6}};
		System.out.println(a.length);
		for(int i=0;i<2;i++) {
			for(int j = 0;j<3;j++) {
				System.out.print(a[i][j]);
				
			}
			
		}
		

	}

}
