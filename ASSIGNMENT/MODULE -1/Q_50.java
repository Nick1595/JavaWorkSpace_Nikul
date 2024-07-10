// Write a Java program to update specific array element by given element. 

package assignmentJava_coreJava;

import java.util.ArrayList;

public class Q_50 {

	
	  public static void main(String[] args) {

		  ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("ArrayList before updating: " + colors);

	        // Update element at index 1 (second element)
	        int index = 1;
	        String newColor = "Purple";
	        if (index >= 0 && index < colors.size()) {
	            colors.set(index, newColor);
	            System.out.println("Updated element at index " + index + " to: " + newColor);
	        } else {
	            System.out.println("Index " + index + " is out of bounds");
	        }

	        // Print the ArrayList after updating
	        System.out.println("ArrayList after updating: " + colors);
	    }
}
