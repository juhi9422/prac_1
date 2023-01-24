package prac_1;

public class Plalindrome {

	public static void main(String[] args) {
		int num,temp,rev=0,i,j;
		num=45534;
		temp=num;
		while(num>0) {
			i=num%10;
			rev=(rev*10)+i;
			num=num/10;
		}
		if(rev==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println(" not Palindrome");
		}

	}

}
