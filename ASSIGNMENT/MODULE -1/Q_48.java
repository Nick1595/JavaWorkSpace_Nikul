package assignmentJava_coreJava;

import java.util.ArrayList;

public class Q_48 {

	 public static void main(String[] args) {

		 ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");

	        // Print the ArrayList before insertion
	        System.out.println("ArrayList before insertion: " + colors);

	        // Insert an element at the first position (index 0)
	        colors.add(0, "Yellow");

	        // Print the ArrayList after insertion
	        System.out.println("ArrayList after insertion: " + colors);
	    }
}
