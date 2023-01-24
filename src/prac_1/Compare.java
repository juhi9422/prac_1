package prac_1;

import java.util.Arrays;

public class Compare {

	public static void main(String[] args) {
		int i=0,count=0;
		int[] a= {1,2,3};
		int[] b= {1,5,3};
//		if(Arrays.equals(a,b)) {
//			System.out.println("same");
//		}else {
//			System.out.println("juhi");
//		}
		
		for(i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				count=count+1;
				
			}
			
		}
		if(count==a.length) {
			System.out.println("Same");
		}else {
			System.out.println("Not Same");
		}

	}

}
