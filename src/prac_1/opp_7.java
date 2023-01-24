package prac_1;
interface  animal1{
	public void a1();
	public void a2();
}

class pig implements animal1{


	public void a1() {
		System.out.println("This is implement 1");
	}


	public void a2() {
		System.out.println("This is implement 2");
	}
	

}
public class opp_7 {
	public static void main(String[] args) {
		pig p=new pig();
		p.a1();
		p.a2();
	}

	

}
