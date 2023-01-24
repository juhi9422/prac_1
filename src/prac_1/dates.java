package prac_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class dates {

	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now();
		System.out.println(myObj);
		LocalTime obj=LocalTime.now();
		System.out.println(obj);
		LocalDateTime myObj1 = LocalDateTime.now();
	    System.out.println(myObj1);

	}

}
