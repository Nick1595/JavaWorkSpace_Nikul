package assignmentJava_coreJava;

import java.util.ArrayList;
import java.util.Collections;

public class Q_61 {

	   public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	        
	    
	        System.out.println("ArrayList before reversing: " + numbers);
	        
	        // Reverse the ArrayList using Collections.reverse()
	        Collections.reverse(numbers);
	        
	     
	        System.out.println("ArrayList after reversing: " + numbers);
	    }
}
