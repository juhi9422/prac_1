package prac_1;
class juhi1{
	juhi1(){
		System.out.println("I am const");
	}
	static {
		System.out.println("Juhi");
	}
	static int i=1; 
	static void dev() {
		System.out.println("I am static method");
	}
	
}
public class opp_04 {

	public static void main(String[] args) {
	
		
		juhi1 j=new juhi1();
		j.getClass();
	}
	

}
