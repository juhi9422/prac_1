package prac_1;
class Triangle{
	public int tri(int a,int b,int c) {
		int d=a*b*c;
		return d;
	}
}
public class opp_08 {

	public static void main(String[] args) {
		Triangle t=new Triangle();
		System.out.println(t.tri(1, 2, 3));	
	}

}
