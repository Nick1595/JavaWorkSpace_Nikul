package assignmentJava_coreJava;

import java.util.ArrayList;
import java.util.Collections;

public class Q_64 {

	 public static void main(String[] args) {

		 ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        System.out.println("ArrayList before swapping: " + colors);

	        // Swap elements at indices 1 and 3 (0-based indexing)
	        Collections.swap(colors, 1, 3);

	        // Print the ArrayList after swapping
	        System.out.println("ArrayList after swapping: " + colors);
	    }
}
