package prac_1;
abstract class ab1{
	abstract void ab_fun_1();
	public void fun_2() {
		System.out.println("This is class ab1 function");
	}
	

}
class ab2 extends ab1{

	void ab_fun_1() {
		System.out.println("This is abstraction");
		
	}
	
}
public class Opp_05 {

	public static void main(String[] args) {
		ab2 a=new ab2();
		a.ab_fun_1();
		a.fun_2();

	}

}
