package prac_1;

 class animal {	
	 public void animalsound() {
		 System.out.println("animal wow");
	 }
}
 
 class dog extends animal{
	 public void animalsound() {
		 System.out.println("dog wow");
	 }
 }
 class cat extends animal{
	 public void animalsound() {
		 System.out.println("cat wow");
	 }
 }
public class Opp_03 {

	public static void main(String[] args) {
		animal a=new animal();
		dog d=new dog();
		cat c=new cat();
		
		a.animalsound();
		d.animalsound();
		c.animalsound();

	}

}
