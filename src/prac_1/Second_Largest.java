package prac_1;

import java.util.Arrays;
import java.util.Collections;

public class Second_Largest {

	public static void main(String[] args) {
		
		int[] a= {5,4,3,2,1};
		/*
		 *  int temp,k,i; for(k=0;k<a.length-1;k++){
		 * for(i=0;i<a.length-1;i++) { if(a[i]>a[i+1]) { temp=a[i]; a[i]=a[i+1];
		 * a[i+1]=temp; } }
		 * 
		 * }
		 */
		Arrays.sort(a);
		
		System.out.println(a[a.length-2]);
	}

}
