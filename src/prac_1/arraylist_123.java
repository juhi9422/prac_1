package prac_1;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist_123 {
public static void main(String[] args) {
	 ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(10);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(25);
	    
	    Collections.sort(myNumbers);
	    for (int i : myNumbers) {
	      System.out.println(i);
}

}}
