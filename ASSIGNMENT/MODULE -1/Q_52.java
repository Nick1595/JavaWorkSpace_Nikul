package assignmentJava_coreJava;

import java.util.ArrayList;

public class Q_52 {

	 public static void main(String[] args) {

		 ArrayList<String> colors = new ArrayList<>();


		    colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("ArrayList: " + colors);

	        // Search for element "Blue"
	        String searchElement = "Blue";
	        int index = colors.indexOf(searchElement);

	        // Check if element found
	        if (index != -1) {
	            System.out.println("Element '" + searchElement + "' found at index: " + index);
	        } else {
	            System.out.println("Element '" + searchElement + "' not found in the ArrayList");
	        }
	    }
}
