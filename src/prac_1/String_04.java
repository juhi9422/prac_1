package prac_1;

import java.util.Scanner;

public class String_04 {
//	int i,j;

	public static void main(String[] args) {
		String s="Hello";
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		char[] a=new char[n];
		for(int i=0;i<n;i++) {
			{
				a[i]=sc.next().charAt(0);
				
			}
		}
		String str = String.copyValueOf(a);
			System.out.print(s+ " " +str);
		
		
	}

}
