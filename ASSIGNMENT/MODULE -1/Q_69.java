package assignmentJava_coreJava;

import java.util.ArrayList;

public class Q_69 {

	
	  public static void main(String[] args) {
	        
	        ArrayList<Integer> numbers = new ArrayList<>();

	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);

	
	        System.out.println("Initial size of ArrayList: " + numbers.size());

	   
	        numbers.add(40);
	        numbers.add(50);
	        numbers.add(60);

	     
	        System.out.println("Updated size of ArrayList: " + numbers.size());

	
	        System.out.println("Elements in ArrayList:");
	        for (Integer number : numbers) {
	            System.out.println(number);
	        }
	    }
}
